package com.simplilearn.mavenproject;


public interface IHinnoittelija {
	public abstract float getAlennusProsentti(Asiakas asiakas, Tuote tuote);
	public abstract void aloita();
	public abstract float setAlennusProsentti(Asiakas asiakas, double prosentti);
	public abstract void lopeta();
}
