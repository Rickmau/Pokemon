import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> forStore = new ArrayList<>();
        Potion potion1 = new Potion(30.3,2,"Health Potion","Health", "Restore life",10);
        Pokeball pokeUltra = new Pokeball(50.3,15,"Ultra Pokeball", "Ultra", 99.5);
        forStore.add(potion1);
        forStore.add(pokeUltra);
        Store myStore = new Store("My Store", forStore);
        myStore.showAvailable();
        System.out.println(myStore.userBuy(30.3,1,0));
        myStore.userSell(potion1,4);
        myStore.userSell(pokeUltra,10);
    }
}
