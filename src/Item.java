public class Item {
    //Price ----- Double
    //Name ------ String
    //Quantity -- Int
    //Type ------ String

    private double price;
    private int quantity;
    private String name;
    private String type;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Item(double price, int quantity, String name, String type) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.type = type;
    }
}
