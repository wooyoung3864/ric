package bellwork;

public class SuperHero
{
    private String name;
    private String power;
    private int hp;
    private boolean isBoy;
    private String gender;
    
    public SuperHero()
    {
        name = "Minchul";
        power = "Slap";
        hp = 69;
        isBoy = true;
    }
    
    public SuperHero(String name,String power, int hp, boolean isBoy)
    { 
        this.name = name;
        this.power = power;
        this.hp = hp;
        this.isBoy = isBoy;   
    }
    

    public void introduce()
    {
        if(isBoy == true)
        {
        	gender = "boy";
        }else if(isBoy == false)
        {
        	gender = "girl";
        }
        
    	System.out.println("Hi my name is " + name + " and my power is " + power + "." + " I am a " + gender + " and my HP is " + hp);
    }
    
    public void slap()
    {
        System.out.println("착!");
    }
    
    public void tackle()
    {
        System.out.println("slam");
    }
    
    public void run(){
        System.out.println("run!");
        
    }
    
    public static void main(String[] args)
    {
    	SuperHero minchul = new SuperHero();
        System.out.println(minchul);
        minchul.introduce();
        minchul.slap();
        minchul.run();
        
        SuperHero ric = new SuperHero("Ric", "Tackle", 74, false);
        System.out.println(ric);
        ric.introduce();
        ric.slap();
        ric.tackle();
        ric.run();
    }
    
}
