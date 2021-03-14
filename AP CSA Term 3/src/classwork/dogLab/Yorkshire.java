package classwork.dogLab;

public class Yorkshire extends Dog
{

    public Yorkshire(String name)
    {
        super(name);
    }

    // ------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }

}



// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************


