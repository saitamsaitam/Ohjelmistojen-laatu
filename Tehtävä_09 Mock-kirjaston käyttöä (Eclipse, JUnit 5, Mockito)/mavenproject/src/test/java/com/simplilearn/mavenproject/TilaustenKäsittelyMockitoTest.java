package com.simplilearn.mavenproject;

import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TilaustenKäsittelyMockitoTest {

	@Mock
	IHinnoittelija hinnoittelijaMock;

	@Mock
	private Asiakas asiakas;

	@Mock
	private Tuote tuote;

	@Before
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}


	@Test
	public void testKasitteleWhenPriceIsLessThan100() {
		float alkuSaldo = 100f;
		float tuoteHinta = 99f;
		float alennus = 50f;
		float loppuSaldo = alkuSaldo - (tuoteHinta * (1 - alennus / 100));
		Asiakas asiakas = new Asiakas(alkuSaldo);
		Tuote tuote = new Tuote("TDD in Action", tuoteHinta);

		when(hinnoittelijaMock.getAlennusProsentti(asiakas, tuote)).thenReturn(alennus);

		TilaustenKäsittely käsittelijä = new TilaustenKäsittely();
		käsittelijä.setHinnoittelija(hinnoittelijaMock);
		käsittelijä.käsittele(new Tilaus(asiakas, tuote));

		verify(hinnoittelijaMock).aloita();
		verify(hinnoittelijaMock, never()).setAlennusProsentti(asiakas, 10f);
		verify(hinnoittelijaMock).lopeta();
		assertEquals(loppuSaldo, asiakas.getSaldo(), 0.001);

	}

	@Test
	public void testKasitteleWhenPriceIsMoreThan100() {
		float alkuSaldo = 200f;
		float tuoteHinta = 110f;
		float alennus = 5f;
		float loppuSaldo = alkuSaldo - (tuoteHinta * (1 - (alennus + 5) / 100));

		Asiakas asiakas = new Asiakas(alkuSaldo);
		Tuote tuote = new Tuote("TDD in Action", tuoteHinta);

		when(hinnoittelijaMock.getAlennusProsentti(asiakas, tuote)).thenReturn(alennus);

		TilaustenKäsittely käsittelijä = new TilaustenKäsittely();
		käsittelijä.setHinnoittelija(hinnoittelijaMock);
		käsittelijä.käsittele(new Tilaus(asiakas, tuote));
		System.out.println(loppuSaldo);

		verify(hinnoittelijaMock).aloita();
		verify(hinnoittelijaMock).lopeta();
		verify(hinnoittelijaMock).setAlennusProsentti(asiakas, 10f);
		assertEquals(loppuSaldo, asiakas.getSaldo(), 0.01f);
	}

}
