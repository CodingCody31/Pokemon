import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	
	ArrayList <Pokemon> myPokemons;
	
	public Pokedex () {
		myPokemons = new ArrayList<Pokemon>();
	}
	

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		System.out.println("You created a new Pokemon! - " + name);
		Pokemon x = new Pokemon(name, health, type);
		myPokemons.add(x);
		return x;
	}


	@Override
	public void listPokemon() {
		for (int i = 0; i < myPokemons.size(); i++) {
			System.out.println(myPokemons.get(i).getName());
		}
	}

}
