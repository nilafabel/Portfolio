package Ch11;
public class Fuel {
    final private int FUEL_FILL = 20;
    final private int FUEL_HALF = 10;
    final private int FUEL_EMPTY = 0;
    private int fuellevel;
    public Fuel(int level){
        if(level<=FUEL_EMPTY){
            throw new IllegalArgumentException("Feul level must be at least " + FUEL_HALF);
        }
        fuellevel = level;
        fuelCheck();
    }
    public void fuelCheck(){
        System.out.println("Feul level is good " + fuellevel);
    }
    public static void main(String[] args) {
        Fuel shell = new Fuel(10);
    }
}
