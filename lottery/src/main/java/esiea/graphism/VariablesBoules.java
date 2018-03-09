package esiea.graphism;

import java.util.Random;

public class VariablesBoules {

	public int GenRandom() {
		Random r = new Random();
		int valeur = 1 + r.nextInt(50 - 1);
		return valeur;
	}
	
	public int EtoileRandom() {
		Random r = new Random();
		int valeur = 1 + r.nextInt(12 - 1);
		return valeur;
	}
	
}
