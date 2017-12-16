package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object8 {
	
	WebDriver driver;
	
	By startBtn = By.xpath("//button[@id='downloadButton']");
	By closeBtn = By.xpath("//div[@class='ui-dialog-buttonset']");

    
    public Object8(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void downloadButton()
    {
    	driver.findElement(startBtn).click();
    	//driver.findElement(closeBtn).click();
    }
    public void closeButton()
    {
    	//driver.findElement(startBtn).click();
    	driver.findElement(closeBtn).click();
    }

}
