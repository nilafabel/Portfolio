package Ch10;
public class Phone {
    protected int pid;
    private String phName;
    public Phone(){}
    public Phone(String n){
        this.phName = n;
    }
    
    public void makeAcall(){
        System.out.println("Make a call: Super class method");
    }
}
