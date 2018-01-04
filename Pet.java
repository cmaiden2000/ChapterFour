
public class Pet
{
    private String petType;
    
    private String petName;
    
    private int petAge;
    
    public Pet(String name, String type, int age) {
        this.petType = type;
        
        this.petName = name;
        
        this.petAge = age;
        
    }
    public String getName() {
        return "The name of this pet is " + this.petName;
        
    }
    public String getType() {
        return "This pet is a " + this.petType;
    }
    public String getAge() {
        return "The " + this.petType; + "is " + this.petAge; + " years old"
    }
}