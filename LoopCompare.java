package Ch4;
// Will be demonstrating 3 loops
// for and while pretest loops
//do while posttest loop
public class LoopCompare
{
    public static void main(String[] args){
        int n=1;
        while(n<5) {
           System.out.println("While"+n);
           n++;
        }
        do{
            System.out.println("Do --- While"+n);
            n++;
        }while(n<5);
        for(int i=0;i<5;i++){
            System.out.println("for loop"+i);
        }

    }
}