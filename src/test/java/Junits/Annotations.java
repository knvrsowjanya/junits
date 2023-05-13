package Junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class Annotations {
	
	@BeforeAll
	public static void beforeall() {
	
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforejunit() {
	
		System.out.println("Before Junit");
	}

	
	@Test
	public void test1() {
		
		int result = Calculator.add(10, 5);
		Assertions.assertEquals(15, result);

	}
	

	@Test
	public void test2() {
		
		int result = Calculator.add(10, 8);
		Assertions.assertEquals(18, result);

	}
	@AfterEach
	public void afterjunit() {
		
		System.out.println("After Junit");
	}
	
	@AfterAll
	public static void Afterall() {
	
		System.out.println("After All");
	}

	

}
