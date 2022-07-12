package TaskOverrideOverload.OverloadMethods;

import org.testng.annotations.Test;

public class TestFlowerInCity {

    @Test
    public void testFlowerInCity() {
        FlowerInCity flowerInCity = new FlowerInCity();
        flowerInCity.showMoney("centr", 3, 1230);

        FlowerInCity flowerInCity1 = new FlowerInCity();
        flowerInCity1.showMoney("40 kvartal", 2, 1100);
    }

    @Test
    public void testGardenerFlowerInCity() {
        FlowerInCity flowerInCity = new FlowerInCity();
        flowerInCity.showMoney("Voli street", 3, 1230, 27);

        FlowerInCity flowerInCity1 = new FlowerInCity();
        flowerInCity1.showMoney("33 kvartal", 2, 1100, 35);
    }
    @Test
    public void testNameFlowerInCity() {
        FlowerInCity flowerInCity = new FlowerInCity();
        flowerInCity.showMoney("Near Hospital", 6, 950);
        flowerInCity.showNameFlovers("Fialka", 1, 70);
        flowerInCity.showNameFlovers("Narcis", 13, 98);
        flowerInCity.showCostAllFlovers("Near Hospital", 22, 67);
    }
}
