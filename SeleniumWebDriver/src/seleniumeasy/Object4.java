package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Object4 {
	
	WebDriver driver;

	By selectBtn = By.xpath("//select[@id='select-demo']");
	By checkBtn = By.xpath("//option[@value='Monday']");
	By select2Btn = By.xpath("//select[@id='multi-select']");
	By check2Btn = By.xpath("//option[@value='Florida']");
	By firstselectBtn = By.xpath("//button[@id='printMe']");
	
    public Object4(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void selectButton()
    {
    	driver.findElement(selectBtn).click();
    	driver.findElement(checkBtn).click();
    }
    
    public void multiButton()
    {
    	driver.findElement(select2Btn).click();
    	driver.findElement(check2Btn).click();
    	driver.findElement(firstselectBtn).click();
    }
    

	
}
