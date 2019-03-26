package New;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.handler.ContextHandler;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.plugin.dom.core.Element;

import javax.script.ScriptContext;
import javax.swing.text.html.CSS;
import java.text.AttributedCharacterIterator;
import java.util.concurrent.TimeUnit;

public class Homework1 {


    //private CSS checkBox;

    @Test
    public void inputForms() throws InterruptedException {
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

        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(2) > a")).click();
        driver.findElement (By.cssSelector("#isAgeSelected")).click();
        text = driver.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText();
        Assert.assertEquals("Success - Check box is checked", text);
        Thread.sleep(2000);
        driver.findElement (By.cssSelector("#check1")).click();
        Thread.sleep(2000);
        //WebElement checkbox = driver.findElement(By.class("cb1-element"));
        //System.out.println("Option1" + checkbox.isSelected());
        //WebElement checkedBox = findElementByClass("//li[@id='privileges:1']/div/span/div/div/span[@class='ui-tree-checkbox-icon.ui-icon.ui-icon-check']");
        //Assert.assertEquals(driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(3) > label"));
        //Assert.assertFalse();
        //assertTrue(checkedBox.isEnabled());
        driver.findElement (By.xpath("//*[@id=\"check1\"]")).click();
        Thread.sleep(2000);

        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(3) > a")).click();
        Thread.sleep(2000);
        driver.findElement (By.cssSelector("#buttoncheck")).click();
        text = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")).getText();
        Assert.assertEquals("Radio button is Not checked", text);
        Thread.sleep(2000);

        driver.findElement (By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > label:nth-child(2) > input[type=\"radio\"]")).click();
        driver.findElement (By.cssSelector("#buttoncheck")).click();
        Thread.sleep(2000);
        text = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")).getText();
        Assert.assertEquals("Radio button 'Male' is checked", text);
        driver.findElement (By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > button")).click();
        text = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        Assert.assertEquals("Sex :\n" +
                "Age group:", text);
        driver.findElement (By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")).click();
        driver.findElement (By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")).click();
        driver.findElement (By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        text = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")).getText();
        Assert.assertEquals("Sex : Female\n" +
                "Age group: 15 - 50", text);
        Thread.sleep(2000);

        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(4) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"select-demo\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"select-demo\"]/option[3]")).click();
        //Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"select-demo\"]/option[3]")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"printMe\"]")).click();
        Thread.sleep(2000);

        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Marta");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Monday");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("mmonday@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("555-45-098");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("Baker Street");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("Bedford");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")).click();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select/option[17]")).click();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("78987");
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[2]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).click();
        Thread.sleep(3000);

        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(6) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"title\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Marta");
        driver.findElement(By.xpath("//*[@id=\"description\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Monday is the first working day of the week :(");
        driver.findElement (By.xpath("//*[@id=\"btn-submit\"]")).click();
        Thread.sleep(3000);
        text = driver.findElement(By.xpath("//*[@id=\"submit-control\"]")).getText();
        Assert.assertEquals("Form submited Successfully!", text);

        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a")).click();
        driver.findElement (By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(7) > a")).click();
        driver.findElement (By.cssSelector("body > div.container-fluid.text-center > div > div.col-md-6.text-left > div:nth-child(2) > div > div.panel-body > span > span.selection > span")).click();
        driver.findElement (By.cssSelector("#select2-country-results > li:nth-child(7)")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]")).getText(), "Japan");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li/input")).sendKeys("Florida");
        Thread.sleep(3000);
        //Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li/input")).getText(), "Florida");
        driver.findElement(By.xpath("//*[@id=\"select2-fdsg-container\"]")).sendKeys("Puerto Rico");
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