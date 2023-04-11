package Exercici1;

@SaveInFile(value="json/arxiu.json")
public class Persona {
	
	private String nom;
	private int edat;
	
	public Persona() {
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	
	

}
