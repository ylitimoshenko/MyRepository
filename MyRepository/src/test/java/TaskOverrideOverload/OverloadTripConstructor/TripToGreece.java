package TaskOverrideOverload.OverloadTripConstructor;

public class TripToGreece {
    String cityInGreece;
    String durationOfTrip;
    int starsOfHotel;
    int price;
    boolean allInclusive;
    int numberOfPeople;

    public TripToGreece(String cityInGreece, String durationOfTrip, int starsOfHotel, int price, boolean allInclusive, int numberOfPeople) {
        this.cityInGreece = cityInGreece;
        this.durationOfTrip = durationOfTrip;
        this.starsOfHotel = starsOfHotel;
        this.price = price;
        this.allInclusive = allInclusive;
        this.numberOfPeople = numberOfPeople;
    }


    public TripToGreece(String cityInGreece, String durationOfTrip, int starsOfHotel) {
        this.cityInGreece = cityInGreece;
        this.durationOfTrip = durationOfTrip;
        this.starsOfHotel = starsOfHotel;
    }


    public void showTripDetails() {
        System.out.println("This family would like to have a rest in  " + cityInGreece + ". Along " + durationOfTrip + " days. Hotel should be " + starsOfHotel + " *. Cost a trip should be lower then " + price + " $.");
    }

    public void showAllInclusive() {
        if (allInclusive) {
            System.out.println("Client want only a rest in hotel AllInclusive \n");
        } else {
            System.out.println("Client  agree to have another option a trip. \n");
        }
    }

    public void showNumberPeoleHaveRest() {
        System.out.println(" Number of people " + numberOfPeople + ".");
    }

    public void showTripYanino() {
        System.out.println("Our client want a rest in " + cityInGreece );
    }

    public void showDurationAndStarsHotel() {
        System.out.println("And clients will be live in hotel " + starsOfHotel + " *" + durationOfTrip + " days of holidays." );
    }
}

