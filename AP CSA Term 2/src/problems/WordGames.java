package problems;

public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        int halfLength = word.length()/2;
        // switch first half
        String firstHalf = word.substring(0, halfLength);
        // and second half
        String secondHalf = word.substring(halfLength);
        String rdwo = secondHalf + firstHalf;
        return rdwo;
      
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
    	String newString;
    	int endIndex = word.length()-1;
        String firstHalf = word.substring(0, insertIdx);
        String secondHalf = word.substring(insertIdx);
        newString = firstHalf + insertText + secondHalf;
        
        return newString;
       
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
    	

    	int charIndex = word.indexOf(insertChar);
    	
    	String splitString;
		 
		String firstHalf= word.substring(0, charIndex);
		String secondHalf= word.substring(charIndex);
    	splitString = firstHalf + insertText + secondHalf;
        return splitString;
    }
    
    
    public String toString()
    {
        return "[" + word + "]";
        
    }
    
    
}

//Insert insertText after the first
// occurence of the insertChar
/*
 * public String bananaSplit(String insertChar, String insertText) : Returns a String that puts insertText in 
 * the word such that the first character of insertText is at the index of the first occurrence of insertChar. 
 * For example, if you want to put “BOO” in the word “ghost” and insertChar is ‘o’, this method would 
 * return “ghBOOost”. Note the index of “B” is the same index as the “o” was. Use substring, indexOf, 
 * and concatenation to create the new String
 */