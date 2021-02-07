package DefiningClasses.PokemonTrainer;
//created by J.M.

import java.util.List;

public class Trainer {

    private final String name;
    private int countBadges;
    private List<Pokemon> pokemonList ;

    public String getName() {
        return name;
    }

    public int getCountBadges() {
        return countBadges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public void setCountBadges(int countBadges) {
        this.countBadges = countBadges;
    }

    public Trainer(String name, List<Pokemon> pokemonList,int defaultCount) {
        this.name = name;
        this.pokemonList = pokemonList;
        this.countBadges = defaultCount;

    }
}
