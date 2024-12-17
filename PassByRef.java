public class PassByRef {
    public static void main(String[]args){
        String fullname = "Brad Kim";
        changeMyName(fullname);
        System.out.println("In Main name is " + "fullname");
    }
    public static void changeMyName(String fullname){
        System.out.println("The received name is " + fullname + ".");
        fullname = "Brand Gane";
        System.out.println("The changed name is " + fullname + ".");
    }
}
