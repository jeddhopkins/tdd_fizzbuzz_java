import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzbuzzTest extends Fizzbuzz {
	
	@DisplayName("play fizzbuzz with the number 1")
	@Test
	public void testNumber() {
		String fizzbuzz = new Fizzbuzz().play(1);
		Assertions.assertEquals(fizzbuzz, "1");
	}
	
	@DisplayName("play fizzbuzz with the number 3")
	@Test
	public void testFizz() {
		String fizzbuzz = new Fizzbuzz().play(3);
		Assertions.assertEquals(fizzbuzz, "Fizz");
	}
	
	@DisplayName("play fizzbuzz with the number 5")
	@Test
	public void testBuzz() {
		String fizzbuzz = new Fizzbuzz().play(5);
		Assertions.assertEquals(fizzbuzz, "Buzz");
	}
	
	@DisplayName("play fizzbuzz with the number 15")
	@Test
	public void testFizzBuzz() {
		String fizzbuzz = new Fizzbuzz().play(15);
		Assertions.assertEquals(fizzbuzz, "FizzBuzz");
	}
	
//	@Test
//	void test5() {
//		Fizzbuzz fizzbuzz = new Fizzbuzz();
//		assertArrayEquals(, fizzbuzz.converter(5));
//	}
}