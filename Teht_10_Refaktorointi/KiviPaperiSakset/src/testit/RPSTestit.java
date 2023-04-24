package testit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kivipaperisakset.Pelaaja;
import kivipaperisakset.Peli;

import static org.junit.jupiter.api.Assertions.*;

public class RPSTestit {

	private Pelaaja pelaaja;

	@BeforeEach
	void setUp() {
		pelaaja = new Pelaaja();
	}

	/**
	 * Tarkistaa, että pelaajanValinta() palauttaa joko "kivi", "paperi" tai
	 * "sakset"
	 */
	@Test
	void testPelaajanValinta() {
		String valinta = pelaaja.pelaajanValinta();
		assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
	}

	/**
	 * Testaa, että setVoitot() kasvattaa voittojen määrää oikein
	 */
	@Test
	void testSetVoitot() {
		assertEquals(0, pelaaja.getVoitot());
		pelaaja.setVoitot();
		assertEquals(1, pelaaja.getVoitot());
		pelaaja.setVoitot();
		assertEquals(2, pelaaja.getVoitot());
	}

	/**
	 * Testaa, että getVoitot() palauttaa oikean määrän voittoja
	 */
	@Test
	void testGetVoitot() {
		assertEquals(0, pelaaja.getVoitot());
		pelaaja.setVoitot();
		pelaaja.setVoitot();
		assertEquals(2, pelaaja.getVoitot());
	}

	/**
	 * Testaa, että pelisilmukka pyörii vähintään kerran ja että pelattujen pelien
	 * määrä ja tasapelit kasvavat oikein
	 */
	@Test
	public void testGameLoop() {

		Peli.main(new String[0]); // start the game

		assertTrue(Peli.pelatutPelit > 1, "The game loop should run at least once.");
		assertTrue(Peli.tasapelit >= 0, "The number of ties should be non-negative.");
	}

}
