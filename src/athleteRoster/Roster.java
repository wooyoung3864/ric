package athleteRoster;
import java.util.ArrayList;

import athleteRoster2.Athlete2;
public class Roster {
	private ArrayList<Athlete2> teamArr;
	
	public Roster()
	{
		teamArr = new ArrayList<Athlete2>();
	}
	
	public void addPlayer(String nm, String pos, int num, String tm, int ht) 
	{
		teamArr.add(new Athlete2(nm, pos, num, ht));
	}
	
	public Athlete2 getPlayerAtIndex(int index)
	{
		return teamArr.get(index);
	}
	
	public ArrayList getTeamArr()
	{
		return teamArr;
	}
	
	
}