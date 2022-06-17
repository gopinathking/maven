package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Assert_Concept {

	@Test
	public void demo() {
		
		String exp = "gopi";
		
		String act = "gopi";

		Assert.assertEquals(act, exp);
		
		System.out.println("validation");
	
	
    SoftAssert s = new SoftAssert();
    
    s.assertEquals(act, exp);
    
    System.out.println("verification");
    
    
	}
}
