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
        System.out.println("Should  we spend " + (price * number) + " money to this area " + location  + "? And salary " + gardener + " gardeners.\n");
    }
    public void showMoney(String location, double price, int number){
        System.out.println("This district " + location + " we should spend for flowerbed " + (price * number) + " money.\n") ;
    }
    public void showNameFlowers(String nameFlowers, int price, int number){
        System.out.println("In this area we we will plant " + nameFlowers + " in quantity " + number + " will be cost for " + number +" flower" + (price * number) + " usd."+ "\n");
    }
    public void showNameFlowers(String nameFlowers, int price, int number, int flowerBed){
        System.out.println("But we will plant " + nameFlowers + " in quantity " + number + " . Thias area will be cost " + (price * number) + "\n");
    }

    public void showCostAllFlowers(String location, int price, int number) {
        System.out.println("All flowers for all " + location + " cost " + (price * number) + "\n");
    }
    public void showCostAllFlowers( int price, int number) {
        System.out.println("This beautiful flowers for area cost " + (price * number) + "\n");
    }
}
