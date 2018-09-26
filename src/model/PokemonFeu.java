package model;

public class PokemonFeu extends Pokemon {

	private int nbAiles;
	private double taille;
	private int nbBouledeFeu;
	private double puissanceFeu;
	
	
	public PokemonFeu(String pNom, double pEnergie, double pPoids, int nbAiles, double taille, int nbBouledeFeu,
			double puissanceFeu) {
		super(pNom, pEnergie, pPoids);
		this.nbAiles = nbAiles;
		this.taille = taille;
		this.nbBouledeFeu = nbBouledeFeu;
		this.puissanceFeu = puissanceFeu;
	}


	public int getNbAiles() {
		return nbAiles;
	}

	public double getTaille() {
		return taille;
	}

	public int getNbBouledeFeu() {
		return nbBouledeFeu;
	}

	public double getPuissanceFeu() {
		return puissanceFeu;
	}

	public void setNbAiles(int nbAiles) {
		this.nbAiles = nbAiles;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public void setNbBouledeFeu(int nbBouledeFeu) {
		this.nbBouledeFeu = nbBouledeFeu;
	}

	public void setPuissanceFeu(double puissanceFeu) {
		this.puissanceFeu = puissanceFeu;
	}

	@Override
	public String toString() {
		return "PokemonFeu [nbAiles=" + nbAiles + ", taille=" + taille + ", nbBouledeFeu=" + nbBouledeFeu
				+ ", puissanceFeu=" + puissanceFeu + ", nom=" + nom + ", energie=" + energie + ", poids=" + poids + "]";
	}
	
	public double VitesseVol() {
		return this.nbAiles * this.taille;
	}
	
	public void attaque(Pokemon pPokemonAttaque) {
		
		double attaque = 15*this.VitesseVol();
		super.attaque(pPokemonAttaque, this, attaque);
		
	}
	
	
	
	
}
