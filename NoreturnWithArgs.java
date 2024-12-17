public class NoreturnWithArgs {
    public static void main(String[] a)
    {
        int n=90;
        System.out.println("In main "+n);
        showA();
    }
    public static void showA()
    { 
        int n=900;
        System.out.println("In showA "+n);
    }

}
