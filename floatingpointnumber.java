import java.util.*;


class floatingpointnumbers {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter Floating Point Number: ");
    String fpn = userInput.nextLine();

    isValid(fpn);

    userInput.close();
  }

  public static void isValid(String string) {
    String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?[FfLl]?";
    boolean valid = string.matches(regex);
    if(valid == true) 
        System.out.println("The Floating Point Number is valid");
     else 
        System.out.println("The Floating Point Number is not valid");
    
  }
}