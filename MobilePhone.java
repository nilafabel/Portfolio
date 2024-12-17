package Ch10;
public class MobilePhone extends Phone {
    private String mphName;
    protected int mpid;
    public MobilePhone(){}
    public MobilePhone(String p, String mp){
        super(p);//passing a value supper class to constructor
        this.mphName = mp;
    }
    public void texting(){
        System.out.println("You can text:");
    }
    public void gaming(){
        System.out.println("The snake ______<<--<<--<<___ is loading up:");
    }
}