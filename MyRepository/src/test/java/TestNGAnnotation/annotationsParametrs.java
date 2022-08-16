package TestNGAnnotation;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static ClasesToAll.BasePage.driver;

public class annotationsParametrs {
    //Эта аннотация позволяет вам передавать параметры в ваши тесты через файл TestNG.xml.
    // Это удобно, когда нужно передать ограниченное количество данных в ваши тесты.
    // В случае сложных и больших наборов данных лучше использовать аннотацию @DataProvider или Excel.
    @Parameters({"username", "password"})
    @Test()
    public void checkLogin(String username, String password) {
        driver.get("https://accounts.lambdatest.com/login");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='app']/section/form/div/div/button")).click();
        System.out.println("The login process on lamdatest is completed");
    }
}
