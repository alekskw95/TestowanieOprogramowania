package pl.lodz.uni.math.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicFirstForm {

	WebDriver driver;
    
    By textBox = By.xpath("//input[@id='user-message']");
    By showBtn = By.xpath("//button[@onclick='showInput();']");
    
	
    
    public BasicFirstForm(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    
    public void clickOnTextBox()
    {    	
    	driver.findElement(textBox).click();	
    }
    
    
    public void enterElementBox(String text)
    {
    	driver.findElement(textBox).sendKeys(text);
    }
    
    public void clickButtonShowText()
    {
    	driver.findElement(showBtn).click();
    }
}
