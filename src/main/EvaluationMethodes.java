package main;

import model.Bond;
import model.Evaluation;
import model.Instrument;
import model.Share;

public class EvaluationMethodes {
    private Evaluation evaluation;

    public static void main(String[] args) {
        new EvaluationMethodes();
    }

    public EvaluationMethodes() {
    evaluation = new Evaluation(2);

    evaluation.calucate(new Bond("Microsoft","Microsoft  bond",1000.0, 5.0, 10,15));
    evaluation.calucate(new  Share("Apple Inc.","Apple Inc.", 150.50, 100));
//    mosoda.bevesz(new Ing("Petra"));
//    mosoda.bevesz(new Ing("Piroska"));


    System.out.println("--- Értékelés ELŐTT:");
    valuationInstrumDesc();

    System.out.println("--- az 1. Értékelés UTÁN:");
    evaluation.valuate();
    valuationInstrumDesc();


    }


    private void valuationInstrumDesc() {
        for (String  instrument : evaluation.getInstDescription()) {
            if(instrument != null){
                System.out.println(instrument);
            }
        }
    }
}