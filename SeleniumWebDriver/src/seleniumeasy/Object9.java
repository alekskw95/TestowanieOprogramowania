package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object9 {

WebDriver driver;
	
	By startBtn = By.xpath("//button[@id='cricle-btn']");

    
    public Object9(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void downloadButton()
    {
    	driver.findElement(startBtn).click();
    }

}
