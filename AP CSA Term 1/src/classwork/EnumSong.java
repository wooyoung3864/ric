package classwork;

public class EnumSong {
		enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
		public static void main (String[] args)
		{
			Day day;
			
			day = Day.Monday;
			System.out.println("They call it stormy " + day);
			
			day = Day.Tuesday;
			System.out.println("But " + day +"'s" + " just as bad");
			
			day = Day.Wednesday;
			System.out.println(day +"'s " + "worse, ");
			
			day = Day.Thursday;
			System.out.println("And " + day + "'s oh so sad");
			System.out.println();
			
			day = Day.Friday;
			System.out.println("Yes, the eagle flies on " + day + "'s");
			
			day = Day.Saturday;
			System.out.println("And " + day + "I go out to play");
			
			day = Day.Sunday;
			System.out.println(day + "'s I go to church then kneel down to pray");
			
			day = Day.Monday;
			System.out.println("Oh, they call it stormy " + day + "..."); 

		}
		
}
