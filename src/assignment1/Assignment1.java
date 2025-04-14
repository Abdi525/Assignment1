package assignment1;

import java.util.Scanner;
import java.util.regex.*;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner osy = new Scanner (System.in);
        Login user = new Login();
        
        System.out.println("***************Registeration***************");
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
            System.out.println("Phone number incorrectly formatted or does not contain international code");
        }
        
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
        
        
        System.out.println("***************Login***************");
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
       
        }
    }
    
}
