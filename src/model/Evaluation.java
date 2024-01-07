package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Evaluation {
    private Instrument[] instruments;
    private int licenseUnit;
    private boolean license;
    public Evaluation() {
        this(7);
    }
    public Evaluation(int db) {
        licenseUnit = 0;
        instruments = new Instrument[db];
        license = true;
    }
    public void calucate(Instrument instrument){
        if (license) {
            if (licenseUnit < instruments.length) {
                instruments[licenseUnit++] = instrument;
            } else {
                System.out.println("You reach the license limit!");
            }
        } else {
            System.out.println("You do not have license!");
        }
    }

    public void valuate(){
        if (license) {
            for (Instrument instrument : instruments) {
                if (instrument != null) {
                    instrument.setEvaluated(true);
                    if (instrument instanceof Bond) {
                       ((Bond) instrument).calculateYieldToMaturity(); //Itt kell majd az értékelés kiíratni
                    }else if(instrument instanceof Share){
                        ((Share) instrument).calculateValue();
                    }
                }
            }
        } else {
            System.out.println("Nincs license!");
        }
    }

    public String[] getInstDescription() {
        String[] instruments = new String[this.instruments.length];
        for (int i = 0; i < licenseUnit; i++) {
            Instrument instrument = this.instruments[i];
            if(instrument != null){
                boolean InstrumentType = instrument instanceof Bond;
                String r_i = " share ";
                if(InstrumentType){
                    r_i = " bond ";
                }
                instruments[i] = instrument.getCompanyName() + r_i;
                instruments[i] += instrument.isEvaluated() ? "Értékelt" : "Nem értékelt";
                if(InstrumentType){
                    instruments[i] += " (Kamat:"+ ((Bond)instrument).calculateCouponPayment() + ")";
                }else if(instrument instanceof Share){
                    instruments[i] += " (Osztalék: " + ((Share)instrument).calculateValue() + ")";
                }
            }
        }
        return instruments;
    }


}
