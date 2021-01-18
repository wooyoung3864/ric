package classwork;

public class Snkrs {
	private String name;
	private String brand;
	private double size;
	private String color;

	
	public Snkrs() //Default constructor, instantiates White AF1s as default shoe
	{
		name = "Air Force 1";
		brand = "Nike";
		size = 8.5;
		color = "White";
	}
	
	public Snkrs(String sName, String sBrand, double sSize, String sColor)
	{
		name = sName;
		brand = sBrand;
		size = sSize;
		color = sColor;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public double getSize()
	{
		return size;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void changeSize(double newSize)
	{
		size = newSize;
	}
	
	public void changeColor(String newColor)
	{
		color = newColor;
	}
	
	public String toString()
	{
		return("Name: " + name + "\nBrand: " + brand + "\nSize: " + size + "\nColor: " + color + "\n ");
	}
	
}
