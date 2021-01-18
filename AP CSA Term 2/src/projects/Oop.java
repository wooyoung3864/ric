package projects;
import java.util.Scanner;

public class Oop
{
        private String model;
        private String brand;
        private String color;
        private double size;
        private int price;
        //private int resale;
        private int deadstock;

        public Oop(String model, String brand, String color, double size, int price, int deadstock)
        {
                this.model = model;
                this.brand = brand;
                this.color = color;
                this.size = size;
                this.price = price;
                this.deadstock = deadstock;
        }

        public String getModel() { return model; }
        public String getBrand() { return brand; }
        public String getColor() { return color; }
        public double getSize() { return size; }
        public int getPrice() { return price; }

        public void setModel(String model) { this.model = model; }
        public void setBrand(String brand) { this.brand = brand; }
        public void setColor(String color) { this.color = color; }
        public void setSize(double size) { this.size = size; }
        public void setPrice(int price) { this.price = price; }
        /*
        public void computeResalePrice(int resale) 
        {
        	if
        	return resale;
        }
        */
        
        public static void main(String[] args)
        {
        	
        }
        
}


