import java.util.ArrayList;

public class Store {
    //Attributes
    //Object type ---------String
    //Available objects ---ArrayList<Objects>

    private String name;
    private ArrayList<Item> availableObjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getAvailableObjects() {
        return availableObjects;
    }

    public void setAvailableObjects(ArrayList<Item> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public Store(String name, ArrayList<Item> availableObjects) {
        this.name = name;
        this.availableObjects = availableObjects;
    }

    //Method
    public boolean userBuy(double money,int quantity, int objectIndex){
        //Approve that are sufficient objects of the required type
        if (objectIndex > availableObjects.size()){
            System.out.println("Error. The object doesn't exists");
        }else{
            if (availableObjects.get(objectIndex).quantity >= quantity){
                double totalPrice = quantity * availableObjects.get(objectIndex).price;
                if (totalPrice >= money){
                    System.out.println("Sold");
                    return true;
                }else{
                    System.out.println("There isn't enough money, missing: " + (totalPrice - money));
                    return false;
                }
            }else{
                System.out.println("We don't have the requested quantity");
                return false;
            }
        }

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
    public boolean userSell(Item item, int quantity){
        //Inverse logic of buy
        //The unique exception that the user can't sell berry's
        System.out.println(item.getClass());
        //Infinite money on the store
        //Receive object and give money to the user
        return false;
    }

    public void showAvailable(){
        int index = 1;
        System.out.println("Available objects are: ");
        for (Object object: availableObjects) {
            System.out.println(index + " - ");
            System.out.println(object);//Missing implementing toString in object
            index++;
        }
    }
}
