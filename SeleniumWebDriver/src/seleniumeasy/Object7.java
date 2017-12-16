package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object7 {
	
	WebDriver driver;
	
	public Object7(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By selectBtn = By.xpath("//span[@class='select2-selection select2-selection--single']");
	//By selectBtn1 = By.xpath("//span[@class='select2-search select2-search--dropdown']");
	//By selectBtn2 = By.xpath("//span[@id='select2-bst9-container']");
	By selectBtn3 = By.xpath("//select[@id='files']");
	

	public void selectButton() throws InterruptedException
    {
		driver.findElement(selectBtn).click(); 
		Thread.sleep(5000);
		//driver.findElement(selectBtn1).click();
		//Thread.sleep(5000);
		//driver.findElement(selectBtn2).
		//Thread.sleep(5000);
    	driver.findElement(selectBtn3).click();
    }
}
