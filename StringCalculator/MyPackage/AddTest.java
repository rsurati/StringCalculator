package MyPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test1() {
		
		Calculator calc = new Calculator();
		
		assertEquals(16,calc.Add("2,3,5,6"));
		assertEquals(3,calc.Add("3"));
		assertEquals(0,calc.Add(""));
		
	}
	
	
	

}
