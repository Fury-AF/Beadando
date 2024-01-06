package main;

import model.Bond;
import model.Share;

public class Main {
    public static void main(String[] args) {
        //Részvény példány
        Share appleShare = new Share("Apple Inc.","Apple Inc.", 150.50, 100);
        //Részvény kiír
        System.out.println(appleShare);

        //Bond példány
        Bond microsoftBond = new Bond( "Microsoft Inc.","Microsoft Inc. Bond", 1000.0, 5.0, 10);

        //Bond kiír
        System.out.println(microsoftBond);

    }
    }
