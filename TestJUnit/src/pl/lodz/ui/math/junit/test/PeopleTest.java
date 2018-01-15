package pl.lodz.ui.math.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class PeopleTest {
	
	private static People test;
	private String resultTest;
	private int resultNumber;
	private People peopleNumber;

    @BeforeClass
    public static void setUpClass()    {
    	test = new People();
    }
    
    @AfterClass
    public static void tearDownClass()    {
        
    }
    
    @Before
    public void setUp()  {
    	peopleNumber = new People();
    }
    
    @After
    public void tearDown()   {
    	peopleNumber = null;
    }

    @Test
	public void testConcatenateEquals() 
	{
    	resultTest = test.concatenate("Alicja","Kowalska");
		assertEquals("Alicja Kowalska",resultTest);
	}
	
	@Test
	public void tesConcatenateEqualsWarnning() 
	{
		resultTest = test.concatenate("Alicja","Kowalska");
		assertEquals("AlicjaKowalska",resultTest);
	}
	
	@Test
	public void testConcatenateAssertTrue()
	{
		resultTest= test.concatenate("Alicja","Kowalska");
		Assert.assertTrue(resultTest,true);
	}
	
	@Test
	public void testConcatenateAssertTrueWarnning()
	{
		resultTest = test.concatenate("Alicja","Kowalska");
		Assert.assertTrue(resultTest,false);
	}
	
	@Test
	public void testConcatenateAssertFalse()
	{
		resultTest = test.concatenate("Alicja","Kowalska");
		Assert.assertFalse(resultTest,false);
	}
	
	@Test
	public void testConcatenateAssertFalseWarnning()
	{
		resultTest = test.concatenate("Alicja","Kowalska");
		Assert.assertFalse(resultTest,true);
	}
	
	
	@Test
	public void testConcatenateAssertNull()
	{
		resultTest = test.concatenate("Alicja","Kowalska");
		Assert.assertNull(resultTest);
	}

	@Test
	public void testConcatenateAssertNotNull()
	{
		resultTest = test.concatenate("Alicja","Kowalska");
		Assert.assertNotNull(resultTest);
	}
	
	
	@Test
	public void testMultiplyEquals() 
	{
		resultNumber = test.multiply(6,2);
		assertEquals(0,resultNumber);
	}
	
	@Test
	public void testMultiplyEqualsWarnning() 
	{
		resultNumber = test.multiply(6,2);
		assertEquals(1,resultNumber);
	}
	
	@Test
	public void testMultiplyAssertTrue()
	{
		test.multiply(6,2);
		Assert.assertTrue(true);
	}
	
	@Test
	public void testMultiplyAssertTrueWarnning()
	{
		test.multiply(6,2);
		Assert.assertTrue(false);
	}
	
	@Test
	public void testMultiplyAssertFalse()
	{
		test.multiply(6,2);
		Assert.assertFalse(false);
	}
	
	@Test
	public void testMultiplyAssertFalseWarnning()
	{
		test.multiply(6,2);
		Assert.assertFalse(true);
	}
	
	
	@Test
	public void testMultiplyAssertNull()
	{
		resultNumber = test.multiply(6,2);
		Assert.assertNull(resultNumber);
	}

	@Test
	public void testMultiplyAssertNotNull()
	{
		resultNumber= test.multiply(6,2);
		Assert.assertNotNull(resultNumber);
	}

	@Test
    public void testNull()
    {
    	People x = peopleNumber.ifNull(20);
        assertNull(x);
    }
	
    @Test
    public void testNotNull()
    {
    	People x = peopleNumber.ifNull(3);
        assertNotNull(x);
    }
	

}
