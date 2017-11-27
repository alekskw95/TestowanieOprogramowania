package liczby;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LiczbyTest {
    private Liczby lb;
    
    public LiczbyTest() {
        assertFalse(false);
        assertTrue(true);
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
        System.out.flush();
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
        System.out.flush();
        System.gc();
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
        System.out.flush();
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
        System.out.flush();
        System.gc();
    }

    /**
     * Test of getX method, of class Liczby.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        System.out.flush();
        lb = new Liczby(3,4);
        Integer expResult = 3;
        Integer result = lb.getX();
        assertEquals(expResult, result);

    }

    /**
     * Test of setX method, of class Liczby.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        System.out.flush();
        Integer expResult = 4;
        lb = new Liczby(0,5);
        lb.setX(4);
        assertEquals(expResult, lb.getX()); 

    }

    /**
     * Test of getY method, of class Liczby.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        System.out.flush();
        lb = new Liczby(4,5);
        Integer expResult = 5;
        Integer result = lb.getY();
        assertEquals(expResult, result);

    }

    /**
     * Test of setY method, of class Liczby.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        System.out.flush();
        Integer expResult = 5;
        lb = new Liczby(4,0);
        lb.setY(5);
        assertEquals(expResult, lb.getY());

    }

    /**
     * Test of czyPierwszaWiekszaLubRowna method, of class Liczby.
     */
    @Test
    public void testCzyPierwszaWiekszaLubRowna() {
        System.out.println("Pierwsza większa od drugiej - True");
        System.out.flush();
        lb = new Liczby(10, 1);
        Assert.assertTrue(lb.czyPierwszaWiekszaLubRowna()); 

    }
    
    @Test
        public void czyPierwszaWiekszaLubRownaTT() {
        System.out.println("Pierwsza większa rowna drugiej - True");
        System.out.flush();
        lb = new Liczby(10, 10);
        Assert.assertEquals(true,lb.czyPierwszaWiekszaLubRowna()); 
    }
        
    @Test
        public void czyPierwszaWiekszaLubRownaF() {
        System.out.println("Pierwsza większa od drugiej - False");
        System.out.flush();
        lb = new Liczby(1, 10);
        Assert.assertFalse(lb.czyPierwszaWiekszaLubRowna());   
    }

    @Test
        public void czyNULL() {
        System.out.println("NULL");
        System.out.flush();
        lb = new Liczby(null, 10);
        Assert.assertNull(lb.getX()); 
    }

    @Test
        public void czyNotNULL() {
        System.out.println("NOT_NULL");
        System.out.flush();
        lb = new Liczby(10, null);
        Assert.assertNotNull(lb.getX());   
    }
    
}
