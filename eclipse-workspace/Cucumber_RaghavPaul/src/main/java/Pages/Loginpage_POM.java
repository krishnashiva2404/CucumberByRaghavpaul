package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_POM {
	
	WebDriver driver;
	
	By txt_username= By.name("username");
	
	By txt_password= By.name("password");
	
	By btn_login= By.xpath("//button[@type='submit']");
	
	public Loginpage_POM(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setusername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void setpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clicklogin() {
		driver.findElement(btn_login).click();
	}

}
