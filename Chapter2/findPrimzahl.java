public class findPrimzahl {
	public static boolean istPrimzahl(int zahl) {
		boolean istPrimzahl = true; //initialer Wert

			for (int teiler = 2; teiler < zahl & istPrimzahl; teiler++) {
				if (zahl % teiler == 0) {
					istPrimzahl = false;
				}
			}

		return istPrimzahl;
	}

	public static void main(String[] s) {

		//Test
		System.out.println( istPrimzahl(2) );
		System.out.println( istPrimzahl(41) );
		System.out.println( istPrimzahl(41 * 17));

		// Erweiterer Test
		for (int zahl = 2000000000; zahl <= 2000000100; zahl++) {
			if (istPrimzahl(zahl)) {
				System.out.println( zahl );
			}
		}
	}
}