package herokuapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {
        //Setup firefox browser
        String baseUrl = "http://the-internet.herokuapp.com/";
        System.setProperty("webdriver.chrome.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //launch the Url
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize window

        //get the title of page
        String title = driver.getTitle();
        System.out.println(title);

        //get current Url
        System.out.println("Current URL = " + driver.getCurrentUrl());

        //page source
        String loginUrl = "http://the-internet.herokuapp.com/login";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = "+driver.getCurrentUrl());

        //Enter the username to username field
        WebElement userNameField = driver.findElement(By.id("Username"));
        //sending username to usernmaefield element
       // UsernameField.sendKeys("tomsmith");


        //Find the password field element
        WebElement passwordField =  driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordField.sendKeys("SuperSecretPassword");
        //close the browser
        driver.close();



    }
}


