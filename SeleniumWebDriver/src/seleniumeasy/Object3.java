package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Object3 {
	
	WebDriver driver;
	
	By femaleBtn = By.xpath("//input[@value='Female'][@name='optradio']");
	By checkBtn = By.xpath("//button[@id='buttoncheck']");
	By maleBtn = By.xpath("//input[@value='Male'][@name='gender']");
	By ageBtn = By.xpath("//input[@value='0 - 5'][@name='ageGroup']");
	By checkBtn2 = By.xpath("//button[@onclick='getValues();']");
    
    public Object3(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void femaleButton()
    {
    	driver.findElement(femaleBtn).click();
    	driver.findElement(checkBtn).click();
    }
    
    public void maleButton()
    {
    	driver.findElement(maleBtn).click();
    	driver.findElement(ageBtn).click();
    	driver.findElement(checkBtn2).click();
    }

	
}


    
