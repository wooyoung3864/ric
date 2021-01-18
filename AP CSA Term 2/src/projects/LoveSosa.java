package projects;
import java.util.Scanner;
import java.io.FilterInputStream;
import java.io.IOException;
import com.sun.jdi.InternalException;
public class LoveSosa {
	public static final Scanner in = new Scanner(System.in);
	public static String songName;
	public static String lyrics;
	public static void main(String[] args) {
		System.out.println("Enter song name: ");
		songName = in.nextLine();
		System.out.println();
		System.out.println(scannerInfo());
		close();
		System.out.println();
		System.out.println(Sosa(songName));
	}
	
	public static String Sosa(String songName) 
	{
		try {
			if(songName.equalsIgnoreCase("Love Sosa")) {
				lyrics = "Fuckers in school telling me," + "\nAlways in the barber shop," + "\nChief Keef ain't about this, Chief Keef ain't about that" 
			+ "\nMy boy a BD on fucking Lamron and them" + "\nHe, he they say that nigga be putting in no work" + "\nShut the fuck up" + "\nY'all niggas ain't know shit" +
			"\nAll y'all motherfuckers talkin' bout \"Chief Keef ain't no hitter" + "\nChief Keef ain't this" + "\nChief Keef a fake\"" + "\nShut the fuck up" + "\nY'all don't live with that nigga" 
			+ "\nY'all know that nigga got caught with a ratchet" + "\nShootin' at the police and shit" + "\nNigga been on probation since" + "\nfuckin' I don't know when" 
			+ "\nMotherfucker, stop fuckin' playin' him like that" + "\nThem niggas savages out there" + "\nIf I catch another motherfucker talking sweet about Chief Keef" 
			+ "\nI'm fucking beatin' they ass" + "\nI'm not fucking playin' no more" + "\nKnow them niggas roll with Lil Reese and them" + "\nYoung Chop on the beat" + "\nLove Sosa" 
			+ "\nBitches love Sosa" + "\nThese bitches love Sosa, O end or no end" + "\nFuckin' wit dem O boys, you gon' get fucked over" + "\n'Raris and Rovers, these hoes love Chief Sosa" ;
			} else if(songName.equalsIgnoreCase("Marvin's Room") || songName.equalsIgnoreCase("Marvins Room")) {
				lyrics = "Cups of the Rose " + "\nBitches in my old phone" + "\nI should call one and go home"
			+ "\nI've been in this club way too long" + "\nThe woman that I would try" + "\nIs happy with a good guy"
			+ "\nBut I've been drinking so much" + "\nThat imma call her anyway and say," + "\nFuck that nigga that you love so bad" 
			+ "\nI know you still think about the times we had" + "\nI say fuck that nigga that you think you found" + "\nAnd since you picked up I know he's not around"
			+ "\nI'm just saying you could do better" + "\nTell me have you heard that lately" + "\nI'm just saying you could do better" + "\nAnd I'll start hating only if you make me";
			}
		} catch(Exception e) {
			throw new InternalException();
		} 
		return lyrics;
	}
	
	public static String scannerInfo() {
		return "Scanner information: " +  in.toString();
	}
	
	public static void close() {
		System.out.println("Closing Scanner...");
		in.close();
		System.out.println("Scanner closed!");
	}
	

}

/*
private static Scanner scanner = null;

public static Scanner getScanner() {
    if (scanner == null) {
        scanner = new Scanner(new FilterInputStream(System.in) {
            @Override
            public void close() throws IOException {
                //don't close System.in!
            }
        });
    }
    return scanner;
}
*/
