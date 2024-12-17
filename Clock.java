package Ch4;
//nested loops
//a loop contains another loop
public class Clock {
    public static void main(String[] args)
    {
       for(int h=0;h<5;h++)
       {
         for(int m=0;m<5;m++)
         {
            for(int s=0;s<5;s++)
            {
                System.out.println(h+":"+m+":"+s);
            }
         }

       }
    }

}
