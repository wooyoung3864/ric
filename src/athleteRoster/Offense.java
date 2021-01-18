package athleteRoster;

public class Offense extends FootballPlayer                //2nd level Class in hierarchy
{

    private int acceleration;
    private int vision;
    
    public Offense(String name, String position, int number, String team, String height, int tackle, int strength, int acc, int vis)
    {
       super(name, position, number, team, height, tackle, strength);
       acceleration = acc;
       vision = vis;
    }

    public int getAcc()
    {
       return acceleration;
    }
   
    public int getVis()
    {
       return vision;
    }
    
    public void setAcc(int newAcc)
    {
    	acceleration = newAcc;
    }
    
    public void setVis(int newVis)
    {
    	vision = newVis;
    }
    
    public String toString()
    {
        return super.getName() + ", " + super.getPosition() + ", " + super.getNumber() + ", plays for the " + super.getTeam() + ". " + "\n" + "Height: " + super.getHeight() + ", " + 
        super.getTackle() + " tackle, " + super.getStrength() + " strength, " + acceleration + " acceleration, " + vision + " vision.";
    }

}

