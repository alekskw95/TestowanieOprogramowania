package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object7 {
	
	WebDriver driver;
	
	public Object7(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By GclickBtn = By.xpath("//button[@type='button'][@class='btn btn-success btn-filter'][@data-target='pagado']");
	By OclickBtn = By.xpath("//button[@type='button'][@class='btn btn-warning btn-filter'][@data-target='pendiente']");
	By RclickBtn = By.xpath("//button[@type='button'][@class='btn btn-danger btn-filter'][@data-target='cancelado']");

	public void clickButton()
    {
    	driver.findElement(GclickBtn).click();
    	driver.findElement(OclickBtn).click();
    	driver.findElement(RclickBtn).click();
    }
}
