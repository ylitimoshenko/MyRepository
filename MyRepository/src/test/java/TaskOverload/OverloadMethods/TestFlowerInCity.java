package TaskOverload.OverloadMethods;

import org.testng.annotations.Test;

public class TestFlowerInCity {
    FlowerInCity flowerInCity = new FlowerInCity();


    @Test
    public void testFlowerInCity() {
        flowerInCity.showMoney("centr", 3, 1230, 3);
        flowerInCity.showMoney("40 kvartal", 2, 1100);
    }

    @Test
    public void testGardenerFlowerInCity() {
        flowerInCity.showMoney("Voli street", 3, 1230, 27);
        flowerInCity.showMoney("33 kvartal", 2, 1100);
    }

    @Test
    public void testNameFlowerInCity() {
        flowerInCity.showMoney("Near Hospital", 6, 950);
        flowerInCity.showMoney("Near Hospital",  3.5, 253);
        flowerInCity.showNameFlowers("Fialka", 1, 70, 4);
        flowerInCity.showNameFlowers("Rose", 13, 98);
        flowerInCity.showCostAllFlowers("Near Hospital", 22, 67);
        flowerInCity.showCostAllFlowers(2, 65);
    }
}
