package Exercici2;

public class Treballador {
	
	private String nom;
	private String cognom;
	private double preuHora;
	
	public Treballador(String nom, String cognom, double preuHora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}
	
	public double calcularSou(double horesTreballades)
	{
		return  horesTreballades*preuHora;
	}
}
