package athleteRoster;

public class Forward extends BasketballPlayer
{
    private int post;
    private int dunk;
    
    public Forward(String name, String position, int number, String team, String height, int agility, int speed, int pos, int dnk)
    {
       super(name, position, number, team, height, agility, speed);
       post = pos;
       dunk = dnk;
    }

    public int getPost()
    {
       return post;
    }
   
    public int getDunk()
    {
       return dunk;
    }
    
    public void setPost(int newPost)
    {
    	post = newPost;
    }
    
    public void setDunk(int newDunk)
    {
    	dunk = newDunk;
    }

    public String toString()
    {
        return super.getName() + ", " + super.getPosition() + ", " + super.getNumber() + ", plays for the " + super.getTeam() + ". " + "\n" + "Height: " + super.getHeight() + ", " +
        super.getAgility() + " agility, " + super.getSpeed() + " speed, " + post + " post, " + dunk + " dunk.";
    }
}
