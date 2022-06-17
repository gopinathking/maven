package com.testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Demo {

    @Test	
	public void username() {
		
		String exp = "gopi";
		
		String act = "gopi";
		
		Assert.assertEquals(exp, act);

	}
	
    @Test(retryAnalyzer = Rerun.class)
    public void password() {
		
    	String exp = "12345";
    	
    	String act = "98658";
    	
    	Assert.assertEquals(exp, act);
	}
	
	
	
	
	
}
