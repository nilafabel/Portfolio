import java.util.Scanner;
public class NestedIF {
    public static void main(String[] args) {
        //We are finding a student to file intent to gradute
        //We need to Check Completed credits are not
        //We need to check student grade 
        //if both conditions are met then student can file intent to graduate
        final double PASSINGGRADE=70;
        double grade;
        boolean credits;
        Scanner keyboard=new Scanner(System.in);
        System.out.println(" Welcome to findout student "+
                                    "graduation eligiblity");
        System.out.println("Did you "+
                           "completed all your credits true/false ?");
        credits=keyboard.nextBoolean();
        //Nested if logic, if contains another if
        if(credits)//credits==true or credits
        {
            System.out.println("Student credits are met, now checking"+
            "about the grade");
            System.out.println("Enter student overall grade");
            grade=keyboard.nextDouble();
            if(grade>=PASSINGGRADE)
               System.out.println("Student qualified to submit"+
                                   " the graduation request");
            else
               System.out.println("Grade requirement not met."+
                                  " Please go and meet your advisor");
        }
        else
            System.out.println("You must complete all the credits"+
                                   " to get an eligiblity"); 
        
        






    }
}
