package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleCheckBox {
	
	WebDriver driver;
	
	By checkAll = By.xpath("//input[@value='Check All']");
	By UnCheckAll = By.xpath("//input[@value='Uncheck All']");
    
    
    public MultipleCheckBox(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void clickOnCheckButton()
    {
    	driver.findElement(checkAll).click();
    }
    
    public void clickOnUnCheckButton()
    {
    	driver.findElement(UnCheckAll).click();
    }
    

}
