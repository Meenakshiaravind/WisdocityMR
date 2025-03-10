package com.wisdocity.automation;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class LoginTest{
	
	 // Initialize WebDriver
	WebDriver driver = new ChromeDriver();
    
    @BeforeClass
    public void setUp() {
    	try {
        // Setup Chrome WebDriver using WebDriverManager
          System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize WebDriver
        //WebDriver driver = new ChromeDriver();
        
        driver.get("https://test.wisdocity.ai");
        driver.manage().window().maximize();
    	}catch (Exception e) {
            e.printStackTrace(); // If WebDriver fails to initialize, print the error
        }  
    }
    
    @Test
    public void login() {
    	try {
    //For clicking the login button
    
    WebElement loginBtn= driver.findElement(By.xpath("//a[text()='Log In']")); 
    Thread.sleep(8000);    
    loginBtn.click();
        
    // Find tAD342Che username and password fields (replace with actual IDs or XPaths)
    WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='example@email.com']")); 
    WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='********']"));
    
    
 // Enter credentials (replace with your credentials)
    
    usernameField.sendKeys("Meenakshiaravind0719@gmail.com");
    passwordField.sendKeys("Meenakshi07");
    
    //Clicking the login button after giving the credentials
    WebElement submitField = driver.findElement(By.xpath("//button[@type='submit']"));
    submitField.click();
    synchronized(driver) {
    driver.wait(7000);}
    //For clicking the Profile Name 
    WebElement Profilename = driver.findElement(By.xpath("//span[@class='ml-4 text-sm font-semibold leading-6 text-gray-900']"));
    Profilename.click();
    //For Switching to expert profile
    WebElement SwitchToExpert = driver.findElement(By.xpath("//span[contains(text(),'Switch to Expert')]"));
    SwitchToExpert.click();
    
    //For Switching to Admin Profile
    WebElement SwitchToAdmin = driver.findElement(By.xpath("//span[contains(text(),'Switch to Super Admin')]"));
    SwitchToAdmin.click();
	 
    	}catch (Exception e) {
            e.printStackTrace();  // Handle any exceptions
        }   
}
   /* @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Ensure to close the browser after the test
        }
    }*/
}
