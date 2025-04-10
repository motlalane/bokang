/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Registration.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registration.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeLoginCredentials method, of class Registration.
     */
    @Test
    public void testStoreLoginCredentials() {
        System.out.println("storeLoginCredentials");
        String username = "";
        String password = "";
        Registration instance = new Registration();
        instance.storeLoginCredentials(username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLoginCredentials method, of class Registration.
     */
    @Test
    public void testCheckLoginCredentials() {
        System.out.println("checkLoginCredentials");
        String username = "";
        String password = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkLoginCredentials(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test 
    public void testCheckUserName(){
        System.out.println("checkUserName");
        String username = "Kyl_";
        boolean expResult = true;
        boolean result = Registration.checkUserName(username);
        assertEquals(expResult, result);
    }
}
