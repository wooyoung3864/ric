package problems;

public class FizzBuzzFixed {
	public static void main(String[] args) {
		FizzBuzz();
	}
	
	public static void FizzBuzz() {
		for(Integer i = 0; i < 100; ++i) {
			String val = "";
			
			if(i % 3 == 0) {
				val += "Fizz";
			}
			
			if(i % 5 == 0) {
				val += "Buzz";
			}
			
			if(val.equals("")) {
				val = i.toString();
			}
			
			System.out.println(val);   
		}
	}
}