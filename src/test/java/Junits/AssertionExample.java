package Junits;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExample {
	
	@Test
	public void test1() {
		
		String str1 = "Simplilearn";
		String str2 = "Simplilearn";
		String str3 = "Simplilearn1";
		String str4 = null;
		
		boolean flag = true;
		boolean flag1 = false;
		
		int i = 7;
		int j = 10;
		
		String[] expectedArray = {"one", "two", "three"};
	    String[] resultArray =  {"one", "two", "three"};
	    
	    ArrayList<String> list1 = new  ArrayList<String>();
	    list1.add("Sowjanya");
	    list1.add("jitendra");
	    list1.add("lakshmi");
	    
		
		Assertions.assertEquals(str1, str2);
		Assertions.assertNotEquals(str1, str3);
		Assertions.assertNull(str4);
		Assertions.assertNotNull(str1);
		Assertions.assertTrue(flag);
		Assertions.assertFalse(flag1);
		
		Assertions.assertTrue(i<j);
		Assertions.assertFalse(i>j);
		
		Assertions.assertArrayEquals(expectedArray, resultArray);
		Assertions.assertFalse(list1.contains("Divya"));
		Assertions.assertEquals(3,list1.size());
	}


}
