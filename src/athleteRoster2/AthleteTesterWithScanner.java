package athleteRoster2;

import java.util.Scanner;

public class AthleteTesterWithScanner {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.println(Athlete2.hello());
			String team = in.next();
			//System.out.println(Athlete2.instructions());

			System.out.println();
			System.out.println("CREATE ROSTER");
			System.out.println("How many players are on your team?");
			int numPlayers = in.nextInt();
			
			Athlete2 player = null;
			Stats stats = null;
				for(int i=0; i<numPlayers; ++i)
				{
					System.out.println("Enter player name: ");
					String name = in.next();
					System.out.println("Enter player position: ");
					String position = in.next();
					System.out.println("Enter player number: ");
					int number = in.nextInt();
					System.out.println("Enter player height: ");
					int height = in.nextInt();
					System.out.println();
					
					player = new Athlete2(name, position, number, height);
					System.out.println(player);
					
					System.out.println("Player stats for " + name);
					System.out.println("Points scored: ");
					int pts = in.nextInt();
					System.out.println("Field goals made:");
					int fgm = in.nextInt();
					System.out.println("Field goals attempted:");
					int fga = in.nextInt();
					System.out.println("3-pointers made: ");
					int tpm = in.nextInt();
					System.out.println("3-pointers attempted: ");
					int tpa = in.nextInt();
					System.out.println("Free throws made: ");
					int ftm = in.nextInt();
					System.out.println("Free throws attempted: ");
					int fta = in.nextInt();
					System.out.println("Rebounds: ");
					int reb = in.nextInt();
					System.out.println("Assists: ");
					int asst = in.nextInt();
					System.out.println("Fouls: ");
					int fouls = in.nextInt();
					System.out.println();
					
					stats = new Stats(pts, fga, fgm, tpa, tpm, fta, ftm, reb, asst, fouls);
					System.out.println(stats);
					System.out.println(stats.fouledOut(fouls));
					System.out.println(stats.fgp(fgm,  fga));
					System.out.println(stats.tpp(tpm,  tpa));
					System.out.println(stats.ftp(ftm,  fta));
				}	
			in.close();
		}
}
