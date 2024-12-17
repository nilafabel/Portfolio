public class Car {
    private String carmodel;
    private CarBrands carbrand;
    private String caryear;
public Car(String m, CarBrands b,String y){
    this.carmodel = m;
    this.carbrand = b;
    this.caryear = y;
}
public void carInfo(){
    System.out.println("Car Brand:\t\t" + carbrand + "\nCar model:\t\t" + carmodel + "\nCar production year:\t" + caryear);
}
public static void main (String[]args){
    Car obj = new Car ("Versa Note", CarBrands.NISSAN, "2015");
    obj.carInfo();
}
}
