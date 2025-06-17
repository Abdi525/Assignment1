package assignment1;

import java.util.Scanner;
import java.util.regex.*;
import javax.swing.*;
import java.io.*;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner osy = new Scanner (System.in);
        Login user = new Login();
        MessageClass msg = new MessageClass();
        
        System.out.println("********************Registeration********************");
        System.out.println("Enter you Name: ");
        String Name = osy.nextLine();
        user.setName(Name);
        
        System.out.println("Enter your Surname: ");
        String Surname = osy.nextLine();
        user.setSurname(Surname);
        
        System.out.println("Enter your Username: ");
        String Username = osy.nextLine();
        user.setUsername(Username);
        
         if (user.checkUserName(Username)){
            System.out.println("Username successfully captured");
        }
         else{
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is not more than five characters in length");
        }
        //creating another loop so the user can input as many times needed to get the correct username format
        while (!user.checkUserName(Username)) {
            System.out.println("Enter your Username: ");
            Username = osy.nextLine();
            user.setUsername(Username);
       
            if (user.checkUserName(Username)){
                System.out.println("Username successfully captured");
        }
            else{
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is not more than five characters in length");
        }
        }
        
        System.out.println("Enter your Password: ");
        String Password = osy.nextLine();
        user.setPassword(Password);
        
        if (user.checkPasswordComplexity(Password)){
            System.out.println("Password successfully captured");
        }
        else{
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character");
        }
        //loop created so user enters as many times till they get the correct password
        while (!user.checkPasswordComplexity(Password)){
            System.out.println("Enter your password: ");
            Password = osy.nextLine();
            user.setPassword(Password);
            
            
            if (user.checkPasswordComplexity(Password)){
                System.out.println("Password successfully captured");
        }
            else{
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character");
        }
        }
        
        System.out.println("Enter your Phone number: ");
        String Phone_number = osy.nextLine();
        user.setPhone_number(Phone_number);
        
        if (user.checkCellPhoneNumber(Phone_number)){
            System.out.println("Phone number successfully captured");
        }
        else{
            System.out.println("Phone number incorrectly formatted or does not contain international code (+27)");
        }
        //loop created to make sure user enters the correct phone number
        while(!user.checkCellPhoneNumber(Phone_number)){
            System.out.println("Enter your Phone number: ");
            Phone_number = osy.nextLine();
            user.setPhone_number(Phone_number);
            
            
        if (user.checkCellPhoneNumber(Phone_number)){
            System.out.println("Phone number successfully captured");
        }
        else{
            System.out.println("Phone number incorrectly formatted or does not contain international code");
        }
        }
    
        System.out.println(user.RegisterUser(Username, Password));
        
        
        System.out.println("********************Login********************");
        System.out.println("Enter your Username: ");
        String enteredUsername = osy.nextLine();
        
        System.out.println("Enter your Password: ");
        String enteredPassword = osy.nextLine();
        
        if(user.loginUser(enteredUsername, enteredPassword)){
            user.returnLoginStatus(enteredUsername, enteredPassword);
        }
       
        while (!user.loginUser(enteredUsername, enteredPassword)){
            System.out.println("The username and password used to register must be the same as the ones used to login");
            System.out.println("Enter your Username: ");
            enteredUsername = osy.nextLine();
        
            System.out.println("Enter your Password: ");
            enteredPassword = osy.nextLine(); 
            
            if (user.loginUser(enteredUsername, enteredPassword)){
             user.returnLoginStatus(enteredUsername, enteredPassword);
            }
        }//end of while loop
        //scanner ends and JOption starts
        
        JOptionPane.showMessageDialog(null, "Welcome to Quickchat" );
        
        int messageMax = 0;
        int messagesSent = 0;
        int disregardedCount = 0;
        int hashCount = 0;

        MessageClass[] sentMessages = new MessageClass[100];
        MessageClass[] disregardedMessages = new MessageClass[100];
        MessageClass[] storedMessages = new MessageClass[100];
        String[] messageHashes = new String[100];
        String[] messageIDs = new String[100];
        
        int Option;
        Option = Integer.parseInt(JOptionPane.showInputDialog("Choose by pressing the number" 
                + "\n1 Send message" 
                + "\n2 Show recently sent messages"
                + "\n3 Display the longest message sent"
                + "\n4 Search for message using ID"
                + "\n5 Show messages sent to a recipient"
                + "\n6 Delete message using hash"
                + "\n7 Display full reprt of sent messages"
                + "\n8 Display all the senders and recipients"
                + "\n9 Quit"));
               
        while (Option !=9){
        switch(Option){
            case 1:
                if (messageMax == 0) {
                        messageMax = Integer.parseInt(JOptionPane.showInputDialog("Enter number of messages you want to send:"));
                        //allows only the number messages the user enters to be sent
                        sentMessages = new MessageClass[messageMax];
                    }// end of if loop
                if (messagesSent > messageMax) {
                        JOptionPane.showMessageDialog(null, "You have reached the max number of messages allowed");
                        break;
                    }//end of if loop

                    MessageClass message = new MessageClass();
                    message.create();
                    String action = message.sendMessage();

                    if (action.equals("1")) {
                        sentMessages[messagesSent] = message;
                        messageHashes[hashCount] = message.getMessageHash();
                        messageIDs[hashCount] = message.getMessageID();
                        messagesSent++;
                        hashCount++;
                        StringBuilder all = new StringBuilder();
                        for (int t = 0; t < messagesSent; t++) {
                            if (sentMessages[t] != null) {
                                all.append(sentMessages[t].getMessageDetails()).append("\n\n");
                            }
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Message sent!"+"/n" +"Total messages sent: " + messagesSent + "\n" + all.toString());
                        //displays the total number of messages a person sents and all the messages

                    }//end of if loop 
                    else if (action.equals("2")) {
                        disregardedMessages[disregardedCount++] = message;
                        
                    }//end of else if loop
                    else if (action.equals("3")) {
                        storedMessages[messagesSent] = message;
                        saveMessageToFile(message);
                    }//end of else if loop
                    break;
                    
            case 2:
                StringBuilder sentList = new StringBuilder();
                //loop to display the messages that were sent
                    for (int i = 0; i < messagesSent; i++) {
                        if (sentMessages[i] != null) {
                            sentList.append(sentMessages[i].getMessage()).append("\n");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "No messages were sent");
                        }
                    }
                    JOptionPane.showMessageDialog(null, sentList.toString());
                    break;
                
            case 3: 
                int maxLength = 0;
                //loop to find the longest message
                    for (int i = 1; i < messagesSent; i++) {
                        if (sentMessages[i] != null && sentMessages[i].getMessage().length() > sentMessages[maxLength].getMessage().length()) {
                            maxLength = i;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Longest message: " + sentMessages[maxLength].getMessage());
                    break;
                
            case 4:
                String searchID = JOptionPane.showInputDialog("Enter message ID: ");
                //loop to find message using message ID
                    for (int i = 0; i < hashCount; i++) {
                        if (messageIDs[i] != null && messageIDs[i].equals(searchID)) {
                            JOptionPane.showMessageDialog(null, "Recipient: " + sentMessages[i].getRecipient()
                                    + "\nMessage: " + sentMessages[i].getMessage());
                            break;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Wrong message ID, please try again!");
                        }
                    }
                    break;
                
            case 5:
                String searchRecipient = JOptionPane.showInputDialog("Enter recipient: ");
                    StringBuilder found = new StringBuilder();
                    //loop to find a message by entering the recipient
                    for (int i = 0; i < messagesSent; i++) {
                        if (sentMessages[i] != null && sentMessages[i].getRecipient().equals(searchRecipient)) {
                            found.append(sentMessages[i].getMessage()).append("\n");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Wrong number, please try again!");
                        }
                    }
                    JOptionPane.showMessageDialog(null, found.length() == 0 ? "No messages found." : found.toString());
                    break;
                
            case 6:
                String deleteHash = JOptionPane.showInputDialog("Enter message hash: ");
                //loop to delete a message using message Hash
                    for (int i = 0; i < hashCount; i++) {
                        if (messageHashes[i] != null && messageHashes[i].equals(deleteHash)) {
                            sentMessages[i] = null;
                            JOptionPane.showMessageDialog(null, "Message deleted");
                            break;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Message Hash not found, please try again!");
                        }
                    }
                    break;
                
            case 7:
                StringBuilder full = new StringBuilder("\n all Sent Messages: ");
                //loop to display all messages that were sent
                    for (int i = 0; i < messagesSent; i++) {
                        if (sentMessages[i] != null) {
                            full.append(sentMessages[i].getMessageDetails()).append("\n\n");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No messages were sent");
                        }
                    }
                    JOptionPane.showMessageDialog(null, full.toString());
                    break;
                
            case 8:
                StringBuilder info = new StringBuilder();
                //loop to show all the recipients that sent a message
                    for (int i = 0; i < messagesSent; i++) {
                        if (sentMessages[i] != null) {
                            info.append(" | Recipient: ").append(sentMessages[i].getRecipient()).append("\n");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "No messages were sent!");
                        }
                    }
                    JOptionPane.showMessageDialog(null, info.toString());
                    break;
                
            case 9:
                JOptionPane.showMessageDialog(null,"Quit");
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"error");   
        }//end of switch case
        Option = Integer.parseInt(JOptionPane.showInputDialog("Choose by pressing the number" 
                + "\n1 Send message" 
                + "\n2 Show recently sent messages"
                + "\n3 Display the longest message sent"
                + "\n4 Search for message using ID"
                + "\n5 Show messages sent to a recipient"
                + "\n6 Delete message using hash"
                + "\n7 Display full reprt of sent messages"
                + "\n8 Display all the senders and recipients"
                + "\n9 Quit"));
        //it is to keep on prompting the user until they enter quit 
        }//end of while loop
    }
    public static void saveMessageToFile(MessageClass message) {
        try {
            FileWriter fw = new FileWriter("stored_messages.json", true);
            fw.write("{\"recipient\":\"" + message.getRecipient() + "\",\"message\":\"" + message.getMessage() + "\"}\n");
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file");
        }
    }
    public static void loadStoredMessagesIntoArray(MessageClass[] storedMessages) {
        File f = new File("stored_messages.json");
        if (!f.exists()) {
            JOptionPane.showMessageDialog(null, "No stored messages found.");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("stored_messages.json"));
            String line;
            int i = 0;
            while ((line = br.readLine()) != null && i < storedMessages.length) {
                String recipient = line.split("\"recipient\":\"")[1].split("\"")[0];
                String message = line.split("\"message\":\"")[1].split("\"}")[0];

                MessageClass m = new MessageClass();
                m.setRecipient(recipient);
                m.setMessage(message);
                m.setMessageID(String.valueOf((long)(Math.random() * 1000)));
                m.setMessageHash(m.createMessageHash());

                storedMessages[i] = m;
                i++;
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading stored messages from file");
        }
    }
}

