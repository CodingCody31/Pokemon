
public class Pokemon{
	
	private String name;
	private int health;
	private String type;
	
	private static int pokemonCount = 0;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		
		pokemonCount++;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
		System.out.println(pokemon.name + " was attacked for 10 damage!\n" + pokemon.name + "'s health is now " + pokemon.health);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public static int getNumOfPokemon() {
		return pokemonCount;
	}

}
