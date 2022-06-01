import java.util.ArrayList;
import java.util.Random;

public class Main implements Interface{

    public static void main(String[] args) {

    }

    @Override
    public void playedTime(long initialTime, long finalTime) throws InterruptedException {
        /* initialTime = System.currentTimeMillis();
        Thread.sleep(2000);
        finalTime = System.currentTimeMillis();*/
        double actualTime = (double) ((finalTime-initialTime)/1000);
        System.out.println("Played time: " + actualTime + " seconds");
    }

    @Override
    public void showMenu() {
        System.out.println("""
                1. Explore
                2. Open Store
                3. Throw Item
                4. Show Statistics
                5. Played Time""");
    }

    @Override
    public Pokemon createRandomPokemon() {
        return null;
    }

    @Override
    public <T> T takeOutRandom(ArrayList<T> arrayList) {

        Random random = new Random();
        int index = random.nextInt(0,arrayList.size()-1);
        return arrayList.get(index);

    }

    @Override
    public String[] weakAndStrongRandom(String type) {
        String[] strongAndWeak = new String[2];
        switch (type){
            case "Fire":
                strongAndWeak[0] = "Dust";
                strongAndWeak[1] = "Plant";
                break;
            case "Water":
                strongAndWeak[0] = "Plant";
                strongAndWeak[1] = "Dust";
                break;
            case "Plant":
                strongAndWeak[0] = "Fire";
                strongAndWeak[1] = "Water";
                break;
        }
        return strongAndWeak;
    }

    @Override
    public String[] randomName(String type) {
        String[] Fire = {"Scorpion", "Scorpion 1", "Scorpion 2"};
        String[] Water = {"Turtle", "Turtle 1", "Turtle 2"};
        String[] Plant = {"Squirrel", "Squirrel 1", "Squirrel 2"};
        if (type.equals("Water")){
            return Water;
        }else if(type.equals("Fire")){
            return Fire;
        }else{
            return Plant;
        }
    }
}
