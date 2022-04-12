package orangehrmlive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        //Setup edge browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //launch the Url
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize window

        //get the title of page
        String title = driver.getTitle();
        System.out.println(title);

        //get current Url
        System.out.println("Current URL = " + driver.getCurrentUrl());

        //page source
        String loginUrl = "https://opensource-demo.orangehrmlive.com/";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = "+driver.getCurrentUrl());

        //Enter the username to Username field
        WebElement UsernameField = driver.findElement(By.id("Username"));
        //sending username to usernamefield element
        UsernameField.sendKeys("Admin");


        //Find the password field element
        WebElement passwordField =  driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordField.sendKeys("admin123");
        //close the browser
        driver.close();



    }
}

