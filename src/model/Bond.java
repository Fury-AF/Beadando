package model;

public class Bond extends Instrument{
    private String bondName;
    private double faceValue;
    private double couponRate;
    private int yearsToMaturity;

    // Constructor
    public Bond(String companyName, String bondName, double faceValue, double couponRate, int yearsToMaturity) {

        super(companyName);
        this.bondName = bondName;
        this.faceValue = faceValue;
        this.couponRate = couponRate;
        this.yearsToMaturity = yearsToMaturity;
    }
    // Method to calculate the coupon payment
    public double calculateCouponPayment() {
        return faceValue * (couponRate / 100);
    }

    // Method to calculate the yield to maturity (YTM)
    public double calculateYieldToMaturity(double marketPrice) {
        double totalInterest = 0;
        for (int i = 1; i <= yearsToMaturity; i++) {
            totalInterest += calculateCouponPayment();
            totalInterest += (faceValue - totalInterest) / yearsToMaturity;
        }
        return (faceValue + (totalInterest - marketPrice)) / ((faceValue + marketPrice) / 2);
    }

    // Getter and setter
    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }

    public double getCouponRate() {
        return couponRate;
    }

    public void setCouponRate(double couponRate) {
        this.couponRate = couponRate;
    }

    public int getYearsToMaturity() {
        return yearsToMaturity;
    }

    public void setYearsToMaturity(int yearsToMaturity) {
        this.yearsToMaturity = yearsToMaturity;
    }

    // toString method to represent Bond object as a string

}

