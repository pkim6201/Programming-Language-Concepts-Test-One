import java.util.*;


class IntegerConstant {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter Floating Point Number: ");
    String integerconstant = userInput.nextLine();

    isValid(integerconstant);

    userInput.close();
  }

  public static void isValid(String string) {
    String regex = "^(0[xX][0-9a-fA-F]+)|[0-7]+|([0-9]+)$";
    boolean valid = string.matches(regex);
    if(valid == true) 
        System.out.println("The Integer Constant is valid");
     else 
        System.out.println("The Integer Constant is not valid");
    
  }
}