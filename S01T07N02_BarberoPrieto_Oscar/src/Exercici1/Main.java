package Exercici1;

import java.io.*;
import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {

		Persona person = new Persona();
		person.setNom("Minerva");
		person.setEdat(46);

		try {

			// Obtenir objecte class.
			Class<Persona> cPersona = Persona.class;
			// Obtenir anotació de la clase.
			SaveInFile annotation = cPersona.getAnnotation(SaveInFile.class);
			// Obtenir valor de l'anotació.
			String path = annotation.value();

			PrintWriter out = new PrintWriter(new FileWriter(path));

			Gson gson = new Gson();
			String json = gson.toJson(person);
			out.write(json);
			out.close();

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}

	}

}
