package Exercici1;

public class Main {

	public static void main(String[] args) {

		Treballador treballador1 = new Treballador("Antoni", "López Gimeno", 44);
		TreballadorOnline treballador2 = new TreballadorOnline("Maria", "Aranza DelValle", 62);
		TreballadorPresencial treballador3 = new TreballadorPresencial("Ariadna", "Navarro Gónzalez", 23);

		double sou1 = treballador1.calcularSou(160);
		double sou2 = treballador2.calcularSou(160);
		double sou3 = treballador3.calcularSou(160);

		System.out.println("Salari mensual : " + sou1);
		System.out.println("Salari mensual : " + sou2);
		System.out.println("Salari mensual : " + sou3);
	}
}
