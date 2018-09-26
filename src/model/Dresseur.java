package model;

import java.util.ArrayList;
import java.util.List;

public class Dresseur {

	protected String nom;
	protected int niveau;
	protected ArrayList<Pokemon> mespokemons = new ArrayList<Pokemon>();
	
	public Dresseur(String nom, int niveau) {
		super();
		this.nom = nom;
		this.niveau = niveau;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public List<Pokemon> getMespokemons() {
		return mespokemons;
	}
	public void setMespokemons(ArrayList<Pokemon> mespokemons) {
		this.mespokemons = mespokemons;
	}
	
	public boolean verifDoublonPokemon(Pokemon pPokemon ) {
		boolean rep = false;
			if (this.mespokemons.contains(pPokemon)) {
					rep = true;
			}
		
		return rep;
	}
	public void addPokemon(Pokemon pPokemon) {
		if (verifDoublonPokemon(pPokemon) == false) {
			this.mespokemons.add(pPokemon);
			pPokemon.addDresseur(this);
		} else {
			System.out.println("Vous ne pouvez pas ajouter deux fois le même pokemon.");
		}
		
	}
	
	public void removePokemon(Pokemon pPokemon) {
		if (verifDoublonPokemon(pPokemon) == true) {
			this.mespokemons.remove(pPokemon);
			pPokemon.removeDresseur();
		} else {
			System.out.println("Le Pokemon spécifié ne vous appartient pas.");
		}
		
	}

	@Override
	public String toString() {
		return "Dresseur [nom=" + nom + ", niveau=" + niveau + ", mespokemons=" + mespokemons + "]";
	}
	
	public String ListerPokemon() {
		String rep = "";
		for(Pokemon pPokemon : this.mespokemons) {
			rep += pPokemon.toString();
		}
		return rep;
	}
	
	
	
}
