package HWforCh6;
public class PersonalClassDemoAS {
    public static void main(String[]args){
    PersonalClassAS p1 = new PersonalClassAS();//holds my information
        p1.setPeopleData("Anastasia", "123 Columbia Dr.", "19", "6159984123");
        p1.printPeopleData(); 

    PersonalClassAS p2 = new PersonalClassAS();//holds friends' information
        p2.setPeopleData("Sonya", "98 Joy St.", "18", "8892389911");
        p2.printPeopleData();

    PersonalClassAS p3 = new PersonalClassAS();// holds family members’ information
        p3.setPeopleData("Tatiana", "123 Columbia Dr.", "55", "6157782561");
        p3.printPeopleData();
}
}
/*
* Personal Information Class
* Design a class that holds the following personal data: name, address, age, and phone number. 
* Write appropriate accessor and mutator methods. 
* Demonstrate the class by writing a pro-gram that creates three instances of it. 
* One instance should hold your information, and the other two should hold your friends’ or family members’ information.
*/