import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main implements Interface{
    static ArrayList<Skills> skills = new ArrayList<>();
    static Skills skill = new Skills();
    static Skills skill2 = new Skills();
    static Skills skill3 = new Skills();
    static ArrayList<String> pokemonTypes = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        long initialTime = System.currentTimeMillis();

        skills.add(skill);
        skills.add(skill2);
        skills.add(skill3);

        pokemonTypes = new ArrayList<>(Arrays.asList("Fire", "Water","Plant"));

        Main mainObject = new Main();
        //Call to Played Time
        mainObject.playedTime(initialTime,System.currentTimeMillis());
        int answer = 1;
        Scanner data = new Scanner(System.in);
        while (answer != 0){
            mainObject.showMenu();
            System.out.println("Select an option");
            answer = data.nextInt();
            if (answer == 1){
                int StopExploring = 1;
                while (StopExploring != 0){
                    Thread.sleep(1000);
                    System.out.println("Savage pokemon appeared");
                    System.out.println(mainObject.createRandomPokemon());
                    System.out.println("Do you want to continue exploring?");
                    StopExploring = data.nextInt();
                }
            }
        }
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
        Random random = new Random();
        int numType = random.nextInt(0,pokemonTypes.size());
        String type = pokemonTypes.get(numType);
        int nameLength = randomName(type).length;
        int name = random.nextInt(0,nameLength);
        String finalName = randomName(type)[name];
        int hp = random.nextInt(50,200);
        boolean isLegendary = random.nextBoolean();
        String[] strongAndWeak = weakAndStrongRandom(type);
        int strength = random.nextInt(50,200);
        int speed = random.nextInt(50,200);
        int level = random.nextInt(1,15);
        int numSkills = random.nextInt(0,skills.size());
        char gender = random.nextInt(0,10) < 5 ? 'f' : 'm';

        return new Pokemon(finalName,level,gender,type,skills.get(numSkills),hp,isLegendary,strongAndWeak[0],strongAndWeak[1],strength,speed);

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
