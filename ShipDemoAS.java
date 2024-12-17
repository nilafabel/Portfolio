package Exam1;
public class ShipDemoAS{
    public static void main(String args[]){
        ShipAS[] shipsArray = new ShipAS[3];//Ship array
        shipsArray[0] = new ShipAS("USS Arizona", "1941");//ShipAS object assigned to an array element
        shipsArray[1] = new CruiseShipAS("Carnival Cruize Line", "184000", 6600);//CruiseShipAS object assigned to an array element
        shipsArray[2] = new CargoShipAS("Madrid Maersk", "1967", 205689);//CargoShipAS object assigned to an array element
        for (int i = 0; i < shipsArray.length; i++){
            System.out.println(shipsArray[i].toString());//calls each object’s toString method.
        }
    }
}
/*
 * Demonstrate the classes in a program that has a Ship array. 
 * Assign various Ship, CruiseShip, and CargoShip objects to the array elements. 
 * The program should then step through the array, calling each object’s toString method.
 */
