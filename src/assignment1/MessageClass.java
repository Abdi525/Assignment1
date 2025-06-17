package assignment1;

import javax.swing.JOptionPane;

public class MessageClass {
    private static int messageCounter = 0; 
    private String messageID;
    private String recipient;
    private String Message;
    private String messageHash;
    private String sender;

    public void setMessageID(String MessageID) {
        this.messageID = MessageID;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageHash(String MessageHash) {
        this.messageHash = MessageHash;
    }

    public String getMessageHash() {
        return messageHash;
    }

    public void setRecipient(String Recipient) {
        this.recipient = Recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getMessage() {
        return Message;
    }
    
public void create(){
    this.messageID = String.valueOf((long)(Math.random()*100));
    messageCounter++;
        
    while (true) {
        recipient = JOptionPane.showInputDialog("Enter recipient phone number (e.g. +27...)");
      if (checkRecipientCell(recipient)) {
        JOptionPane.showMessageDialog(null, "Phone number captured.");
        break;
        }
      else {
         JOptionPane.showMessageDialog(null, "Invalid phone number. Must start with '+' and be 12 digits long.");
        }
}  
    while (true) {
        Message = JOptionPane.showInputDialog("Enter your message (max 250 characters):");
       if (Message.length() <= 250) {
         JOptionPane.showMessageDialog(null, "Message accepted.");
        break;
        }
       else {
           JOptionPane.showMessageDialog(null, "Message too long by " + (Message.length() - 250) + " characters.");
        }
}
        this.messageHash = createMessageHash();
    }
    
public boolean checkRecipientCell(String number){
    return number.startsWith("+27")&& number.length()== 12;
    }
    
public String createMessageHash(){
    String[] words = Message.split(" ");
    String first = words[0].toUpperCase();
    String last = words[words.length - 1].toUpperCase();
    return messageID.substring(0, 2) + ":" + messageCounter + ":" + first + last;
    }
    
public String sendMessage(){
     String action = JOptionPane.showInputDialog("Choose message option"
                        + "\n1) Send"
                        + "\n2) Disregard"
                        + "\n3) Store for later");
     return action;
    }
    
public String getMessageDetails() {
    return "Message ID:" + messageID + "\nMessage Hash:" + messageHash + "\nRecipient:" + recipient + "\nMessage:" + Message;
    }
}