package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytestcase {

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

	// Element
	@Test(priority = 2, enabled = true)
	public void addToCart() {
		WebElement FirstItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		WebElement SecondItem = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		// Action
		FirstItem.click();
		SecondItem.click();
	}

	// Element
	@Test(priority = 3, enabled = true)
	public void removeFromeToCart() {
		WebElement FirstItem = driver.findElement(By.id("remove-sauce-labs-backpack"));
		WebElement SecondItem = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
		// Action
		FirstItem.click();
		SecondItem.click();
	}

	@Test(priority = 4, enabled = true)
	public void checkout() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/cart.html"); // توجه للصفحة Navigate

		WebElement ChecKout = driver.findElement(By.id("checkout"));
		ChecKout.click();

		// Element
		WebElement FirstName = driver.findElement(By.id("first-name"));
		WebElement LastName = driver.findElement(By.id("last-name"));
		WebElement PostalCode = driver.findElement(By.id("postal-code"));

		// Actions
		FirstName.sendKeys("marwan");
		LastName.sendKeys("omar");
		PostalCode.sendKeys("21129");

		WebElement ContinueButton = driver.findElement(By.id("continue"));
		ContinueButton.click();

		WebElement FinishButton = driver.findElement(By.id("finish"));
		FinishButton.click();

		WebElement BackToProducts = driver.findElement(By.id("back-to-products"));
		BackToProducts.click();

	}

	@Test(priority = 5, enabled = true)

	public void logout() throws InterruptedException {

		WebElement Burgermenu = driver.findElement(By.id("react-burger-menu-btn"));
		Burgermenu.click();

		Thread.sleep(1000);

		WebElement Logout = driver.findElement(By.id("logout_sidebar_link"));
		Logout.click();

	}

	@AfterTest
	public void AfterThetestIsDone() {
		driver.close();
	}

}
