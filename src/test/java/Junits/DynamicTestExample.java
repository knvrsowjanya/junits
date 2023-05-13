package Junits;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import code.StringFuntions;

public class DynamicTestExample {
	
	@TestFactory
	public Collection<DynamicTest> method1() {

		return Arrays.asList(

				DynamicTest.dynamicTest("Positive Test",
						() -> Assertions.assertTrue(StringFuntions.isPalindrome("madam"))),
				DynamicTest.dynamicTest("Negative Test",
						() -> Assertions.assertFalse(StringFuntions.isPalindrome("nikunj"))),
				DynamicTest.dynamicTest("Negative Test",
						() -> Assertions.assertFalse(StringFuntions.isPalindrome("shivani")))

		);

	}



}
