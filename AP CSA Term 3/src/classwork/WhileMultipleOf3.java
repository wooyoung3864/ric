package classwork;

public class WhileMultipleOf3 {
	public static void main(String[] args) {
		int count  = 0;
		int num = 1327;
		while(num <= 4542) {
			if(num % 3 == 0 && num %5 != 0) {
				++count;
			}
		}
		System.out.println(count);
	}
}
