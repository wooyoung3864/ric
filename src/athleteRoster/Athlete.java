package athleteRoster;

public class Athlete
{
      private String name;
      private String position;
      private int number;
      private String team;
      private String height;
      
      public Athlete(String na, String pos, int num, String tm, String ht)  
      {
          name = na;
          position = pos;
          number = num;
          team = tm;
          height = ht;
      }
      
      public String getName()
      {
          return name;
      }
      
      public String getPosition()
      { 
          return position; 
      }
        
      public int getNumber()
      { 
          return number; 
      }
      
      public String getTeam()
      { 
          return team; 
      }
      
      public String getHeight()
      {
    	  return height;
      }
      
      public void setName(String newName)
      {
    	  name = newName;
      }
      
      public void setPosition(String newPs)
      {
    	  position = newPs;
      }
      
      public void setNumber(int newNum)
      {
    	  number = newNum;
      }
      
      public void setTeam(String newTeam)
      {
    	  team = newTeam;
      }
      
      public void setHeight(String newHeight)
      {
    	  height = newHeight;
      }
      
      public String toString()
      {
          return name + ", " + position + ", " + number + ", plays for the " + team + "." + "\nHeight: " + height;
      }
}

