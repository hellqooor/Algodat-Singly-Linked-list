public class Pokemonlist extends Linklist {
    public static class PokemonData {
        String name;
        int level;
        public PokemonData(String name, int level) {
            this.name = name;
            this.level = level;
        }
        @Override
        public String toString() {
            return name + " Lv." + level;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj){
                return true;
            } 
            if (obj == null || getClass() != obj.getClass()){
                return false;
            }
            PokemonData other = (PokemonData) obj;
            return name.equalsIgnoreCase(other.name);
        }
    }
    public void addPokemon(String name, int level) {
        autoinsert(new PokemonData(name, level));
    }
    public void searchPokemon(String name) {
        search(new PokemonData(name, 0));
    }
    public void deletePokemon(String name) {
        delete(new PokemonData(name, 0));
    }
    public void showStrongest() {
        if (head == null) {
            System.out.println("Not a Single Pokemon caught yet.");
            return;
        }
        Node temp = head;
        PokemonData strongest = null;
        while (temp != null) {
            if (temp.stuff instanceof PokemonData) {
                PokemonData current = (PokemonData) temp.stuff;
                if (strongest == null || current.level > strongest.level) {
                    strongest = current;
                }
            }
            temp = temp.nextNode;
        }
        if (strongest != null) {
            System.out.println("Strongest Pokemon now: " + strongest);
        }
    }
}