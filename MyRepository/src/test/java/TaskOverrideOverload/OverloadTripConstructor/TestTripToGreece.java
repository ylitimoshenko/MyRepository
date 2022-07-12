package TaskOverrideOverload.OverloadTripConstructor;

import org.testng.annotations.Test;

public class TestTripToGreece {

    @Test
    public void testTripToGreece() {
        TripToGreece tripToGreece = new TripToGreece("Halkidiki", "ten", 4, 1500, true, 7);
        tripToGreece.showTripDetails();
        tripToGreece.showAllInclusive();
        tripToGreece.showNumberPeoleHaveRest();

        TripToGreece tripToGreece2 = new TripToGreece("Athense", "3", 5, 300, true, 3);
        tripToGreece2.showTripDetails();
        tripToGreece2.showAllInclusive();
        tripToGreece2.showNumberPeoleHaveRest();
    }
    @Test
    public void testTripToSaloniki() {
        TripToGreece tripToGreece3 = new TripToGreece("Saloniki", "eight", 3, 750, false, 2);
        tripToGreece3.showTripDetails();
        tripToGreece3.showAllInclusive();

        TripToGreece tripToGreece4 = new TripToGreece("Malia", "five", 4, 2500, true, 2);
        tripToGreece4.showTripDetails();
        tripToGreece4.showAllInclusive();

        TripToGreece tripToGreece1 = new TripToGreece("Santoriny", "eleven", 5, 3500, true, 4);
        tripToGreece1.showTripDetails();
        tripToGreece1.showAllInclusive();
    }
    @Test
    public void testTripToYanino() {
        TripToGreece tripToGreece5 = new TripToGreece("Saloniki", "twenteen", 3);
        tripToGreece5.showTripYanino();
        tripToGreece5.showDurationAndStarsHotel();

        TripToGreece tripToGreece6 = new TripToGreece("Iraclion", "seven", 5);
        tripToGreece6.showTripYanino();
        tripToGreece6.showDurationAndStarsHotel();

        TripToGreece tripToGreece7 = new TripToGreece("Hersones", "six", 4);
        tripToGreece7.showTripYanino();
        tripToGreece7.showDurationAndStarsHotel();
    }

}

