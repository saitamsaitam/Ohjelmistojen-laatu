package kivipaperisakset;

/**
 * Kivi-paperi-sakset -pelin pääluokka
 * 
 * Luo kaksi instanssia pelaaja luokasta, jotka edustaa pelaajia. Sen jälkeen
 * peli pyörii loopilla niin kauan kunnes toinen pelaajista pääsee kolmeen
 * voittoon. Jokaisella kierroksella pelaajat valitsevat satunnaisesti kiven,
 * paperin tai sakset, ja voittaja määritetään pelin sääntöjen mukaan. Jokaisen
 * kierroksen jälkeen voittojen ja tasapelien määrä tulostetaan konsoliin.
 * 
 * @author Ira Dook
 */
public class Peli {

	public static int pelatutPelit = 1; // Pelattujen pelien lkm. Alustetaan ykköseksi koska peli alkaa erästä yksi
	public static int tasapelit = 0; // Tasapelien lkm

	public static void main(String args[]) {

		Pelaaja p1 = new Pelaaja();
		Pelaaja p2 = new Pelaaja();

		boolean peliLoppui = false;

		String p1Valinta;
		String p2Valinta;

		do {
			System.out.println("===================== " + "Erä: " + pelatutPelit + " =====================\n");
			System.out.println("Tasapelien lukumäärä: " + tasapelit);
			System.out.println("Pelaaja 1:llä koossa " + p1.getVoitot() + " voittoa.");
			System.out.println("Pelaaja 2:llä koossa " + p2.getVoitot() + " voittoa.\n");

			p1Valinta = p1.pelaajanValinta();
			p2Valinta = p2.pelaajanValinta();

			System.out.println("Pelaaja 1 valitsi : " + p1Valinta);
			System.out.println("Pelaaja 2 valitsi : " + p2Valinta + "\n");

			// Allaolevassa pätkässä on yritetty eri tapoja saada
			// lukumäärän laskeminen toimimaan oikein.
			// Ei tää kyllä vieläkään skulaa - KORJAA!

			if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("paperi"))) {
				System.out.println("*** Pelaaja 2 voittaa ***\n");
				p2.setVoitot();
			} else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("kivi"))) {
				System.out.println("*** Pelaaja 1 voittaa ***\n");
				p1.setVoitot();
			} else if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("sakset"))) {
				System.out.println("*** Pelaaja 1 voittaa ***\n");
				p1.setVoitot();
			} else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("kivi"))) {
				System.out.println("*** Pelaaja 2 voittaa ***\n");
				p2.setVoitot();
			} else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("paperi"))) {
				System.out.println("*** Pelaaja 1 voittaa ***\n");
				p1.setVoitot();
			} else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("sakset"))) {
				System.out.println("*** Pelaaja 2 voittaa ***\n");
				p2.setVoitot();
			}
			if (p1Valinta.equals(p2Valinta)) {
				tasapelit++;
				System.out.println("*** Tasapeli ***\n");
			}
			pelatutPelit++;
			if ((p1.getVoitot() >= 3) || (p2.getVoitot() >= 3)) {
				peliLoppui = true;
				System.out.println("\t KOLME VOITTOA - PELI PÄÄTTYY ");
			}
			System.out.println();
		} while (peliLoppui != true);
	}
}
