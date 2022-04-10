package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("NY", "WSJ", "Reporter",
                123456, true, false, false, true);


        Offer offer2 = new Offer();
        offer2.setInfo("NJ", "KFC", "Chicken",
                1456, false, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("California", "Microsoft", "Keyboard",
                987456, true, true, true, false);


        Offer[] myOffers = {offer1,offer2,offer3};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p-> p.isFullTime==false);
        System.out.println("fullTimeOffers = " + fullTimeOffers);
        System.out.println("fullTimeOffers = " + fullTimeOffers.size());


        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
localOffers.removeIf(p-> !p.location.equals("NJ"));
        System.out.println(localOffers.size());

        for(Offer localOffer : localOffers){
            System.out.println(localOffer.companyName + " : " + localOffer.salary);
        }

    }
}
