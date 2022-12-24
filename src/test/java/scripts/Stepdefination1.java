package scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Ecommerce.Firelawn.genericLIB.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pompages.CartPage;
import pompages.DemoLogin;
import pompages.Skillrarylogin;

public class Stepdefination1 extends BaseClass{
	
	public WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() throws IOException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fu.getthepropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("click on gears and click on demoappskillrary")
	public void click_on_gears_and_click_on_demoappskillrary()  {
		
		Skillrarylogin l=new Skillrarylogin(driver);
		l.Skillraydemoapp();
		webutilies.switchtabs(driver);
	}
	

	@When("mouse hover on course and click on add to cart")
	public void mouse_hover_on_course_and_click_on_add_to_cart() throws InterruptedException {
		Thread.sleep(10000);
		DemoLogin d=new DemoLogin(driver);
		webutilies.mouseHover(driver, d.getCoursetab());
		d.seleniumtraining();
	}

	@When("double click on pluse icon and click on addtocart")
	public void double_click_on_pluse_icon_and_click_on_addtocart() {

	CartPage c=new CartPage(driver);
	webutilies.doubleclick(driver, c.getPluse());
	c.addcart();
}

	@Then("product should be successfully added to cart")
	public void product_should_be_successfully_added_to_cart() {
		webutilies.alterpopup(driver);
		driver.quit();
	}
}
