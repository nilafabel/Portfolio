import java.util.Scanner;
public class CompareStrings {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in); 
       final String UID = "ana";
       final String PWD = "123";
       String userid, password;
       System.out.println("Welcome to the login page");
       System.out.println("Enter your user name:");
       userid = input.next();
       System.out.println("Enter your password:");
       password = input.next();
       //if(userid ==UID)--not recomended
       if(userid.equalsIgnoreCase(UID) && password.equals(PWD)){//How to make userid not case sensative(.equalsIgnoreCase)
            System.out.println("Credentials verified! Access granted!");
       }
       else{
        System.out.println("Check userid/password Accesee Denied!");
       } 
    }

}
