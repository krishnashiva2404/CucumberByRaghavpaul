//package Com.Stepdefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.java.en.*;
//
//public class Login_parameter_orng {
	
//	WebDriver driver=null;
//	@SuppressWarnings("deprecation")
//	@Given("User launch the browser")
//	public void user_launch_the_browser() {
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
//	@And("user is on applcation login page")
//	public void user_is_on_applcation_login_page() {
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_the_admin_and_admin123(String username,String password) {
//		
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	   
//	}
//
//	@And("user click on the login button")
//	public void user_click_on_the_login_button() {
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}
//
//	@Then("user navigate to the Homepage Dashboard")
//	public void user_navigate_to_the_homepage_dashboard() {
//		
//		driver.getPageSource().contains("Dashboard");
//		
//		driver.close();
	    
//	}
//	
//	
//
//
//}
