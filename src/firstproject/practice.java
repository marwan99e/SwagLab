package firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice {
	WebDriver driver = new EdgeDriver();

	@BeforeTest

	public void mySetup() {

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

	}

	// Element
	@Test(priority = 1, enabled = true)
	public void login() {
		WebElement Username = driver.findElement(By.id("user-name"));
		WebElement Changepassword = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

		// Action
		Username.sendKeys("standard_user");
		Changepassword.sendKeys("secret_sauce");
		LoginButton.click();

	}

	@Test(priority = 2)
	public void AddItems() {

		List<WebElement> addButtons = driver.findElements(By.className("btn_primary"));
		List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
		List<WebElement> itemNames = driver.findElements(By.className("inventory_item_name"));

	

		for (int i = 0; i < addButtons.size(); i++) {
			
			if (i%2==0) {
				addButtons.get(i).click();
				System.out.println(itemNames.get(i).getText()+ "this item has been added" +prices.get(i).getText());
				

			}else {
				
				System.out.println(itemNames.get(i).getText()+ "this item has not been added" +prices.get(i).getText());
				
			}
			
			
			

		}

	}

/*
 Code Added All Items
 
 List<WebElement> AddItems = Driver.findElements(By.ClassName("btn_primary") ;
 For (int i = 0; i<AddItems.Size();i++){
 AddItems.get(i).Click();
 
 
 } 
 */
 


}
