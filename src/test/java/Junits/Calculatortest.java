package Junits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

import code.Calculator;



public class Calculatortest {
	
	
	@DisplayName("Two positive number test")
		@Test
	@Tag("Sanity1")
	public void test1() {
		
		int result = Calculator.add(10, 5);
		Assertions.assertEquals(15, result);

	}
	
	@DisplayName("one positive number and one negative number test")
	@Test
	public void test2() {
		
		int result = Calculator.add(-10, 5);
		Assertions.assertEquals(-5, result);
	}
	
	@RepeatedTest(3)
	@DisplayName("Two positive number test with out matching the value")
	
	public void test3() {
		
		int result = Calculator.add(10, 5);
		Assertions.assertNotEquals(11, result);
	}
	
	@CustomeAnnotation
public void test4() {
		
		int result = Calculator.add(11, 5);
		Assertions.assertNotEquals(11, result);
	}
	

}
