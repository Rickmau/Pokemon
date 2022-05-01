import java.util.ArrayList;
import java.util.Scanner;

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

    //Throw item
        //Show available items
        //The user selects the index of the item to throw(erase)
    public void throwItem(){
        Scanner data = new Scanner(System.in);
        if (backpack.size() <= 0){
            System.out.println("You don´t have items to throw");
        }else {
            System.out.println("Available items: ");
            for (int i = 0; i < backpack.size(); i++) {
                System.out.println(i+1 + ". " + backpack.get(i));
            }
            System.out.print("Input the number of the item you want to throw: ");
            int itemIndex = data.nextInt();
            backpack.remove(itemIndex-1);
            System.out.println("Item threw successfully");
        }
    }

    //Exchange Pokemon
        //Show available pokemons of Player 1
            //Select pokemon from Player 1 you want to change
        //Show available pokemons of Player 2
            //Select pokemon you want from Player 2
        //Show both pokemons to Player 2
            //Player 2 decides if exchanges pokemons or not
            //If (Answer == true){
            //  Use an auxiliary to save pokemon from Player 1 and erase that pokemon from the ArrayList
            //  Insert the pokemon from the auxiliary in Player's 2 Pokedex
            //  Save the pokemon to exchange from Player 2 in the auxiliary and erase that pokemon from the ArrayList
            //  Insert the pokemon from the auxiliary in Player's 1 Pokedex
        //Launch a message when the exchange has been successfully


    public String exchange (){

        return null;
    }
    //Fight ----------- Abstraction Implemented
        //Choose a Pokemon from the Pokedex
            //If the HP is over 15
                //Choose 2 doves and 1 weak randomly
            //If don´t have doves, choose 3 randomly

        //Call to the fight method of the Pokemon
        //
}
