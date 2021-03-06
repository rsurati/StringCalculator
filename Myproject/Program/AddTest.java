package Program;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AddTest {

	@Test
	public void test() {
		
		 MyJUnitClass ju = new MyJUnitClass();
		 int result = ju.Add(2, 3);
		 
		 assertEquals(3,3);
		 
	}

}
