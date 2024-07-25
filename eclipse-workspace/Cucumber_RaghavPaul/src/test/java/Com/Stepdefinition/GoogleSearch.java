//package Com.Stepdefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.java.en.*;
//
//public class GoogleSearch {
//	
//	WebDriver driver=null;
//	
//	
//	@Given("User launch the browser")
//	public void user_launch_the_browser() {
//		
//		System.setProperty("gecko.driver.webdriver", "C:\\Users\\shiva\\eclipse-workspace\\Cucumber_RaghavPaul\\src\\main\\java\\Drivers\\geckodriver.exe");
//		driver=new FirefoxDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//	   
//	}
//
//	@And("user is on search page")
//	public void user_is_on_search_page() {
//		
//		System.out.println("Inside- user is on gogle search page");
//		
//	    
//	}
//
//	@When("user enter the text in serach feild")
//	public void user_enter_the_text_in_serach_feild() {
//		
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//	   
//	}
//
//	@And("user hits the enter button")
//	public void user_hits_the_enter_button() {
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	    
//	}
//
//	@Then("user is on the target page")
//	public void user_is_on_the_target_page() {
//		
//		System.out.println("Inside- User is on the target page");
//		
//		driver.getPageSource().contains("Online Courses");
//		driver.findElement(By.linkText("Online Courses")).click();
//		
//		driver.close();
//	   
//	}
//
//
//}
