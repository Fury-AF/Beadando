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

}
