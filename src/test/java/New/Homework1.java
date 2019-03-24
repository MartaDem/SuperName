package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework1 {
    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.seleniumeasy.com/test/");
        //Thread.sleep(2000);
        driver.findElement (By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
        Assert.assertEquals(driver.getTitle(),"Selenium Easy - Best Demo website to practice Selenium Webdriver Online");
        //driver.findElement (By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")).isDisplayed();
        driver.findElement (By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a")).click();
        String text = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/h3")).getText();
        Assert.assertEquals("This would be your first example to start with Selenium.", text);
        id(driver).sendKeys("Hello guys");
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        Thread.sleep(2000);
        driver.findElement (By.id("display")).isDisplayed();
        Thread.sleep(2000);
        driver.findElement(By.id("sum1")).sendKeys("5");
        driver.findElement(By.id("sum2")).sendKeys("5");
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#displayvalue")).getText();
        driver.findElement(By.cssSelector("#gettotal > button")).click();
        String total = driver.findElement(By.id("displayvalue")).getText();
        Assert.assertEquals("10", total);
        //driver.findElement (By.id("displayvalue")).isDisplayed();
        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(2) > a")).click();
        driver.findElement (By.cssSelector("#isAgeSelected")).click();
        text = driver.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText();
        Assert.assertEquals("Success - Check box is checked", text);
        Thread.sleep(2000);
        driver.findElement (By.cssSelector("#check1")).click();
        Thread.sleep(2000);
        driver.findElement (By.xpath("//*[@id=\"check1\"]")).click();
        Thread.sleep(2000);
        driver.close();

    }

    private void checkDataPicker(String text, String date_pickers_example) {
        Assert.assertEquals(text, date_pickers_example);
    }

    private WebElement dataPicker(ChromeDriver driver) {
        return driver.findElement (By.xpath("//*[@id=\"sandbox-container1\"]/div/input"));
    }

    private WebElement id(ChromeDriver driver) {
        return driver.findElement(By.id("user-message"));
    }
}