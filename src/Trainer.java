import java.util.ArrayList;

public class Trainer extends Character{
    //Region ---------- String
    //PokemonPet ------ Pokemon
    //TournamentWon --- Int
    //Pokedex --------- ArrayList<Pokemon>
    //Backpack -------- ArrayList<Item>

    String region;
    int tournamentWon;
    ArrayList<Pokemon> Pokedex = new ArrayList<>();
    ArrayList<Item> Backpack = new ArrayList<>();

    public Trainer(String name, int level, char gender) {
        super(name, level, gender);
    }

    //Fight ----------- Abstraction Implemented
        //Choose a Pokemon from the Pokedex
            //If the HP is over 15
                //Choose 2 doves and 1 weak randomly
            //If don´t have doves, choose 3 randomly

        //Call to the fight method of the Pokemon
        //
}
