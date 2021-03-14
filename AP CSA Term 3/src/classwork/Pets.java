package classwork;

public class Pets {
    private String petName;
    private String petType;
    private String owner;
    private String location;

    public Pets(String petName, String petType, String owner, String location) {
        this.petName = petName;
        this.petType = petType;
        this.owner = owner;
        this.location = location;
    }

    public Pets(String petName, String petType, String location) {
        this.petName = petName;
        this.petType = petType;
        this.location = location;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public String getOwner() {
        return owner;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "" + petName + " the " + petType + " owned by " + owner + " in " + location;
    }
}
