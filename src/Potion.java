public class Potion extends Item{
    public Potion(double price, int quantity, String name, String type) {
        super(price, quantity, name, type);
    }

    //Effect --------- String
    //Duration ------- Int

    private String effect;
    private int Duration;

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public Potion(double price, int quantity, String name, String type, String effect, int duration) {
        super(price, quantity, name, type);
        this.effect = effect;
        Duration = duration;
    }

    @Override
    public boolean Use(Pokemon pokemon) {
        if (this.effect.equals("health")){
            pokemon.setHp(pokemon.getHp()+20);
            return true;
        }else if(this.effect.equals("strength")){
            pokemon.setStrenght(pokemon.getStrenght()+20);
            return true;
        }else if(this.effect.equals("speed")){
            pokemon.setSpeed(pokemon.getSpeed()+20);
            return true;
        }else{
            return false;
        }

    }
}
