package seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Object11 {

	WebDriver driver;
    
	By firstName = By.xpath("//input[@name='first_name']");	
	By lastName = By.xpath("//input[@name='last_name']");
	By email = By.xpath("//input[@name='email']");
	By telephone = By.xpath("//input[@name='phone']");
	By adress = By.xpath("//input[@name='address']");	
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//select[@class='form-control selectpicker]");
	//By stateWhat = By.xpath("//option['Alaska']");	
	By zip = By.xpath("//input[@name='zip']");
	By web = By.xpath("//input[@name='website']");
	By choose = By.xpath("//input[@value='yes']");
	By text = By.xpath("//textarea[@name='comment']");
	By submit = By.xpath("//button[@class='btn btn-default']");
	
  
    public Object11(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void setForm(String name, String sname, String mail, String tel, String adr, String cit, String code, String www, String txt)
    {
    	driver.findElement(firstName).sendKeys(name);
    	driver.findElement(lastName).sendKeys(sname);
    	driver.findElement(email).sendKeys(mail);
    	driver.findElement(telephone).sendKeys(tel);
    	driver.findElement(adress).sendKeys(adr);		
    	driver.findElement(choose).click();
    	driver.findElement(text).sendKeys(txt);
    	driver.findElement(city).sendKeys(cit);
    	driver.findElement(zip).sendKeys(code);
    	driver.findElement(web).sendKeys(www);
    	driver.findElement(state).click();
    	//driver.findElement(stateWhat).click();   	
    	driver.findElement(submit).click(); 	
    }
	

	
}