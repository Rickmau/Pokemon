import java.util.Random;

public class Pokeball extends Item{
    //Effectivity ------- Double

    double effectivity;

    public Pokeball(double price, int quantity, String name, String type, double effectivity) {
        super(price, quantity, name, type);
        this.effectivity = effectivity;
    }

    @Override
    public boolean Use(Pokemon pokemon) {
        if (pokemon.isLegendary()){
            this.effectivity -= 40;
        }
        Random random = new Random();
        int value = random.nextInt(1,100);
        if (value >= 1 && value <= this.effectivity){
            return true;
        }else{
            return false;
        }
    }

    //Catch --------- Return boolean

    //Check the type of Pokemon
        //If the pokemon is legendary -40% of effectivity

    //We make a random from 1 to 100
        //if we obtain a number between 1 and the effectivity
            //We catch and subtract a pokeball
        //If not
            //Try another time until the user don´t have more pokeballs
            //Or the user don´t want to try again
}