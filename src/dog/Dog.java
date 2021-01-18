package dog;

public class Dog {
		private String name;
		private String owner;
		private String breed;
		private int age;
		//private int humanAge;
		
		public Dog()
		{
			name = " ";
			owner = " ";
			breed = " ";
			age = 0;
			//humanAge = age * 5;
		}
		
		public Dog(String name, String owner, String breed, int age /*, int humanAge*/)
		{
			this.name = name;
			this.owner = owner;
			this.breed = breed;
			this.age  = age;
			//this.humanAge = humanAge;
		}
		
		public Dog(Dog someDog)
		{
			this.name = someDog.getName();
			this.owner = someDog.getOwner();
			this.breed = someDog.getBreed();
			this.age = someDog.getAge();
			//this.humanAge = someDog.getHumanAge();
		}
		
		public String getName()	{ return name; }
		public String getOwner() { return owner; }
		public String getBreed() { return breed;}
		public int getAge() { return age; }
		//public int getHumanAge() { return humanAge; }
		
		public int computeYearsToLive()
		{
			int toLive;
			if(breed.equalsIgnoreCase("german"))
			{
				toLive = 15-age;
			}
			else if(breed.equalsIgnoreCase("boxer"))
			{
				toLive = 11-age;
			}
			else if(breed.equalsIgnoreCase("terrier"))
			{
				toLive = 8-age;
			}
			else if(breed.equalsIgnoreCase("doberman"))
			{
				toLive = 13-age;
			}
			else
			{
				toLive = 14-age;
			}
			return toLive;
		}
		
		public String toString()
		{
			return "Dog's name: " + name + ", " + age + " years old " + "(" /*+ humanAge + " in human age). " */+ "Owner: " + owner + ", " + "Breed: " + breed + ", ";  
		}
}
