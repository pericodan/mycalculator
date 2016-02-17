/**
 * Author: Perico Dan B. Dionisio
 * Program Description: Calculator of Simple Mathematical Functions
**/

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator c = new MyCalculator();
		
		float actual = c.nfactorial(7);
		assertEquals("7!=5040", actual, 5040, 0.0);
		
		actual = c.nfactorial(0);
		assertEquals("0!=1", actual, 1, 0.0);
		
		actual = c.nfactorial(-9);
		assertEquals("-9!=Math Error", actual, -1, 0.0);
	}

	@Test
	public void testBinarySearch() {
		MyCalculator c = new MyCalculator();
		int [] arr = {1, 2, 3, 4, 5};
		
		float actual = c.binarySearch(arr, 3);
		assertEquals("3 is in the array", actual, 2, 0.0);
		actual = c.binarySearch(arr, 2);
		assertEquals("2 is in the array", actual, 1, 0.0);
		actual = c.binarySearch(arr, 4);
		assertEquals("4 is in the array", actual, 3, 0.0);
		actual = c.binarySearch(arr, 0);
		assertEquals("0 is not in the array", actual, -1, 0.0);
		
		
	}

}
