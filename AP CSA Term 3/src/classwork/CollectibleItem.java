package classwork;
import java.util.ArrayList;

public class CollectibleItem {
    private String name;
    private String type;
    private String brand;
    private String color;
    private double price;

    public CollectibleItem (String name, String type, String brand, String color, double price) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Name: " + name
                + "\nType: " + type
                + "\nBrand: " + brand
                + "\nColor: " + color
                + "\nPrice: " + price;
    }
}

class ItemsTester {
    public static void main(String[] args) {
        ArrayList<CollectibleItem> al = new ArrayList<CollectibleItem>();

        CollectibleItem chanel = new CollectibleItem("Bleu de Chanel", "Cologne", "Chanel", "Blue", 164.0);
        CollectibleItem wallet = new CollectibleItem("Polo Wallet", "Wallet","Polo Ralph Lauren", "Black", 100.0);
        CollectibleItem ring = new CollectibleItem("Green Ring", "Accessory", "Mr. Green", "Green", 5.0);
        CollectibleItem chapstick = new CollectibleItem("Chapstick", "Lip balm", "Chapstick", "blue",3.0);
        CollectibleItem hairband = new CollectibleItem("Hairband", "Accessory", "None", "Black", 1.0);

        al.add(chanel);
        al.add(wallet);
        al.add(ring);
        al.add(chapstick);
        al.add(hairband);

        System.out.println(al);
    }
}
