package HwforCh10;
class StudentAS{//class named Student 
    private String name;//student’s name
    private String address;//address
    private String telephoneNumber;//telephone number
    public StudentAS(String name, String address, String telephoneNumber){//constructor for student class
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
//////////////////////////////////////////////////
    public void setName(String name){//mutator(set) method for name
        this.name = name;
    }
    public String getName(){//accessor(get) method for name
        return name;
    }
//////////////////////////////////////////////////
    public void setAddress(String address){//mutator(set) method for address
        this.address = address;
    }
    public String getAddress(){//accessor(get) method for address
        return address;
    }
//////////////////////////////////////////////////
    public void setTelephoneNumber(String telephoneNumber){//mutator(set) method for telephoneNumber
        this.telephoneNumber = telephoneNumber;
    }
    public String getTelephoneNumber(){//accessor(get) method for telephoneNumber
        return telephoneNumber;
    }
}
//////////////////////////////////////////////////
class Reader extends StudentAS{//class named Reader which extends the Student class
    private int readerId;//readerid
    private boolean mailingList;//boolean field indicating whether the reader wishes to be on a mailing list
    public Reader(String name, String address, String telephoneNumber, boolean mailingList){//constructor for Reader class
        super(name, address, telephoneNumber);
        this.mailingList = mailingList;
    }
//////////////////////////////////////////////////
    public void setReaderId(int readerId){//mutator(set) method for readerId
        this.readerId = readerId;
    }
    public int getReaderId(){//accessor(get) method for readerId
        return readerId;
    }
//////////////////////////////////////////////////
    public void setMailingList(boolean mailingList){////mutator(set) method for mailingList
        this.mailingList = mailingList;
    }
    public boolean isMailingList(){//accessor(get) method for mailingList
        return mailingList;
    }
//////////////////////////////////////////////////
    public static void main(String[] args){//Demonstartion of the class in a simple program
        Reader reader = new Reader("Anastasia Sidorova", "420 Seasame St", "6158828171", true);//object of the Reader class
        System.out.println("Reader Information:");
        System.out.println("Name: " + reader.getName());//Prints out name from the accesor method
        System.out.println("Address: " + reader.getAddress());//Prints out address from the accesor method
        System.out.println("Telephone Number: " + reader.getTelephoneNumber());//Prints out telephone # from the accesor method
        System.out.println("Wishes to be on Mailing List: " + (reader.isMailingList() ? "Yes" : "No"));//Prints out if the student wants to be on the mailing list (Yes)
    }
}
/*
 * Student and Reader Classes
 * Design a class named Student with fields for holding a student’s name, address, and telephone number. 
 * Write one or more constructors and the appropriate mutator(set) and accessor(get) methods for 
 *      the class’s fields. 
 * 
 * Next, design a class named Reader, which extends the Student class. 
 * The Reader class should have a field for readerid and a boolean field indicating whether the reader 
 *      wishes to be on a mailing list. 
 * Write one or more constructors and the appropriate mutator and accessor methods for the class’s fields. 
 * Demonstrate an object of the Reader class in a simple program.
 */