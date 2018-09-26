package model;

public class PokemonFeu extends Pokemon {

	private int nbAiles;
	private float taille;
	private int nbBouledeFeu;
	private float puissanceFeu;
	
	
	public PokemonFeu(String pNom, float pEnergie, float pPoids, int nbAiles, float taille, int nbBouledeFeu,
			float puissanceFeu) {
		super(pNom, pEnergie, pPoids);
		this.nbAiles = nbAiles;
		this.taille = taille;
		this.nbBouledeFeu = nbBouledeFeu;
		this.puissanceFeu = puissanceFeu;
	}


	public int getNbAiles() {
		return nbAiles;
	}

	public float getTaille() {
		return taille;
	}

	public int getNbBouledeFeu() {
		return nbBouledeFeu;
	}

	public float getPuissanceFeu() {
		return puissanceFeu;
	}

	public void setNbAiles(int nbAiles) {
		this.nbAiles = nbAiles;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public void setNbBouledeFeu(int nbBouledeFeu) {
		this.nbBouledeFeu = nbBouledeFeu;
	}

	public void setPuissanceFeu(float puissanceFeu) {
		this.puissanceFeu = puissanceFeu;
	}

	@Override
	public String toString() {
		return "PokemonFeu [nbAiles=" + nbAiles + ", taille=" + taille + ", nbBouledeFeu=" + nbBouledeFeu
				+ ", puissanceFeu=" + puissanceFeu + ", nom=" + nom + ", energie=" + energie + ", poids=" + poids + "]";
	}
	
	public float VitesseVol() {
		return this.nbAiles * this.taille;
	}
	
	public void attaque(Pokemon pPokemonAttaque) {
		
		float attaque = 15*this.VitesseVol();
		super.attaque(pPokemonAttaque, this, attaque);
		
	}
	
	
	
	
}
