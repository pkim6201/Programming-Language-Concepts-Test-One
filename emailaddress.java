import java.util.*;


class emailaddress{
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter Email Address: ");
    String email = userInput.nextLine();

    isValid(email);

    userInput.close();
  }

  public static void isValid(String email) {
    String regex = "^[a-zA-Z0-9#!%$&*/=?^{}|~+_.-]+@[a-zA-Z0-9.-]+$";
    boolean valid = email.matches(regex);
    if(valid == true) 
        System.out.println("The email address is valid");
     else 
        System.out.println("The email address  is not valid");
    
  }
}