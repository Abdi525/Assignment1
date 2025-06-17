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
public class MessageClassTest {
    
    public MessageClassTest() {
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
     * Test of setMessageID method, of class MessageClass.
     */
    @Test
    public void testSetMessageID() {
        System.out.println("setMessageID");
        MessageClass instance = new MessageClass();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageID method, of class MessageClass.
     */
    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
        MessageClass instance = new MessageClass();
        String expResult = "";
        String result = instance.getMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessagesHash method, of class MessageClass.
     */
    @Test
    public void testSetMessagesHash() {
        System.out.println("setMessagesHash");
        MessageClass instance = new MessageClass();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageHash method, of class MessageClass.
     */
    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
        MessageClass instance = new MessageClass();
        String expResult = "";
        String result = instance.getMessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Recipient method, of class MessageClass.
     */
    @Test
    public void testRecipient() {
        System.out.println("Recipient");
        MessageClass instance = new MessageClass();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecipient method, of class MessageClass.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        MessageClass instance = new MessageClass();
        String expResult = "";
        String result = instance.getRecipient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class MessageClass.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        MessageClass instance = new MessageClass();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class MessageClass.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        MessageClass instance = new MessageClass();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class MessageClass.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        MessageClass instance = new MessageClass();
        instance.create();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class MessageClass.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String number = "";
        MessageClass instance = new MessageClass();
        boolean expResult = false;
        boolean result = instance.checkRecipientCell(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class MessageClass.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        MessageClass instance = new MessageClass();
        String expResult = "";
        String result = instance.createMessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class MessageClass.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        MessageClass instance = new MessageClass();
        String expResult = "";
        String result = instance.sendMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageDetails method, of class MessageClass.
     */
    @Test
    public void testGetMessageDetails() {
        System.out.println("getMessageDetails");
        MessageClass instance = new MessageClass();
        String expResult = "";
        String result = instance.getMessageDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessageHash method, of class MessageClass.
     */
    @Test
    public void testSetMessageHash() {
        System.out.println("setMessageHash");
        String messageHash = "";
        MessageClass instance = new MessageClass();
        instance.setMessageHash(messageHash);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecipient method, of class MessageClass.
     */
    @Test
    public void testSetRecipient() {
        System.out.println("setRecipient");
        String recipient = "";
        MessageClass instance = new MessageClass();
        instance.setRecipient(recipient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
