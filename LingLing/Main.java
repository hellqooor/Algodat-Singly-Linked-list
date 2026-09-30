public class Main {
    public static void main(String[] args) {
        Pokemonlist pokedex = new Pokemonlist();

        pokedex.addPokemon("Pikachu", 25);
        pokedex.addPokemon("Charizard", 50);
        pokedex.addPokemon("Bulbasaur", 15);

        System.out.println("=== POKEMON LIST ===");
        pokedex.traversal();

        System.out.println("\n=== STRONGEST POKEMON ===");
        pokedex.showStrongest();

        System.out.println("\n=== SEARCH POKEMON ===");
        pokedex.searchPokemon("Pikachu");

        System.out.println("\n=== DELETE POKEMON ===");
        pokedex.deletePokemon("Bulbasaur");

        System.out.println("\n=== TRAVERSAL ===");
        pokedex.traversal();
    }
}
