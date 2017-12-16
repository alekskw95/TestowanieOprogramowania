package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object10 {

	WebDriver driver;
	
	By modalBtn = By.xpath("//a[@href='#myModal0']");
	By saveBtn = By.xpath("//a[@class='btn']");
	By closeBtn = By.xpath("//button[@class='close']");
	By modal2Btn = By.xpath("//a[@href='#myModal']");
	By launchBtn = By.xpath("//a[@href='#myModal2']");
	By close2Btn = By.xpath("//a[@class='btn btn-primary']");
	
    public Object10(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void singleModal()
    {
    	driver.findElement(modalBtn).click();
    	driver.findElement(closeBtn).click();
    }
    public void multipleModal()
    {
    	driver.findElement(modal2Btn).click();
    	driver.findElement(launchBtn).click();
    	driver.findElement(close2Btn).click();
    }
}
