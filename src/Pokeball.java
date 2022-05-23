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
}