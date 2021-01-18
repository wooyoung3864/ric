package bellwork;

public class SuperHeroTester
{
    public static void main(String[] args)
    {
        SuperHero minchul = new SuperHero();
        System.out.println(minchul);
        minchul.slap();
        minchul.run();
        
        SuperHero ric = new SuperHero("Ric", "Tackle", 74, false);
        System.out.println(ric);
        ric.slap();
        ric.tackle();
        ric.run();
    }
}