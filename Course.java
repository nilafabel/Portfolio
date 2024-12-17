public class Course
{
   private String courseName;      
   private Instructor instructor;  // The instructor
   private TextBook textBook;      // The textbook
   public Course(String cname, Instructor instr, TextBook text)
   {
    this.courseName=cname;
    //this.instructor=instr;//shallow copy , security hole
    this.instructor=new Instructor(instr);//deep copy   
    this.textBook=new TextBook(text); 
   }
   public String getName()
   {
      return courseName;
   }
   public Instructor getInstructor()
   {
     //return instructor; don't do that.
     return new Instructor(instructor);
   }
   public TextBook getTextBook()
   {
     return new TextBook(textBook);
   }
   public String toString()
   {
      String message="Course name "+courseName+"\nInstrctor "+instructor
                     +"\nTextbook "+textBook;
                return message;
   }
}