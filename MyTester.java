
import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator cal = new MyCalculator();
		float actual = cal.nfactorial(3);
		assertEquals("Expected 3!=6", 6, actual, 0.0);
	}
	
	@Test
	public void testNfactorial2() {
		MyCalculator cal = new MyCalculator();
		float actual = cal.nfactorial(3);
		assertEquals("Expected 5!=120", 120, actual, 0.0);
	}

	@Test
	public void testBinarySearch() {
		MyCalculator cal = new MyCalculator();
		int[] num = {2, 4, 6, 8, 10};
		float actual = cal.binarySearch(num, 6);
		assertEquals("Expected 6", 6, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch2() {
		MyCalculator cal = new MyCalculator();
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		float actual = cal.binarySearch(num, 5);
		assertEquals("Expected 5", 5, actual, 0.0);
	}

}
