package assignment1;
import java.util.regex.*;

public class Login {
    private String Name;
    private String Surname;
    private String Username;
    private String Password;
    private String Phone_number;
    
    public void setName(String Name){
        this.Name = Name;
    }
    public void setSurname(String Surname){
        this.Surname = Surname;
    } 
              
    public void setUsername(String Username){
        this.Username = Username;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public void setPhone_number(String Phone_number){
        this.Phone_number = Phone_number;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone_number() {
        return Phone_number;
    }
    public boolean checkUserName(String Username){
        return this.Username.contains("_") && this.Username.length()<=5;
    }
    public boolean checkPasswordComplexity(String Password){
        return this.Password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@$%&*?])[A-Za-z\\d!@$%&*?]{8,20}$");
    } 
    
    public boolean checkCellPhoneNumber(String Phone_number){
        return this.Phone_number.length()==12 && this.Phone_number.startsWith("+27");
    }
    public String RegisterUser(String Username, String Password){
       if (checkUserName(Username) && checkPasswordComplexity(Password)){
           System.out.println("Registration Sucessful");   
       } 
       else if(!checkUserName(Username)){
        System.out.println("Username is incorrectly formatted");
    }
       else if (!checkPasswordComplexity(Password)){
          System.out.println("Password does not meet the complexity requirements");
       }
       return " ";
       
    }
    public boolean loginUser(String enteredUsername, String enteredPassword){
        return this.Username.equals(enteredUsername) && this.Password.equals(enteredPassword);
    }
    public String returnLoginStatus(String enteredUsername, String enteredPassword){
        if (loginUser(enteredUsername , enteredPassword)){
            System.out.println("Successfully logged in");
            System.out.println("\nWelcome " + getName() + " " + getSurname() + " \nIt is great to see you");
        }
        else{
            System.out.println("Login failed");
    }
       return " ";
       
    }
    
    
    
    
    
    
    
}    
    
    
    
    
    
    

