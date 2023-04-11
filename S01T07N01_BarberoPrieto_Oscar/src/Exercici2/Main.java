package Exercici2;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
		TreballadorOnline treballador2 = new TreballadorOnline("Maria", "Aranza DelValle", 62);
		TreballadorPresencial treballador3 = new TreballadorPresencial("Ariadna", "Navarro Gónzalez", 23);

		treballador2.baixa();
		treballador2.alta();
		
		treballador3.vacances();
		treballador3.asumptesPropis();
	}
}
