package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart_page {

	public WebDriver driver;
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
	private WebElement shoppingCartButton;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement checkOutButton;
	
	public ShoppingCart_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void continueToShoppingCart() {
        shoppingCartButton.click();
		
	}
	public Checkout_page checkoutOption() {
		checkOutButton.click();
		return new Checkout_page(driver);
	}
		
	}
	

