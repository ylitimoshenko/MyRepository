package TaskOverrideOverload.OverloadMethods;

public class FlowerInCity {
    String nameFlowers;
    int price;
    int number;
    String location;
    int gardener;

    public void showMoney(String location, int price, int number){
        System.out.println("In area location " + location + " we should spend " + (price * number) + " money.\n") ;
    }
    public void showMoney(String location, int price, int number, int gardener){
        System.out.println("In area location " + location + " we should spend " + (price * number) + " money. For a work need " + gardener + " gardener.\n");
    }
    public void showNameFlovers(String nameFlowers, int price, int number){
        System.out.println("In this area we we will plant " + nameFlowers + " in quantity " + number + " will be cost for 1 flower" + (price * number) + "\n");
    }

    public void showCostAllFlovers(String location, int price, int number) {
        System.out.println("All flovers for all " + location + " cost " + (price * number) + "\n");
    }
}
