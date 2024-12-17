package Ch7;
public class ArrayReturn {
    public static void main(String[] args) {
        
        double []values;
        values=getValues();
        for(double d:values)
        {
            System.out.println("The values are "+d);
        }
    }
    public static double[] getValues()
    {
        double []scores={23.5,78.9,56.7,90.9,100,89};
        return scores;
    }
}
