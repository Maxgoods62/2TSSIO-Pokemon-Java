package controller;

import model.Pokemon;

public class AttaqueGestion {
	
	public static void GestionAttaque(Pokemon pPokemon1, Pokemon pPokemon2, float attaque) {
		
		if (pPokemon1 != pPokemon2) {
			
			float energieAvantAttaque = pPokemon1.getEnergie();
			float energieApresAttaque = (attaque > energieAvantAttaque) ? (float)0 : (energieAvantAttaque - attaque);
			pPokemon1.setEnergie(energieApresAttaque);
			
			System.out.println(pPokemon1.getNom() + " a " + energieAvantAttaque + " energie. " + pPokemon2.getNom() + " vient de l'attaquer en lui faisant " + attaque +" dégats.");
			
			if (energieAvantAttaque > attaque) {
				System.out.println(pPokemon1.getNom() + " a maintenant " + energieApresAttaque + " energie." );
			} else {
	
				System.out.println(pPokemon1.getNom() + " est maintenant KO. " );
			}
		} 
		
		else {
			System.out.println(pPokemon1.getNom() + " a essayé de s'attaquer lui même ! Ce n'est pas très efficace...");
		}
		
		
	}
	

}
