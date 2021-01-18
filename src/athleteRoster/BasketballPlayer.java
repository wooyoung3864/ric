package athleteRoster;

public class BasketballPlayer extends Athlete
{
    private int speed;
    private int agility;
    
     public BasketballPlayer(String name, String position, int number, String team, String height, int ag, int sp)
    {
       super(name, position, number, team, height);
       agility = ag;
       speed = sp;
    }

     public int getAgility()
     {
       return agility;
    }
   
    public int getSpeed()
    {
       return speed;
    }
    
    public void setAgility(int newAg)
    {
    	agility = newAg;
    }
    
    public void setSpeed(int newSpeed)
    {
    	speed = newSpeed;
    }

    public String toString()
    {
        return super.getName() + ", " + super.getPosition() + ", " + super.getNumber() + ", plays for the " + super.getTeam() + ". " + "\n" + "Height: " + super.getHeight() + ", " + 
        agility + " agility, " + speed + " speed.";
    }

}

