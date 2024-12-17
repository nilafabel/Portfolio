public class Print {
    public static void main(String[]args){
        //System.out.println("format String", arglist);
        System.out.printf("\nHello World! ");
        int workHours = 40;
        System.out.printf("\nI worked %d hours. ", workHours);
        int dogs = 3, cats = 2;
        System.out.printf("\nI have %d dogs and %d cats. ", dogs,cats);
        //%d means int value
        double grossPay = 89011.45310023;
        System.out.printf("\nYour pay is %,.2f. ", grossPay);
        //%f for double or float
    }
}
