package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import MainPackage.MyClass;

public class MyClassTest {
	
	@Before
	public void setUp() throws Exception{
		
	}
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void testReturnTrue(){
		assertTrue("If you see this, this did not return true", MyClass.ReturnTrue());
		assertFalse("If you see this, this ReturnTrue is not false", MyClass.ReturnTrue());
	}
	@Test
	public void testAddTwoNumbers(){
		int answer = MyClass.AddTwoNumbers(0, 1);
		assertEquals("The two numbers did not equal", answer);
		
	}

}
