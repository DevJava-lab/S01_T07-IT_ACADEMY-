package Exercici1;

public class TreballadorOnline extends Treballador {

	private final static double TARIFA_INTERNET = 50.20;
	
	public TreballadorOnline(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
	}

	@Override
	public double calcularSou(double horesTreballades)
	{
		return  super.calcularSou(horesTreballades)+TARIFA_INTERNET;
	}
}
