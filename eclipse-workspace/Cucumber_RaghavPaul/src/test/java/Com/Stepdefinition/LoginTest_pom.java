package Com.Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.Loginpage_POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest_pom {
	
	WebDriver driver=null;
	
	Loginpage_POM login;
	
	@SuppressWarnings("deprecation")
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		
		System.setProperty("gecko.driver.webdriver", "C:\\Users\\shiva\\eclipse-workspace\\Cucumber_RaghavPaul\\src\\main\\java\\Drivers\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    
	}

	@And("user is on applcation login page")
	public void user_is_on_applcation_login_page() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_the_admin_and_admin123(String username,String password) {
		
		
		login=new Loginpage_POM(driver);
		login.setusername(username);
		login.setpassword(password);
		
	   
	}

	@And("user click on the login button")
	public void user_click_on_the_login_button() {
		
		login.clicklogin();
	}

	@Then("user navigate to the Homepage Dashboard")
	public void user_navigate_to_the_homepage_dashboard() {
		
		//driver.getPageSource().contains("Dashboard");
		
		driver.close();
	}

}
