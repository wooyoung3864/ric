package projects;

public class RandomWord {
	private String word1;
	private String word2;
	
	public RandomWord(String word1, String word2) 
	{
		this.word1 = word1;
		this.word2 = word2;
	}
	
	public static String letter;
	public static String newWord = "";
	
	public String randomLetter(int num)
	{
		String chosenWord = word1;
		if(num == 2) {
			chosenWord = word2;
		}
		
		int upperBound = (int) (Math.random() * chosenWord.length()) + 1;
		int lowerBound = upperBound - 1;
		letter = chosenWord.substring(lowerBound, upperBound);
		newWord += letter;
		return letter;
	}
	
	public String getNewWord() 
	{
		String word = newWord;
		newWord = "";
		return word;
	}
	
	public static void main(String[] args) 
	{
		RandomWord rand1 = new RandomWord("zebra", "dog");
		System.out.println(rand1.randomLetter(1));
		System.out.println(rand1.randomLetter(1));
		System.out.println(rand1.randomLetter(2));
		System.out.println(rand1.getNewWord());
		
		RandomWord rand2 = new RandomWord("fuck", "bitch");
		System.out.println(rand2.getNewWord());
		System.out.println(rand2.randomLetter(1));
		System.out.println(rand1.randomLetter(2));
		System.out.println(rand2.randomLetter(2));
		System.out.println(rand2.getNewWord());
	}
}
