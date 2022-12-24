package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	@FindBy(id="add")
	private WebElement pluse;
	
	@FindBy(xpath="//button[@ondblclick=\"addtocart()\"]")
	private WebElement cartbtn;


	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPluse() {
		return pluse;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}

	public void addcart() {
		cartbtn.click();
	}
}

