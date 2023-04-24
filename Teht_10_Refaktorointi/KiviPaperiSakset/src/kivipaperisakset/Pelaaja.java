
package kivipaperisakset;

/**
 * Tämä luokka edustaa pelaaja kivi-paperi-sakset -pelissä Pitää kirjaa pelaajan
 * voittojen määrästä
 * 
 * @author Ira Dook
 */
public class Pelaaja {

	private int voitot; // Voittojen lukumäärä

	/**
	 * Alustaa voittojen lukumäärän nollaan
	 */
	public Pelaaja() {
		voitot = 0;
	}

	/**
	 * Valitse randomilla kivi, paperi tai sakset
	 * 
	 * @return pelaajan valinnan (kivi, paperi tai sakset) merkkijonona
	 */
	public String pelaajanValinta() {
		String valinta = "";
		int c = (int) (Math.random() * 3);
		switch (c) {
		case 0:
			valinta = ("kivi");
			break;
		case 1:
			valinta = ("paperi");
			break;
		case 2:
			valinta = ("sakset");
			break;
		default:
			System.err.println("Invalid number");
		}
		return valinta;
	}

	/**
	 * Kasvata voittojen määrää yhdellä
	 */
	public void setVoitot() {
		voitot += 1;
	}

	/**
	 * Palauttaa voittojen määrän pelaajalle
	 * 
	 * @return voittojen määrä pelaajalle
	 */
	public int getVoitot() {
		return voitot;
	}
}
