/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class Assignment1Test {
    
    public Assignment1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Assignment1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Assignment1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveMessageToFile method, of class Assignment1.
     */
    @Test
    public void testSaveMessageToFile() {
        System.out.println("saveMessageToFile");
        MessageClass message = null;
        Assignment1.saveMessageToFile(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadStoredMessagesIntoArray method, of class Assignment1.
     */
    @Test
    public void testLoadStoredMessagesIntoArray() {
        System.out.println("loadStoredMessagesIntoArray");
        MessageClass[] storedMessages = null;
        Assignment1.loadStoredMessagesIntoArray(storedMessages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
