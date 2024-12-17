package Exam1;
public class CruiseShipAS extends ShipAS{//CruiseShip class that extends the Ship class
    int maxPassengers;//int field for the maximum number of passengers
    public CruiseShipAS(){//Constructor that passes no value 
        super();
    }
    public CruiseShipAS(String name, String tonnage, int maxPassengers){//Constructor that passes name, tonnage, and maxPeople
        super(name, tonnage);
        this.maxPassengers = maxPassengers;
    }
    public void setMaxPassengers(int maxPassengers){//Mutator that passes maxPassengers
        this.maxPassengers = maxPassengers;
    }
    public int getMaxPassengers(){//Accessor that returns maxPassengers
        return maxPassengers;
    }
    public String toString(){//toString method that overrides the toString method in the base class
        return "The cruize ship's name is " + this.getName() + " and it can hold up to " + this.getMaxPassengers() + " people.";//display the ship’s name and the maximum number of passengers.
    }
}
/*
* Design a CruiseShip class that extends the Ship class. 
* The CruiseShip class should have the following members:
* A field for the maximum number of passengers (an int).
* A constructor and appropriate accessors and mutators.
* A toString method that overrides the toString method in the base class. The 
* CruiseShip class’s toString method should display only the ship’s name and the maximum number of passengers.
 */