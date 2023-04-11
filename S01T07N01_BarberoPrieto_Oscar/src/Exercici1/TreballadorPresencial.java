package Exercici1;

public class TreballadorPresencial extends Treballador {

	private static double benzina = 1.45;

	public TreballadorPresencial(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora); 
	}

	@Override
	public double calcularSou(double horesTreballades)
	{
		return  super.calcularSou(horesTreballades)+benzina;
	}

}
