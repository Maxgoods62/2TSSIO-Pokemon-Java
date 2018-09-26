package model;

import controller.AttaqueGestion;

public class Pokemon {
	
	protected String nom;
	protected double energie;
	protected double poids;
	protected Dresseur monDresseur;
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getEnergie() {
		return energie;
	}
	public void setEnergie(double energie) {
		this.energie = energie;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	
	public Pokemon(String pNom, double pEnergie, double pPoids) {
		this.nom = pNom;
		this.energie = pEnergie;
		this.poids = pPoids;
	}
	
	public String toString() {
		return "Pokemon [nom=" + nom + ", energie=" + energie + ", poids=" + poids + "]";
	}
	
	
	public void attaque(Pokemon pPokemon1, Pokemon pPokemon2, double attaque) {
		AttaqueGestion.GestionAttaque(pPokemon1, pPokemon2, attaque);
	}
	
	public Dresseur getMonDresseur() {
		return monDresseur;
	}
	
	public void setMonDresseur(Dresseur monDresseur) {
		this.monDresseur = monDresseur;
	}
	
	public void addDresseur(Dresseur dresseur) {
		this.monDresseur = dresseur;
		
	}
	
	public void removeDresseur() {
		this.monDresseur = null;
		
	}
	
	

}
