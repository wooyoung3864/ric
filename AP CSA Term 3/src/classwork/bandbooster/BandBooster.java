package classwork.bandbooster;

public class BandBooster {
    private String name;
    private int boxesSold;

    public BandBooster(String name) {
        this.name = name;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int moreBoxes) {
        boxesSold += moreBoxes;
    }

    public String toString() {
        return name + ": " + boxesSold + " boxes";
    }
}
