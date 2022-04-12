package ultimateqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        //Setup chrome browser
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //launch the Url
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize window

        //get the title of page
        String title = driver.getTitle();
        System.out.println(title);

        //get current Url
        System.out.println("Current URL = " + driver.getCurrentUrl());

        //page source
        String loginUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = "+driver.getCurrentUrl());

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        //sending email to emailfield element
        emailField.sendKeys("prime123@gmail.com");


        //Find the password field element
        WebElement passwordField =  driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordField.sendKeys("Prime123");
        //close the browser
        driver.close();



    }
}

