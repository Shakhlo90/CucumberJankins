package CucumberTool;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookDefClass {
    WebDriver driver;
    @Given("user navigated to Facebook login page")
    public void user_navigated_to_facebook_login_page() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");

    }

    @When("user sends valid username and password")
    public void user_sends_valid_username_and_password() {
        WebElement usernameField = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
        usernameField.sendKeys("tukhtaevashahlo@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
        passwordField.sendKeys("Ulugbek2019");

    }

    @When("user clicks on Facebook login button")
    public void user_clicks_on_facebook_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
        loginButton.click();


    }

    @Then("user can successfully logged in Homepage")
    public void user_can_successfully_logged_in_homepage() {
        WebElement profile = driver.findElement(By.xpath("//span[text()='Shahlo Tukhtaeva']"));
        String text=profile.getText();
        System.out.println(text);
        Assert.assertEquals(text,"Shahlo Tukhtaeva");
        boolean displayed=profile.isDisplayed();
        if (profile.isDisplayed()) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test is failed");
        }
    }

}

