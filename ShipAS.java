package Exam1;
public class ShipAS{
    private String name;// field for the name of the ship
    private String year;//field for the year that the ship was built
    public ShipAS(){
        this.name = "";
        this.year = "";
    }
/////////////////////////////////////////
    public ShipAS(String name, String year){//Constructor that passes name and year
        this.name = name;
        this.year = year;
    }
/////////////////////////////////////////
    public void setName(String name){//Mutator that passes name
        this.name = name;
    }
    public String getName(){//Accessor that returns the name
        return name;
    }
/////////////////////////////////////////
    public void setYear(String year){//Mutator that passes the year 
        this.year = year;
    }
    public String getYear(){//Accessor that returns the year 
        return year;
    }
/////////////////////////////////////////
    public String toString(){
        return "\nThe ship's name is " + this.getName() + " and the year that it was built was " + this.getYear() + ".";//toString method that displays the ship’s name and the year it was built
    }
}
/*
Design a Ship class that the following members:
 * A field for the name of the ship (a string).
 * A field for the year that the ship was built (a string).
 * A constructor and appropriate accessors and mutators.
 * A toString method that displays the ship’s name and the year it was built.
 */