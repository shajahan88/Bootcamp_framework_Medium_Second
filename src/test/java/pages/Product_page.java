package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page {
	
	
	public WebDriver driver;
	
	@FindBy(linkText = "MacBook Air")
	private WebElement selectProduct;
	
	
	public Product_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void selectproductOption() {
		selectProduct.click();
	}
	

}
