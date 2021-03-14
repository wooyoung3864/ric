package classwork.dog;
import java.util.Scanner;
public class Retriever extends Dawg {
    public static final Scanner in = new Scanner(System.in);
    private String furColor;
    private boolean isTrained;

    public static boolean isSat;
    public static boolean didShake;
    public static int numTreats = 50;

    public static Retriever[] dogs;

    public void test(String text) {
        System.out.println(text);
    }

    public static void createDogs() {
        System.out.println("Enter number of dogs: ");
        int size = in.nextInt();
        System.out.println("Enter name, age, gender, weight, fur color, and enter if it is trained");
        dogs = new Retriever[size];
        for(int i = 0; i < dogs.length; ++i) {
            dogs[i] = new Retriever(in.nextLine(), in.nextInt(), in.nextLine(), in.nextDouble(), in.nextLine(), in.nextBoolean());
        }
    }

    public void mainMenu() {
        //System.out.println("Enter a number: ");
        //int idx = in.nextInt();
        //Retriever thisDog = dogs[idx];
        boolean cont = true;
        while(cont) {
            System.out.println("Choose an option (enter 'exit' to break): " +
                    "\n1. Change attributes" +
                    "\n2. Call actions");
            if(in.nextInt() == 1)
                changeAttributes();
            else if(in.nextInt() == 2)
                behaviors();
            else if(in.next().equals("exit")) {
                cont = false;
            }

        }

    }

    public void changeAttributes() {
        System.out.println("1. Change name " +
                "\n2. Change age " +
                "\n3. Change gender " +
                "\n4. Change weight");
        int option = in.nextInt();
        if(option == 1) {
            setName(in.next());
            System.out.println(getName());
        } else if(option == 2) {
            setAge(in.nextInt());
            System.out.println(getGender());
        } else if(option == 3) {
            setGender(in.next());
            System.out.println(getWeight());
        }
    }

    public void behaviors() {
        System.out.println("1. Sit " +
                "\n2. Shake " +
                "\n3. Train " +
                "\n4. Give treat" +
                "\n5. Get number of treats left" +
                "\n6. Refill treats" +
                "\n7. Dye fur");
        int option = in.nextInt();
        if(option == 1) {
            sit();
        } else if(option == 2) {
            shake();
        } else if(option == 3) {
            train();
        } else if(option == 4) {
            giveTreat();
        } else if(option == 5) {
            checkTreats();
        } else if(option == 6) {
            refillTreats(in.nextInt());
        } else if(option == 7) {
            dye(in.nextLine());
        }
    }

    public Retriever(String name, int age, String gender, double weight, String furColor, boolean isTrained) {
        super(name, age, gender, weight);
        this.furColor = furColor;
        this.isTrained = isTrained;
        if(isTrained == false) {
            isSat = false;
            didShake = false;
        }
    }

    public void sit() {
        System.out.println("Sit!");
        isSat = true;
    }

    public void shake() {
        System.out.println("Shake!");
        didShake = true;
    }

    public void giveTreat() {
        if(isTrained && isSat && didShake) {
            System.out.println("Here, have a treat!");
            --numTreats;
            checkTreats();
        } else if(isSat == false && didShake == false){
            System.out.println("Sit and shake before you can have a treat!");
        } else if(isSat == false) {
            System.out.println("Sit before you can have a treat!");
        } else if(didShake == false) {
            System.out.println("Shake before you can have a treat!");
        } else {
            System.out.println("Get trained before you can have a treat!");
        }

        System.out.println("Number of treats left: " + getNumTreats());
    }

    public void checkTreats() {
        if(numTreats <= 0) {
            System.out.println("Out of treats! Please enter number of treats to refill");
            refillTreats(in.nextInt());
        }
    }

    public void refillTreats(int num) {
        if(numTreats < 0) {
            numTreats = num;
        } else {
            numTreats += num;
        }
    }

    public void train() {
        System.out.println("Training in progress... ");
        isTrained = true;
        numTreats -= 15;
        checkTreats();
        System.out.println("Is trained " + getTrain());
    }

    public boolean getSat() {
        return isSat;
    }

    public boolean getShake() {
        return didShake;
    }


    public boolean getTrain() {
        return isTrained;
    }

    public String getFurColor() {
        return furColor;
    }

    public void dye(String furColor) {
        this.furColor = furColor;
        System.out.println("New fur color: " + getFurColor());
    }

    public int getNumTreats() {
        checkTreats();
        return numTreats;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() +
                "\n Age: " + super.getAge() +
                "\n Gender: " + super.getGender() +
                "\n Weight: " + super.getWeight() +
                "\n Fur Color: " + getFurColor() +
                "\n Is trained: " + getTrain();
    }
}
