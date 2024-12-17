package Ch10;
public class Person implements Display{
    private String name;
    Person(String s){
        name = s;
    }
    public void display(){
        System.out.println("\nPerson's name is: "+name);
    }
    public static void main (String[]args){
        Person p = new Person("Jazzie");
        p.display();
        p.getjobDetails();//used default method implemented inside the interface
        Display d = new Person("Kay");
        d.display();
        //Anonymous Inner Class
        Display anon = new Display(){
            String n = "Jane";
            public void display(){
                System.out.println("Name is "+n);
            }
        };//required for the stucture for the anon class
        anon.display();
    }
}