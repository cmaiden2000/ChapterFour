
 

public class SoccerTeam {
    public static void  main(String[] args) {
        Team ahsSoccer = new Team("Acalanes", 23);
        Athelete joe = new Athlete("Joe", 16);
        Athlete jill = new Athlete("Jill", 16);
        System.out.println(jill.equals(joe));
        
        ahsSoccer.addAthlete(0, joe);
        System.out.println(ahsSoccer);
    }
}