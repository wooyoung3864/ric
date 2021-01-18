package problems;
import java.util.Scanner;
public class Racecar
{
	public static final Scanner in = new Scanner(System.in);
    private double accel; // acceleration
    private int lowerLimit;
    private int upperLimit;
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    public Racecar(int lowerLimit, int upperLimit, String driver)
    {
    	this.lowerLimit = lowerLimit;
    	this.upperLimit = upperLimit;
    	this.name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
    	double time = Math.sqrt(2*distance/accel);
    	time = Math.round(time * 100) / 100.0;
    	return time;
    }
    
    public double generateAccel(int lowerLimit, int upperLimit) 
    {
    	accel = (Math.random() * upperLimit) + lowerLimit;
    	return accel;
    }
    
    public double roundAccel()
    {
    	return  Math.round(accel * 100) / 100.0;
    }
    
    public double getAccel() {
		return accel;
	}

	public void setAccel(double accel) {
		this.accel = accel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString()
    {
        return "Racer " + name;
    }   
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Racer 1's name: ");
    	String name1 = in.nextLine();
    	System.out.println("Enter Racer 2's name: ");
    	String name2 = in.nextLine();
    	
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double acc1 = (Math.random() * 20) + 3;
        double acc2 = Math.random() * 10;
        
        // Create two Racecar objects
        Racecar ric = new Racecar(acc1, name1);
        Racecar park = new Racecar(acc2, name2);
        // Compute the finishing times for both cars
        double time1 = ric.computeTime(distance);
        double time2 = park.computeTime(distance);
        name1 = ric.getName();
        name2 = park.getName();
        //Print times of each car
        System.out.println(ric);
        System.out.println(name1 + " finished in " + time1 + " seconds with an acceleration of " + Math.round(acc1 * 100) / 100.0 + " m/s^2");
        System.out.println(park);
        System.out.println(name2 + " finished in " + time2 + " seconds with an acceleration of " + Math.round(acc2 * 100) / 100.0 + " m/s^2");
	}
}

