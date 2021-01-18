package athleteRoster;

public class AthleteRoster
{
    public static void main(String[] args)
    {
        Offense ric = new Offense("Ric", "Running back", 26, "Dalton Pigeons", "5'8", 72, 74, 73, 75);
        System.out.println(ric);
        System.out.println();
        
        FootballPlayer lamar = new FootballPlayer("Lamar Jackson","Quarterback", 8, "Baltimore Ravens", "6'2", 71, 74);
        System.out.println(lamar);
        System.out.println();
        
        Defense kim = new Defense("Kimmer", "Linebacker", 21, "West Van Highlanders", "5,10", 74, 69, 74, 80);
        System.out.println(kim);
        System.out.println();
        
        Athlete juju = new Athlete("JuJu Smith-Schuster", "Wide receiver", 19, "Pittsburgh Steelers", "6'1");
        System.out.println(juju);
        System.out.println();
        
        Forward lbj = new Forward("LeBron James", "Small forward", 23, "Los Angeles Lakers", "6'9", 74, 88, 85, 97);
        System.out.println(lbj);
        System.out.println();
        
        Guard ste = new Guard("Stephen Curry", "Point guard", 30, "Golden State Warriors", "6'3", 88, 91, 98, 90);
        System.out.println(ste);
        System.out.println();
        
        Guard koo = new Guard("Jaylen Koo", "Point guard", 23, "TCIS Dragons", "5'11", 83, 87, 84, 70);
        System.out.println(koo);
        System.out.println();
        
        BasketballPlayer akumpo = new BasketballPlayer("Giannis Akumpo", "Small forward", 34, "Milwaukee Bucks", "14'5", 84, 88);
        System.out.println(akumpo);
        System.out.println();
        
        Athlete babyAkumpo = new Athlete("Baby Akumpo", "Point guard", 20, "Milwaukee Bucks", "6'1");
        System.out.println(babyAkumpo);
        System.out.println();
        
        Guard flight = new Guard("Flight", "Shooting guard", 30, "Flight team stand up", "6'3", 99,99,99,99);
        System.out.println(flight);
        System.out.println();
        
        Guard dbook = new Guard("Devin Booker", "Point guard", 1, "Shut the fuck up", "5'9", 0, 0, 0, 0);
        System.out.println(dbook);
        System.out.println();
        
        Athlete curiousGeorge = new Athlete("Curious George", "Center", 69, "Curious George and the MFN Squad", "6'9");
        System.out.println(curiousGeorge);
        System.out.println();
        
        Forward matt = new Forward("Matt Wuhu", "Power forward", 22, "Curious George and the MFN Squad", "7'4", 100,100,100,100);
        System.out.println(matt);
        System.out.println();
        
    }    
}