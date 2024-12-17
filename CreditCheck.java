import java.util.Scanner;
public class CreditCheck {
    //Accept a credit score between 0-1000
    //Based on the user score display the message
    //about their qualification
    public static void main(String[] args)
    {
        inputScore();
    }
    public static void inputScore()
    {
        int score;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your credit score ");
        score=keyboard.nextInt();
        if(score>0&&score<400)
            poor();
        else if(score>400&&score<700)
            medium();
        else if(score>700&&score<1000)
            excellent();
        else
            System.out.println("invalid score");
    }
    public static void excellent()
    {
      System.out.println("You have an excellent credit score");
      System.out.println("You are eligible for special promotion");
    }
    public static void medium()
    {
        System.out.println("Your score is average");
        System.out.println("You barley qualify for this entry");
    }
    public static void poor()
    {
        System.out.println("Sorry! your score is very poor");
        System.out.println("Cannot offer any loan!!");
    }

}
