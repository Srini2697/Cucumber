package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrarylogin {

	public WebDriver driver;
	

	@FindBy(xpath="//a[text()=\" GEARS \"]")
	private WebElement gearbtn;
	
	@FindBy(xpath="(//a[@target=\"_blank\"])[16]")
	private WebElement skillraydemoapp;
	
	public Skillrarylogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	


	public DemoLogin Skillraydemoapp() {
		gearbtn.click();
		skillraydemoapp.click();
		return new DemoLogin(driver);
	}


	public WebElement getGearbtn() {
		return gearbtn;
	}

	public WebElement getSkillraydemoapp() {
		return skillraydemoapp;
	}
	
	
 }
	
