package Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import code.StringFuntions;

public class ParameterExample {
	
	@ParameterizedTest
	@ValueSource(strings= {"madam","dad","radar"})
	public void test1(String value) {
		
		Assertions.assertTrue(StringFuntions.isPalindrome(value));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,4,6})
	public void test2(int num) {
		Assertions.assertTrue(num%2==0);
	}




}
