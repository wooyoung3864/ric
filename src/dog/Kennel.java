package dog;
import javax.swing.JOptionPane;
public class Kennel
{
	public static void main( String args[] )
		{
	     	String tempName="",tempOwner="",  tempBreed="", output="";
	     	int tempAge, c, counter;
	     	Dog dogArray[] = new Dog[10];

	     	for( c=0 ; c <10; c++)
	     	{
	     		tempName=JOptionPane.showInputDialog("Enter name of dog, type quit when done.");
	     		if(tempName.equalsIgnoreCase("quit"))
	     		{
	     			break; 
	     		}
			     tempOwner=JOptionPane.showInputDialog("Enter name of owner of dog");
			     tempBreed=JOptionPane.showInputDialog("Enter breed of dog");
			     tempAge=Integer.parseInt(JOptionPane.showInputDialog("Enter age of dog"));
			     dogArray[c] = new Dog(tempName, tempOwner ,tempBreed, tempAge);
			 }
		     while(true)
			 {
			     tempName=JOptionPane.showInputDialog("Enter name of dog to display, type quit to exit.");
			     if(tempName.equalsIgnoreCase("quit"))
				 {
				     break;
				 }
			     for( counter =0 ; counter < c; counter++)
				 {
				     if(tempName.equalsIgnoreCase(dogArray[counter].getName()) )
					 {
					     JOptionPane.showMessageDialog(null, "Your dog info is:\n"
					     + "Name: "+dogArray[counter].getName() +
					     "\nOwner Name: "+dogArray[counter].getOwner() +
					     "\nBreed: "+dogArray[counter].getBreed()+
					     "\nAge: "+dogArray[counter].getAge()+
					     "\nYears Left to Live: "+
				      	     dogArray[counter].computeYearsToLive() );
					     break; //exit for loop
					 }//end if
				 }
			     if (counter==c)
				 {
				     JOptionPane.showMessageDialog(null, "Dog not found! He must have died.");
				 }
			 }//end while
		  JOptionPane.showMessageDialog(null, "So long!");
		  System.exit(0);
		}
}
