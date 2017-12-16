package seleniumeasy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import seleniumeasy.Object1;
import seleniumeasy.Object2;

public class testSelenium {

	@Before
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "F:/ECLIPSEoxygen/eclipse-workspace/seleniumjar/geckodriver.exe");

		
	}
	
	
	/*@Test
	public void testPage() throws InterruptedException //Dzia³a
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		Object1 object = new Object1(driver);
      
		object.clickOnChceckBox();
		Thread.sleep(5000);
		object.clickOnChceckButtin();
		Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
		
		driver.quit();
	}
	
	@Test
	public void testPage2() throws InterruptedException //Dzia³a
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		Object2 object = new Object2(driver);
      
		object.clickOnTextBox("TEST");
		Thread.sleep(5000);
		object.totalAB("10","27");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("37"));
		Assert.assertTrue(driver.getPageSource().contains("TEST"));
		
		driver.quit();
	}*/
	
	/*@Test
	public void testPage3() throws InterruptedException //Dziala
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		Object3 object = new Object3(driver);
      
		object.femaleButton();
		
		Thread.sleep(5000);
		
		object.maleButton();
		
		Thread.sleep(5000);
		
		driver.quit();
	}*/
	
	/*@Test
	public void testPage4() throws InterruptedException  //Dziala
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		Object4 object = new Object4(driver);
      
		object.selectButton();
		
		Thread.sleep(5000);
		
		object.multiButton();
		
		Thread.sleep(5000);
		
		driver.quit();
	}*/
	
	@Test
	public void testPage11() throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
		
		Object11 object = new Object11(driver);
      
		object.setForm("Agata","Nowakowska","now@pp.pl","821-452-7484","Wesola 26","Lodz","4444","double.com","Testing Selenium Page");
		

		driver.quit();
	}
	/*@Test
	public void testPage5() throws InterruptedException //Dzia³a
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/data-list-filter-demo.html");
		
		Object5 object = new Object5(driver);
      
		object.whatSend("Brenda","564-234-4444");
		
		Thread.sleep(5000);

		driver.quit();
	}*/
	
	/*@Test
	public void testPage6() throws InterruptedException //Dzia³a
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		
		Object6 object = new Object6(driver);
		Thread.sleep(5000);
		object.Download("Testing on Page Object");

		
		driver.quit();
	}*/
	
	/*@Test
	public void testPage7() throws InterruptedException //Dzia³a
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		
		Object7 object = new Object7(driver);
		Thread.sleep(5000);
		
		object.selectButton();
		Thread.sleep(5000);

		driver.quit();
	}*/
	
	/*@Test
	public void testPage8() throws InterruptedException //Dziala
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		
		Object8 object = new Object8(driver);

		object.downloadButton();
		Thread.sleep(5000);
		object.closeButton();

		driver.quit();
	}*/
	
	/*@Test
	public void testPage9() throws InterruptedException //Dziala
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
		
		Object9 object = new Object9(driver);

		object.downloadButton();
		Thread.sleep(5000);
		
		driver.quit();
	}*/
	
	/*@Test
	public void testPage10() throws InterruptedException //Dziala
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		
		Object10 object = new Object10(driver);

		object.singleModal();
		Thread.sleep(5000);
		object.multipleModal();
		Thread.sleep(5000);
		
		driver.quit();
	}*/
}
