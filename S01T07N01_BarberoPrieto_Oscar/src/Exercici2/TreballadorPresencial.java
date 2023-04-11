package Exercici2;

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

	@Deprecated
	public void vacances() {

	}

	@Deprecated
	public void asumptesPropis() {

	}
}
