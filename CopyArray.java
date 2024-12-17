package Ch7;
import java.util.Scanner;
public class CopyArray {
        private double bonus = 0.10;
        private String[]empNames = new String[3];
        private double[]salary = new double[3];//This does not impact the # of bonuses being printed out
        public void readInput(){
            Scanner input = new Scanner(System.in);
            //Taking input for keyboard 
            //Entering employee names
            //Entering emplyee salary 
            for (int i= 0;i<empNames.length; i++){
                System.out.println("Enter emloyee " + (i+1) + " name ");
                empNames[i]= input.next();
                System.out.println("Enter " + empNames[i] + "\'s employee salary ");
                salary[i]= input.nextDouble();
            }
        }
        //////////////////////////////////////////////////////////
        public void readInput(String []empNames, double[]salary){
            Scanner input = new Scanner(System.in);
            //Taking input for keyboard 
            //Entering employee names
            //Entering emplyee salary 
            for (int i= 0;i<empNames.length; i++){
                System.out.println("Enter emloyee " + (i+1) + " name ");
                empNames[i]= input.next();
                System.out.println("Enter " + empNames[i] + "\'s employee salary ");
                salary[i]= input.nextDouble();
            }
        }
         public void displayBonus(){
            //Calculate employee bonus and add it to the salary
            for (int i = 0; i<salary.length;i++){
                double temp = salary[i]*0.10;
                salary[i] = salary[i]+ temp;
                System.out.println(empNames[i]+ "\'s salary with bonus is " + salary[i]);
            }
        }
        /////////////////////////////////////////////////////
        public void displayBonus(String[]empNames, double[]salary){
            //Calculate employee bonus and add it to the salary
            for (int i = 0; i<salary.length;i++){
                double temp = salary[i]*0.10;
                salary[i] = salary[i]+ temp;
                System.out.println(empNames[i]+ "\'s salary with bonus is " + salary[i]);
            }
        }
        public static void main(String[]args){
            CopyArray empBonus = new CopyArray();
            String[]enames = new String[3];
            double[]salary = new double[3];
            empBonus.readInput(enames, salary);
            empBonus.displayBonus(enames, salary); 
        }
}
