package HWforCh6;

public class CarClassAS {
    private int yearModel;
    private String make;
    private int speed;

    public CarClassAS(int yearModel, String make){//Constructor
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }
    ////////////////////////////////////////////////
    public int getYearModel(){//Acessor for model
        return yearModel;
    }
    ////////////////////////////////////////////////
    public String getMake(){// Accessor for make
        return make;
    }
    ///////////////////////////////////////////////
    public int getSpeed(){// Accessor for speed
        return speed;
    }
    ///////////////////////////////////////////////
    public void toAccelerate(){// Method to accelerate
        speed += 5;
    }
    public void toBrake(){//Method to break
        speed -= 5;
    }
}
/*
* Car Class
* Write a class named Car that has the following fields:
* yearModel. The yearModel field is an int that holds the car’s year model.
* make. The make field references a String object that holds the make of the car.
* speed. The speed field is an int that holds the car’s current speed.

* In addition, the class should have the following constructor and other methods.
* Constructor. The constructor should accept the car’s year model and make as arguments. 
* These values should be assigned to the object’s yearModel and make fields. 
* The constructor should also assign 0 to the speed field.

* Accessors. Appropriate accessor methods should get the values stored in an object’s yearModel, make, and speed fields.

* accelerate. The accelerate method should add 5 to the speed field each time it is called.
* brake. The brake method should subtract 5 from the speed field each time it is called.

* Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. 
* After each call to the accelerate method, get the current speed of the car and display it. 
* Then call the brake method five times. 
* After each call to the brake method, get the current speed of the car and display it.
*/