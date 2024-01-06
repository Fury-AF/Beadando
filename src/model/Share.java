package model;

public class Share extends Instrument {

    private String shareName;
    private double price;
    private int quantity;



    // Constructor
    public Share( String companyName,String shareName, double price, int quantity) {
        super(companyName);
        this.shareName = shareName;
        this.price = price;
        this.quantity = quantity;
    }
    // Method to calculate the total value of shares
    public double calculateValue() {
        return price * quantity;
    }

    // Getter and setter

    public Share setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return shareName;
    }

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

    @Override
    public String toString() {

        return "Share [shareName=" + shareName + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
