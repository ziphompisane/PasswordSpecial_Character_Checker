
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class passwordChecker{
  
  public static boolean containsSpecialCharacter(String password){

      Pattern specialCharPattern = Pattern.compile("[^a-zA-Z0-9]");
  
    Matcher matcher = specialCharPattern.matcher(password);
  
    return matcher.find();
  }
      
  

    public static void main(String args[]) {
      
  Scanner scan = new Scanner(System.in);
 
       System.out.println("Enter your password:");
       
 String password = scan.nextLine().trim();
    
    
        scan.close();
        
   

     if(containsSpecialCharacter(password)){
      
    System.out.println("Password contains special character.");
  
      } else{
  
         System.out.println("Password does not contains special character.");
    
    }
    
}

}