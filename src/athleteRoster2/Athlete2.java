package athleteRoster2;

public class Athlete2
{
      private String name;
      private String position;
      private int number;
      private int height;
      
      public Athlete2(String name, String position, int number, int height)  
      {
          this.name = name;
          this.position = position;
          this.number = number;
          this.height = height;
      }

      public static String hello()
      {
    	 return "Welcome to MyTeam 2.0! Enter your team's name: ";
      }
      
      public static String instructions()
      {
    	  return "Enter the number of players, and enter each player's name, position, number, and height." + "\nAfter entering player information, enter each player's stats.";
      }
      
      public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String toString()
      {
          return "Name: " + name + "\nPosition " + position + "\nNumber " + number + "\nHeight: " + height + " cm" + "\n";
      }
}

