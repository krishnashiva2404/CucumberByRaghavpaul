package Com.Stepdefinition;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

//public class Login_Orng_hrm {
//	
//	WebDriver driver=null;
//	
//	@SuppressWarnings("deprecation")
//	@Given("User launch the application")
//	public void user_launch_the_application() {
//		
//		System.setProperty("gecko.driver.webdriver", "C:\\Users\\shiva\\eclipse-workspace\\Cucumber_RaghavPaul\\src\\main\\java\\Drivers\\geckodriver.exe");
//		
//		driver=new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//	    
//	}
//
//	@And("user on the login page")
//	public void user_on_the_login_page() {
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    
//	}
//
//	@When("user enter the login details")
//	public void user_enter_the_login_details() {
//		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//	    
//	}
//
//	@And("user click the login button")
//	public void user_click_the_login_button() {
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	   
//	}
//
//	@Then("user Navigate to the Homepage")
//	public void user_navigate_to_the_homepage() {
//		
//		driver.getPageSource().contains("Dashboard");
//		
//		driver.close();
//	    
//	}
//
//
//
//
//}
