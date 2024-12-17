public class CompareTO {
    public static void main(String []args){

        String s1 = "Fall Fest";
        String s2 = "Fall Fest";
        if(s1.compareTo(s2)==0)
            System.out.println("These two strings are the same.");
        else if(s1.compareTo(s2)<0)
            System.out.println(s1 + " is greater than " + s2);
        else if(s1.compareTo (s2)>0)
            System.out.println(s1 + " is less than "+ s2);
    }
}