
public class Student
{
    // instance variables - replace the example below with your own
    private int idNumber ;
    private String name;
    private Hat Mikes;
    
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        
    }

    public Student (int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public String getName() {
        return this.name;
    }
    
}
