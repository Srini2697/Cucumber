package pompages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLogin {
	
	public WebDriver driver;

	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="(//a[text()=\"Selenium Training\"])[1]")
	private WebElement seleniumtraining;
	
	
	public DemoLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCoursetab() {
		return coursetab;
	}


	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public CartPage seleniumtraining() {
		seleniumtraining.click();
		return new CartPage(driver);
	}
	
	
}
