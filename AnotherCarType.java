public class AnotherCarType {//private variables
    private String brand;
    private String model;
    private int year;
    ////////////////////////////////////
    public AnotherCarType(){//Constructor Class
        brand = "";
        model = "";
        year = 0;
    }
    public AnotherCarType(String brand, String model,int year){//Constructor Class
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public static void main(String[]args){//Object main
        AnotherCarType c1 = new AnotherCarType();
        c1.setBrand("Toyota");
        c1.setModel("Corolla");
        c1.setYear(1985);
    }
    ////////////////////////////////////
    public void setBrand(String brand){//set and get method for brand
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    ////////////////////////////////////set and get method for model 
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    //////////////////////////////////set and get method for year
    public void setYear(int year){
        this.year = year;
    }
    public int getyear(){
        return year;
    }
}
