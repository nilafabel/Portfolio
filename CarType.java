public class CarType {
    private String engine;
    private int horsepower;
    private String transmission;
    public CarType(){
        engine = "";
        horsepower = 0;
        transmission = "";
    }
    ///////////////////////////////////////
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getEngine(){
        return engine;
    }
    ///////////////////////////////////////
    public void setHorse(int horses){
        this.horsepower = horses;
    }
    public int getModel(){
        return horsepower;
    }
    //////////////////////////////////////
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }
    public String getTransmission(){
        return transmission;
    }
}