import java.util.ArrayList;

public class Trainer extends Character{
    //Region ---------- String
    //PokemonPet ------ Pokemon
    //TournamentWon --- Int
    //Pokedex --------- ArrayList<Pokemon>
    //Backpack -------- ArrayList<Item>

    private String region;
    private Pokemon petPokemon;
    private int tournamentWon;
    ArrayList<Pokemon> pokedex = new ArrayList<>();
    ArrayList<Item> backpack = new ArrayList<>();
    private double money;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getPetPokemon() {
        return petPokemon;
    }

    public void setPetPokemon(Pokemon petPokemon) {
        this.petPokemon = petPokemon;
    }

    public int getTournamentWon() {
        return tournamentWon;
    }

    public void setTournamentWon(int tournamentWon) {
        this.tournamentWon = tournamentWon;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }

    public void setBackpack(ArrayList<Item> backpack) {
        this.backpack = backpack;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Trainer(String name, int level, char gender, String region, Pokemon petPokemon, int tournamentWon, ArrayList<Pokemon> pokedex, ArrayList<Item> backpack, double money) {
        super(name, level, gender);
        this.region = region;
        this.petPokemon = petPokemon;
        this.tournamentWon = tournamentWon;
        this.pokedex = pokedex;
        this.backpack = backpack;
        this.money = money;
    }

    //Fight ----------- Abstraction Implemented
        //Choose a Pokemon from the Pokedex
            //If the HP is over 15
                //Choose 2 doves and 1 weak randomly
            //If don´t have doves, choose 3 randomly

        //Call to the fight method of the Pokemon
        //
}
