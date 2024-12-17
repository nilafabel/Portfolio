package Ch10;
public class CSstudent extends Student {
    private final int MATH_HOURS=16;
    private final int CS_HOURS = 16;
    private final int GEN_HOURS = 32;
    private int mathhours;
    private int cshours;
    private int genhours;
    public CSstudent(String n, String id, int y, int m, int cs, int gen){
        super(n,id,y);
        mathhours = m;
        cshours = cs;
        genhours = gen;
    }
    public int getRemainingHours(){
        int remainingHours;
        remainingHours = ((MATH_HOURS+CS_HOURS+GEN_HOURS)-(mathhours+cshours+genhours));
        return remainingHours;
    }
    public String toString(){
        return super.toString()+"\nMath: "+mathhours+"\nGen: "+genhours+"\nCompSci: "+genhours;
    }
    public static void main(String[]args){
        CSstudent s1 = new CSstudent("John", "A001", 2023, 4, 4, 6);
        System.out.println(s1);
        //Student s2 = new Student();//Cannot create object for abstarct object
        //Polymorphism
        Student s3= new CSstudent("Rose", "A002", 2024, 4, 0, 0);
        System.out.print(s3);

    }
}


/* 
  __     __
<{o ) | (o }>
////  ^ ////
     
*/