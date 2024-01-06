package model;

public class Share {
    private String companyName;
    private double price;
    private int quantity;

    public Share(String companyName, double price, int quantity) {
        this.companyName = companyName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
        return "Share [companyName=" + companyName + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
