package MyPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test1() {
		
		Calculator calc = new Calculator();
		
		assertEquals(10,calc.Add("//[***][%%][&&]\n1***2%%3&&4"));
		
		
	}
}
