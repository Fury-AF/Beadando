package model;

public class Share extends Instrument {
    private String companyName;

    private String shareName;
    private double price;
    private int quantity;



    // Constructor
    public Share( String companyName,String shareName, double price, int quantity) {
        this.companyName = companyName;
        this.shareName = shareName;
        this.price = price;
        this.quantity = quantity;
    }
    // Getter and setter

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
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
        return "Share [ companyName=" +companyName +", shareName=" + shareName + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
