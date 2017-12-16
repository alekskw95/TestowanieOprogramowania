package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Object6 {

	WebDriver driver;
	
	By text = By.xpath("//textarea[@id='textbox']");
	By generateBtn = By.xpath("//button[@id='create']");
	By downloadBtn = By.xpath("//a[@id='link-to-download']");

    
    public Object6(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void Download(String txt)
    {

    	driver.findElement(text).sendKeys(txt);
    	driver.findElement(generateBtn).click();
    	driver.findElement(downloadBtn).click();
    }

}
