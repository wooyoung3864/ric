package athleteRoster;

public class FootballPlayer extends Athlete
{
    private int tackle;
    private int strength;
    
    public FootballPlayer(String name, String position, int number, String team, String height, int tk, int st)
    {
       super(name, position, number, team, height);
       tackle = tk;
       strength = st;
    }

     public int getTackle()
     {
       return tackle;
    }
   
    public int getStrength()
    {
       return strength;
    }
    
    public void setTackle(int newTk)
    {
    	tackle = newTk;
    }
    
    public void setStrength(int newSt)
    {
    	strength = newSt;
    }

    public String toString()
    {
        return super.getName() + ", " + super.getPosition() + ", " + super.getNumber() + ", plays for the " + super.getTeam() + ". " + "\n" + "Height: " + super.getHeight() + ", " +
        tackle + " tackle, " + strength + " strength.";
    }

}


