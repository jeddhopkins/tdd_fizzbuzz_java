import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzbuzzTest extends Fizzbuzz {
	
	public Fizzbuzz fizzbuzz;
	@BeforeEach
	public void before() {
		fizzbuzz = new Fizzbuzz();
	}
	
	@DisplayName("play fizzbuzz with the number 1")
	@Test
	public void testNumber() {
		String output = fizzbuzz.play(1);
		Assertions.assertEquals(output, "1");
	}
	
	@DisplayName("play fizzbuzz with the number 3")
	@Test
	public void testFizz() {
		String output = fizzbuzz.play(3);
		Assertions.assertEquals(output, "Fizz");
	}
	
	@DisplayName("play fizzbuzz with the number 5")
	@Test
	public void testBuzz() {
		String output = fizzbuzz.play(5);
		Assertions.assertEquals(output, "Buzz");
	}
	
	@DisplayName("play fizzbuzz with the number 15")
	@Test
	public void testFizzBuzz() {
		String output = fizzbuzz.play(15);
		Assertions.assertEquals(output, "FizzBuzz");
	}
	
	@DisplayName("dont play fizzbuzz with the number 0")
	@Test
	public void testzero() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> fizzbuzz.play(0));
	}
	
//	@Test
//	void test5() {
//		Fizzbuzz fizzbuzz = new Fizzbuzz();
//		assertArrayEquals(, fizzbuzz.converter(5));
//	}
}