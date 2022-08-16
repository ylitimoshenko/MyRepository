package TestNGAnnotation;

import org.openqa.selenium.Platform;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class annotationDataProvider {
    // Этот метод помогает в создании тестов, управляемых данными,
    // в которые может передаваться несколько наборов входных значений.
    // Метод должен возвращать двумерный массив или объект.

    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {Platform.WIN8, "chrome", "70.0"},
                {Platform.WIN8, "chrome", "71.0"}
        };

        return browserProperty;
    }

    public static class annotationFactory {
        // Эта аннотация помогает запускать несколько тестовых классов через один тестовый класс.
        // Проще говоря, она определяет и создаёт тесты динамически.
        @Test
        public void testMethod1() {
            System.out.println("This is to test for method 1 for Factor Annotation");
        }
    }
}
