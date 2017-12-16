package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object1 {
	WebDriver driver;
	
	By checkBox1 = By.id("isAgeSelected");

    
	By checkAll = By.xpath("//input[@value='Check All']");
	By UnCheckAll = By.xpath("//input[@value='Uncheck All']");
    
    
    
    public Object1(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void clickOnChceckBox()
    {
    	driver.findElement(checkBox1).click();
    	
    }
    
    public void clickOnChceckButtin()
    {
    	driver.findElement(checkAll).click();
    	driver.findElement(UnCheckAll).click();
    	
    	
   }

}
