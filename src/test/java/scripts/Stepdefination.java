package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {

	public WebDriver driver;
	
	@Given("open the browser enter the url")
	public void open_the_browser_enter_the_url() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}

	@When("enter valida usename and valid the password")
	public void enter_valida_usename_and_valid_the_password() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  
	}

	@When("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	   
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
	   String title=driver.getTitle();
	   if(title.equals("actiTIME -  Enter Time-Track")) {
		   System.out.println("pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
	   driver.close();
	}

	
	
	
	
}
