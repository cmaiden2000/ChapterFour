
public class Athlete {
    String name;
    String Age;
    public Athlete(String nm, int a) {
        this.name = nm;
        this.age = old;
    }
    public boolean equals(Athlete other) {
        if(this.name.equals(other.name) && this.age == other.age) {
            return true;
        }
        else {
            return false;
        }
    }
    public void toString() {
        return "The athlete's name is " + this.name + " and they are " this.age + " years old."
    }
}