package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDropDownSelectList {
	
	WebDriver driver;

	By selectBtn = By.xpath("//select[@id='select-demo']");
	By checkBtn = By.xpath("//option[@value='Monday']");
	
    public SelectDropDownSelectList(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void clickOnButton()
    {
    	driver.findElement(selectBtn).click();
    }

    public void selectValueClick()
    {
    	driver.findElement(checkBtn).click();
    }
    

}
