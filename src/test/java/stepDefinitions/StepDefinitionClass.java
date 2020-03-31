package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitionClass {
    WebDriver driver;
   // ChromeDriver driver = new ChromeDriver();

    @Given("^Login present on page$")
    public void login_present_on_page() throws InterruptedException {
        System.setProperty("webdriver.safari.driver", "/Users/palmauzzal/PraticeBDDCucumber/src/Driver/safari");
        driver = new SafariDriver();
        driver.get("https://freecrm.com/");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();

        String title= driver.getTitle();
        System.out.println("The page title is : "+title);
        Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
        System.out.println(driver.getCurrentUrl());
    }

    @Then("^close browser$")
    public void close_browser() {
        driver.quit();
        System.out.println("Test Passed");
    }

//    public static void main(String[] args) throws InterruptedException{
//        StepDefinitionClass definitionClass = new StepDefinitionClass();
//        definitionClass.login_present_on_page();
//        definitionClass.close_browser();
//    }
}
