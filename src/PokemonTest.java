
public abstract class PokemonTest extends AbstractPokemon{

	public static void main (String[] args) {
		
		Pokedex poke = new Pokedex();
		Pokemon pikachu = poke.createPokemon("Pikachu", 100, "Electric");
		System.out.println(poke.pokemonInfo(pikachu));
		Pokemon gyrados = poke.createPokemon("Gyrados", 200, "Water/Flying");
		System.out.println(poke.pokemonInfo(gyrados));
		gyrados.attackPokemon(pikachu);
		System.out.println(Pokemon.getNumOfPokemon());
		poke.listPokemon();
		
		
	}

}
