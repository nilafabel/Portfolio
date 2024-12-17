package Ch10;
public class SmartPhone extends MobilePhone {
    private String spName;
    public SmartPhone(){}
    public SmartPhone(String p, String mp, String sp){
        super(p,mp);
        this.spName = sp;
    }
    @Override
    public void gaming(){//method overriding
        System.out.println("Please pick any game below:");
        System.out.println("W.O.W.\nMinecraft\nTotk");
    }
    public void navigation(){
        System.out.println("You can Navigate: ");
    }
    public void email(){
        System.out.println("You can email: ");
    }
    @Override
    public String toString(){//this method is from object class
        return spName;
    }
    public static void main(String[]args){
        SmartPhone iphone = new SmartPhone("Sony", "Blackberry", "Iphone");//subclass object
        iphone.makeAcall();//Super class method
        iphone.texting();//Sub class
        iphone.email();//Sub sub class
        iphone.navigation();//sub sub class
        iphone.gaming();//method overriding
        System.out.println("\nIn super super class\n");
        Phone panasonic = new Phone("Vintage");
        panasonic.makeAcall();
        //SmartPhone samsung = new Phone();//error
        //Super class refrence to cub class object 
        //polymorphism
        System.out.println("----Polymorphism----");
        MobilePhone polymp = new SmartPhone();
        polymp.gaming();

        System.out.println("Mobile Phone");
        MobilePhone subMPhone = new MobilePhone();
        subMPhone.makeAcall();
        subMPhone.texting();
        subMPhone.gaming();
    }
}
