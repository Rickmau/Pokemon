import java.util.ArrayList;

public interface Interface {
    void playedTime(long initialTime, long finalTime) throws InterruptedException;

    void showMenu();

    Pokemon createRandomPokemon();

    <T> T takeOutRandom(ArrayList<T> arrayList);

    String[] weakAndStrongRandom(String type);

    String[] randomName(String type);

}
