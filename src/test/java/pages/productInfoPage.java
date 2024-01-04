package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productInfoPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	public productInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	public void clickOnAddToCart() {
		addToCartButton.click();
	}

}
