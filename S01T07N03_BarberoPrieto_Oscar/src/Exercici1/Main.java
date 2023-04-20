package Exercici1;

import java.lang.annotation.Annotation;

public class Main {

	public static void main(String[] args) {

		Persona person = new Persona();

		// Aplica Java Reflection per accedir a les dades de l'objecte persona
		Class<?> p = person.getClass();
		// Crea un array d' Annotation per guardar les anotacions de l'objecte
		Annotation[] anotacio = p.getAnnotations();
		// Recorrem l'array
		for (Annotation elements : anotacio) {
			System.out.println(elements.toString());

		}
	}
}