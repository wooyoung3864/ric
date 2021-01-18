package athleteRoster;

public class Defense extends FootballPlayer                //2nd level Class in hierarchy
{
    private int blocking;
    private int interception;
    
    public Defense(String name, String position, int number, String team, String height, int tackle, int strength, int blk, int inr)
    {
       super(name, position, number, team, height, tackle, strength);
       blocking = blk;
       interception = inr;
    }

    public int getBlk()
    {
      return blocking;
    }
   
   public int getInt()
   {
      return interception;
   }
   
   public void setBlk(int newBlk)
   {
	   blocking = newBlk;
   }
   
   public void setInt(int newInt)
   {
	   interception = newInt;
   }

    public String toString()
    {
        return super.getName() + ", " + super.getPosition() + ", " + super.getNumber() + ", plays for the " + super.getTeam() + ". " + "\n" + "Height: " + super.getHeight() + ", " +
        super.getTackle() + " tackle, " + super.getStrength() + " strength, " + blocking + " blocking, " + interception + " interception.";
    }
}

