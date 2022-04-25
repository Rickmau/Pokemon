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

    //Use

        //If it cures
            //Increase 20 hp
        //If it increases the strength
            //Increase 20 of strength
        //If it is of speed
            //Increase 20 of speed
}
