package HWforCh6;
public class PersonalClassAS {
    private String name;//personal data = name
    private String address;//personal data = address
    private String age;//personal data = age
    private String phone;//personal data = phone number
    ///////////////////////////////divider
    public void setname(String name){//accessor and mutator methods. 
        this.name = name;
    }
    public String getName(){
        return name;
    }
    ///////////////////////////////divider
    public void setAddress(String address){//accessor and mutator methods. 
        this.address = address;
    }
    public String getAdress(){
        return address;
    }
    ///////////////////////////////divider
    public void setAge(String age){//accessor and mutator methods. 
        this.age = age;
    }
    public String getAge(){
        return age;
    }
    ///////////////////////////////divider
    public void setPhone(String phone){//accessor and mutator methods. 
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
    //////////////////////////////divider
    public void setPeopleData(String name, String address, String age, String phone){
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }
    public void printPeopleData(){
        System.out.println("\nPersonal data is below:");
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(phone);
    }
}
/*
* Personal Information Class
* Design a class that holds the following personal data: name, address, age, and phone number. 
* Write appropriate accessor and mutator methods. 
* Demonstrate the class by writing a pro-gram that creates three instances of it. 
* One instance should hold your information, and the other two should hold your friends’ or family members’ information.
*/
