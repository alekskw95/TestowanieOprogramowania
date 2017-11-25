/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class OsobaTest {
    
    public OsobaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BEFORE CLASS");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AFTER CLASS");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getImie method, of class Osoba.
     */
    @Test
    public void testGetImie() {
        System.out.println("getImie");
        Osoba instance = new Osoba();
        //String expResult = "Marta";
        //String result = instance.getImie();
        //assertEquals(expResult, result);
        System.out.println(instance.getImie());
    }

    /**
     * Test of setImie method, of class Osoba.
     */
    @Test
    public void testSetImie() {
        System.out.println("setImie");
        String imie = "";
        Osoba instance = new Osoba();
        instance.setImie("Marta");
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getWiek method, of class Osoba.
     */
    @Test
    public void testGetWiek() {
        System.out.println("getWiek");
        Osoba instance = new Osoba();
        int expResult = 0;
        int result = instance.getWiek();
        assertEquals(expResult, result);

    }

    /**
     * Test of setWiek method, of class Osoba.
     */
    @Test
    public void testSetWiek() {
        System.out.println("setWiek");
        int wiek = 0;
        Osoba instance = new Osoba();
        instance.setWiek(25);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
