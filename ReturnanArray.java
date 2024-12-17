package Ch7;

public class ReturnanArray {
    public static void main(String[] args){
       double[]values;
        values = getArray();
        for(double n:values){
            System.out.println(n);
        }
    }
    public static double[]getArray(){
        double[]array = {34,56,98,12,99,35,};
        return array;
    }
}
