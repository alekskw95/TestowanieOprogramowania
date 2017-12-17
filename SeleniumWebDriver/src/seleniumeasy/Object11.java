package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object11 {

	WebDriver driver;

	By firstName = By.xpath("//input[@name='first_name']");
	By lastName = By.xpath("//input[@name='last_name']");
	By email = By.xpath("//input[@name='email']");
	By phone = By.xpath("//input[@name='phone']");
	By address = By.xpath("//input[@name='address']");
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//select[@name='state']");
	By zipcode = By.xpath("//input[@name='zip']");
	By website = By.xpath("//input[@name='website']");
	By hosting = By.xpath("//input[@name='hosting'][@value='no'][@type='radio']");
	By projectDescription = By.xpath("//textarea[@name='comment']");
	By savebutton = By.xpath("//button[@class='btn btn-default']");
	
	public Object11(WebDriver driver)
	{
		this.driver=driver;
	}

	public void contact(String Fname, String Lname, String Email, String Phone, String Address, String City, String State, String Zip, String Web, String Description) 
	{
		driver.findElement(firstName).sendKeys(Fname);
		driver.findElement(lastName).sendKeys(Lname);
		driver.findElement(email).sendKeys(Email);
		driver.findElement(phone).sendKeys(Phone);
		driver.findElement(address).sendKeys(Address);
		driver.findElement(city).sendKeys(City);
		driver.findElement(state).click();
		driver.findElement(state).sendKeys(State);
		driver.findElement(state).click();
		driver.findElement(zipcode).sendKeys(Zip);
		driver.findElement(website).sendKeys(Web);
		driver.findElement(hosting).click();
		driver.findElement(projectDescription).click();
		driver.findElement(projectDescription).sendKeys(Description);
		
	}
	
	public void submitButton()
	{
		driver.findElement(savebutton).click();
	}

	
}