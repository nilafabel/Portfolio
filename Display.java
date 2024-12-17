package Ch10;
public interface Display {
    int n = 12;
    void display();
    default void getjobDetails(){
        System.out.println("Using default method");
    }
}
