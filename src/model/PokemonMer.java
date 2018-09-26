package model;

public class PokemonMer extends Pokemon {

	private int nbNageoire;
	private float vitesseEau;
	
	public PokemonMer(String pNom, float pEnergie, float pPoids, int nbNageoire, float vitesseEau) {
		super(pNom, pEnergie, pPoids);
		this.nbNageoire = nbNageoire;
		this.vitesseEau = vitesseEau;
	}

	public int getNbNageoire() {
		return nbNageoire;
	}
	public void setNbNageoire(int nbNageoire) {
		this.nbNageoire = nbNageoire;
	}
	
	public float getVitesseEau() {
		return vitesseEau;
	}
	public void setVitesseEau(float vitesseEau) {
		this.vitesseEau = vitesseEau;
	}

	@Override
	public String toString() {
		return "PokemonMer [nbNageoire=" + nbNageoire + ", vitesseEau=" + vitesseEau + ", nom=" + nom + ", energie="
				+ energie + ", poids=" + poids + "]";
	}
	
	public void VitesseEau() {
		this.vitesseEau = (this.poids / 25) * this.nbNageoire; 
	}
	
	public void attaque(Pokemon pPokemonAttaque) {
		
		float attaque = 10*this.nbNageoire;
		super.attaque(pPokemonAttaque, this, attaque);
		
	}
	
	
}
