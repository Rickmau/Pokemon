public class Berry extends Item{
    public Berry(double price, int quantity, String name, String type) {
        super(price, quantity, name, type);
    }


    //Effect --------- String
    //Duration ------- Int

    private String BerryEffect;
    private int BerryDuration;

    public String getBerryEffect() {
        return BerryEffect;
    }

    public void setBerryEffect(String berryEffect) {
        BerryEffect = berryEffect;
    }

    public int getBerryDuration() {
        return BerryDuration;
    }

    public void setBerryDuration(int berryDuration) {
        BerryDuration = berryDuration;
    }

    public Berry(double price, int quantity, String name, String type, String berryEffect, int berryDuration) {
        super(price, quantity, name, type);
        BerryEffect = berryEffect;
        BerryDuration = berryDuration;
    }

    @Override
    public boolean Use(Pokemon pokemon) {
        if (this.BerryEffect.equals("health")){
            pokemon.setHp(pokemon.getHp()+20);
            return true;
        }else if(this.BerryEffect.equals("strength")){
            pokemon.setStrenght(pokemon.getStrenght()+20);
            return true;
        }else if(this.BerryEffect.equals("speed")){
            pokemon.setSpeed(pokemon.getSpeed()+20);
            return true;
        }else{
            return false;
        }
    }
    //Use
    //If it cures
        //Increase 20 hp
    //If it increases the strength
        //Increase 20 of strength
    //If it is of speed
        //Increase 20 of speed
}
