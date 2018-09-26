package model;

public class PokemonInsecte extends Pokemon {
	
	private int nbAiles;
	private int nbPattes;
	private float taille;
	private float vitesseVol;
	private float vitesseSol;
	
	public int getNbAiles() {
		return nbAiles;
	}
	public int getNbPattes() {
		return nbPattes;
	}
	public float getTaille() {
		return taille;
	}
	public float getVitesseVol() {
		return vitesseVol;
	}
	public float getVitesseSol() {
		return vitesseSol;
	}
	public void setNbAiles(int nbAiles) {
		this.nbAiles = nbAiles;
	}
	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
	public void setTaille(float taille) {
		this.taille = taille;
	}
	public void setVitesseVol(float vitesseVol) {
		this.vitesseVol = vitesseVol;
	}
	public void setVitesseSol(float vitesseSol) {
		this.vitesseSol = vitesseSol;
	}
	
	

	@Override
	public String toString() {
		return "PokemonInsecte [nbAiles=" + nbAiles + ", nbPattes=" + nbPattes + ", taille=" + taille + ", vitesseVol="
				+ vitesseVol + ", vitesseSol=" + vitesseSol + ", nom=" + nom + ", energie=" + energie + ", poids="
				+ poids + "]";
	}
	
	
	
	public PokemonInsecte(String pNom, float pEnergie, float pPoids, int nbAiles, int nbPattes, float taille,
			float vitesseVol, float vitesseSol) {
		super(pNom, pEnergie, pPoids);
		this.nbAiles = nbAiles;
		this.nbPattes = nbPattes;
		this.taille = taille;
		this.vitesseVol = vitesseVol;
		this.vitesseSol = vitesseSol;
	}
	
	public void VitesseSol() {
		this.vitesseSol = this.nbPattes * this.taille * 3;
	}
	
	public void VitesseVol() {
		this.vitesseVol = this.nbAiles * this.taille * 10;
	}
	
	public void attaque(Pokemon pPokemonAttaque) {
		
		float attaque = 3*this.vitesseVol;
		
		super.attaque(pPokemonAttaque, this, attaque);
		
	}

}
