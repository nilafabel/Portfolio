package Ch7;
public class StringArrays {
    public static void main(String[] args) {
        String []names={"Bill","Bates","Mike","Mat","Jade"};
        
        for(int index=0;index<names.length;index++)
           System.out.println(names[index].toUpperCase());
        
        for(String i:names)
            System.out.println(i.charAt(0));
    }
}
