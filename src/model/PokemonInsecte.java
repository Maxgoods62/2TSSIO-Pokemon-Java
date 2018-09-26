package model;

public class PokemonInsecte extends Pokemon {
	
	private int nbAiles;
	private int nbPattes;
	private double taille;
	private double vitesseVol;
	private double vitesseSol;
	
	public int getNbAiles() {
		return nbAiles;
	}
	public int getNbPattes() {
		return nbPattes;
	}
	public double getTaille() {
		return taille;
	}
	public double getVitesseVol() {
		return vitesseVol;
	}
	public double getVitesseSol() {
		return vitesseSol;
	}
	public void setNbAiles(int nbAiles) {
		this.nbAiles = nbAiles;
	}
	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public void setVitesseVol(double vitesseVol) {
		this.vitesseVol = vitesseVol;
	}
	public void setVitesseSol(double vitesseSol) {
		this.vitesseSol = vitesseSol;
	}
	
	

	@Override
	public String toString() {
		return "PokemonInsecte [nbAiles=" + nbAiles + ", nbPattes=" + nbPattes + ", taille=" + taille + ", vitesseVol="
				+ vitesseVol + ", vitesseSol=" + vitesseSol + ", nom=" + nom + ", energie=" + energie + ", poids="
				+ poids + "]";
	}
	
	
	
	public PokemonInsecte(String pNom, double pEnergie, double pPoids, int nbAiles, int nbPattes, double taille,
			double vitesseVol, double vitesseSol) {
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
		
		double attaque = 3*this.vitesseVol;
		
		super.attaque(pPokemonAttaque, this, attaque);
		
	}

}
