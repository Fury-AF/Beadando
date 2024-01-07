package model;

public abstract class Instrument {
    private String companyName;

    private boolean evaluated;

    public Instrument(String companyName) {
        this.companyName = companyName;
        this.evaluated = false;
    }

    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(){
        this.companyName=companyName;
    }
    public boolean isEvaluated(){
        return evaluated;
    }
    public void setEvaluated(boolean evaluated){
        this.evaluated=evaluated;
    }
    @Override
    public String toString() {
        return "Instrument{companyName=" + this.companyName + ", Evaluated=" + this.evaluated + '}';
    }

}
