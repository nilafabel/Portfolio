package Ch11;
public class ForceError {
    public static void main(String[]args){
        System.out.println("Calling myMethod...");
        myMethod();
        System.out.println("Method main is done.");
    }
    public static void myMethod(){
        System.out.println("Calling produceError...");
        produceError();
        System.out.println("myMethod is done.");
    }
    public static void produceError(){
        int result = 10/0;
        System.out.println("produceError is done.");
    }
}
/*
 * This program demonstrates the stack trace that is produced when an exception is thrown.
 */