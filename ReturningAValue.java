public class ReturningAValue {
    public static void main(String[]args){
        System.out.printf("Fehrenheit to Celcius is %.2f", convertFtoC());
        double c = 32.34;
        System.out.println();
        System.out.printf("Celcius to Fehrenheit is %.2f", convertCtoF(c));
        System.out.println();
    }
    public static double convertCtoF(double c){
        double f = ((c*9)/5)+32;
        return f;
    }
    public static double convertFtoC(){
        double f = 90.2;
        double c;
        c=((f-32)*5)/9;
        return c;
    }
}
//Converts Fehrenheit to Celcius...
//And Celcius to Fehrenheit...