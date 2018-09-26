package view;

import model.Dresseur;
import model.Pokemon;
import model.PokemonFeu;
import model.PokemonInsecte;
import model.PokemonMer;

public class Principale {

	public static void main(String[] args) {
		
		Pokemon pokemonDeBase = new Pokemon("Bulboké", 100, 100);
		
		PokemonFeu Dracofeu = new PokemonFeu("Dracofeu", 200, 250, 2, 2, 5, 10);
		PokemonMer Obalie = new PokemonMer("Obalie", 50, 10, 2, 20);
		PokemonInsecte Insecateur = new PokemonInsecte("Insecateur", 50, 15, 2, 2, 1, 5, 10);
		
		System.out.println(Dracofeu.toString());
		System.out.println(Obalie.toString());
		Obalie.attaque(Dracofeu);
		Obalie.attaque(Obalie);
		
		Dresseur Sacha = new Dresseur("Sacha", 1);
		
		Sacha.addPokemon(Dracofeu);
		Sacha.addPokemon(Obalie);
		
		System.out.println(Sacha.ListerPokemon());

		
	}
	

}
