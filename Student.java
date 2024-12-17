package Ch10;
public abstract class Student {
    private String name;
    private String id;
    private int yearofAdmit;
    public Student(String n, String id, int yearofAdmit){
        this.name = n;
        this.id = id;
        this.yearofAdmit = yearofAdmit;
    }
    public String toString(){
        return "\n"+ "Student details" + "\nName: "+name+"\nID: "+id+"\nYear of Admit: "+yearofAdmit;
    }
    public void getStudent(){
        System.out.println("Total Student info: ");
    }
    public abstract int getRemainingHours();
}
