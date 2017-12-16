package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object5 {

	WebDriver driver;
	By dataChooseBtn = By.xpath("//input[@id='input-search']");	
	
	public Object5(WebDriver driver)
    {
    	this.driver = driver;
    }
	
	public void whatSend(String a, String b)
	{
		driver.findElement(dataChooseBtn).sendKeys(a);
		driver.findElement(dataChooseBtn).clear();
		driver.findElement(dataChooseBtn).sendKeys(b);
	}
	
}
