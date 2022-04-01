import java.util.ArrayList;

public class Store {
    //Attributes
    //Object type ---------String
    //Available objects ---ArrayList<Objects>

    private String name;
    private ArrayList<Item> availableObjects;


    //Method
    public boolean userBuy(double money,int quantity, int objectIndex){
        //Approve that are sufficient objects of the required type
        //We have the quantity and object
            //If we have money, approve that is sufficient
                // If it is sufficient, we sell
            //If else
                //Show that the user doesn't have the sufficient money
            //If not
                //We make an exception that we don´t the quantity requested
                //Repeat the question
        return false;
    }
    //Buy
    //Sell
    public boolean userSell(Item object, int quantity){
        //Inverse logic of buy
        //Infinite money on the store
        //Receive object and give money to the user
        return false;
    }
}
