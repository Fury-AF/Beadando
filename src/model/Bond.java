package model;

public class Bond extends Instrument{
    private String companyName;
    private String bondName;
    private double faceValue;
    private double couponRate;
    private int yearsToMaturity;

    // Constructor
    public Bond(String companyName, String bondName, double faceValue, double couponRate, int yearsToMaturity) {
        this.companyName=companyName;
        this.bondName = bondName;
        this.faceValue = faceValue;
        this.couponRate = couponRate;
        this.yearsToMaturity = yearsToMaturity;
    }

    // Getter and setter
    public String getCompanyName(){
        return companyName;
    }
    public  void setCompanyName(){
        this.companyName=companyName;
    }
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
    @Override
    public String toString() {
        return "Bond [ companyName=" + companyName + ", bondName=" + bondName + ", faceValue=" + faceValue + ", couponRate=" + couponRate
                + ", yearsToMaturity=" + yearsToMaturity + "]";
    }
}

