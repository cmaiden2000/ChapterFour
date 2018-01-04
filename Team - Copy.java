
public class Team {
    private String name;
    provate Athlete[] players;
    
    plublic Team(String nm, int size) {
        this.name = nm;
        this.players = new Athlete[size];
    }
    public void addAthlete(int index, Athlete a) {
        players[
    }
    public String toString() {
        String output = "The members of this are: \n";
        for(Athlete a : players) {
            output += a + "\n" ;
        }
        return output;
    }
}