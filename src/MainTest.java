import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testA() {
		int[] array = {1,2,3,4,5,6};
		assertEquals(2, Main.BinarySearch(3, array));
	}
	
	@Test
	void testB() {
		int[] array = {1,10,50,60,70,100};
		assertEquals(0, Main.BinarySearch(1, array));
	}
	
	@Test
	void testC() {
		int[] array = {-30,0,4,5,1000,3500,5000,10000};
		assertEquals(1, Main.BinarySearch(0, array));
	}
	
	@Test
	void testD() {
		int[] array = {-20,-18,-17,-15,-10};
		assertEquals(4, Main.BinarySearch(-10, array));
	}
	
	@Test
	void testE() {
		int[] array = {1,10,50,60,70,100};
		assertEquals(-1, Main.BinarySearch(-3, array));
	}
	
	

}
