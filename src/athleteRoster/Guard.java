package athleteRoster;

public class Guard extends BasketballPlayer
{
    private int shooting;
    private int handling;
    
    public Guard(String name, String position, int number, String team, String height, int agility, int speed, int shot, int handle)
    {
       super(name, position, number, team, height, agility, speed);
       shooting = shot;
       handling = handle;
    }

    public int getShot()
    {
       return shooting;
    }
   
    public int getHandles()
    {
       return handling;
    }
    
    public void setShot(int newShot)
    {
    	shooting = newShot;
    }
    
    public void setHandles(int newHandles)
    {
    	handling = newHandles;
    }

    public String toString()
    {
        return super.getName() + ", " + super.getPosition() + ", " + super.getNumber() + ", plays for the " + super.getTeam() + ". " + "\n" + "Height: " + super.getHeight() + ", " +
        super.getAgility() + " agility, " + super.getSpeed() + " speed, " + shooting + " shooting, " + handling + " handling.";
    }
}
