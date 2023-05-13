package Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.StringFuntions;

public class isassertionforpalindrome {
	
	@Test
	
public void test1() {
		
		Assertions.assertTrue(StringFuntions.isPalindrome("madam"));
	}
	

	@Test
	public void test2() {
		
		Assertions.assertFalse(StringFuntions.isPalindrome("sowjanya"));
	}
}



