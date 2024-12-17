package Exam1;
public class CargoShipAS extends ShipAS{//CargoShip class that extends the Ship class. 
    private int tonnage;//int field for the cargo capacity in tonnage
    public CargoShipAS(){//Constructor that passes nothing 
        super();
    }
    public CargoShipAS(String name, String year, int tonnage){//Constructor that passes name, year, and tonage
        super(name, year);
        this.tonnage = tonnage;
    }
    public void setTonnage(int tonnage){//Mutator that passes tonnage
        this.tonnage = tonnage;
    }
    public int getTonnage(){//Accesor that returns tonnage
        return tonnage;
    }
    public String toString(){//toString method that overrides the toString method in the base class.
        return "The cargo ship's name is " + this.getName() + " and its capacity is " + this.getTonnage() + " tons.\n";//displays the ship’s name and the ship’s cargo capacity.
    }
}
/*
* Design a CargoShip class that extends the Ship class. 
* The CargoShip class should have the following members:
* A field for the cargo capacity in tonnage (an int).
* A constructor and appropriate accessors and mutators.
* A toString method that overrides the toString method in the base class. 
* The CargoShip class’s toString method should display only the ship’s name and the ship’s cargo capacity.
*/

