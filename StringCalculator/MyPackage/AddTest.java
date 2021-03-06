package MyPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test1() {
		
		Calculator calc = new Calculator();
		
		assertEquals(5,calc.Add("2,3"));
		assertEquals(3,calc.Add("3"));
		assertEquals(0,calc.Add(""));
		
	}
	
	
	

}
