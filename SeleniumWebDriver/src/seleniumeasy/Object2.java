package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object2 {
	
		WebDriver driver;
    
	    By textBox = By.xpath("//input[@id='user-message']");
	    By UnCheckAll = By.xpath("//input[@value='Uncheck All']");
	    By showBtn = By.xpath("//button[@onclick='showInput();']");
	    By enterA = By.xpath("//input[@id='sum1']");
	    By enterB = By.xpath("//input[@id='sum2']");
	    By getBtn = By.xpath("//button[@onclick='return total()']");
		
	    
	    public Object2(WebDriver driver)
	    {
	    	this.driver = driver;
	    }
	    
	    public void clickOnTextBox(String text)
	    {
	    	
	    	driver.findElement(textBox).click();
	    	driver.findElement(textBox).clear();
	    	driver.findElement(textBox).sendKeys(text);
	    	driver.findElement(showBtn).click();
	    	
	    	
	    }
	    
	    public void totalAB(String a, String b)
	    {
	    	
	    	driver.findElement(enterA).sendKeys(a);
	    	driver.findElement(enterB).sendKeys(b);
	    	driver.findElement(getBtn).click();
	    }

}
