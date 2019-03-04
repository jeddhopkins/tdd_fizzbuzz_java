public class Fizzbuzz {
	
	public String play(int num) {
		
		if (num % 15 == 0) return "FizzBuzz";
		if (num % 5 == 0) return "Buzz";
		if (num % 3 == 0) return "Fizz";
		
		return String.valueOf(num);
	}
	
}
