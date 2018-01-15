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
	public void testConcatenateAssertEquals() 
	{
    	resultTest = test.concatenate("Alicja","Kowalska");
		assertEquals("Alicja Kowalska",resultTest);
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
		assertEquals(0,test.multiply(6,2));
	}
	

	@Test
	public void testMultiplyAssertNotNull()
	{
		Assert.assertNotNull(test.multiply(6,2));
	}

	@Test
    public void testNull()
    {
        assertNull(peopleNumber.ifNull(36));
    }
	
    @Test
    public void testNotNull()
    {
        assertNotNull(peopleNumber.ifNull(3));
    }
    
    @Test
    public void testAssertTrue()
    {
    	assertTrue(peopleNumber.ifTrueOrFalse(36));  	
    }
    
    @Test
    public void testAssertFalse()
    {
    	assertFalse(peopleNumber.ifTrueOrFalse(-15));  	
    }
	

}
