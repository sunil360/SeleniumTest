package com.maventest.TestExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertVerifyExample {
	
	String className = "HardAssertions";
	@Test
	public void test_UsingHardAssertion() {
	try
	{
		Assert.assertFalse(true == true, "AssertFalse is failed");
	}
	catch(Throwable t)
	{
		System.out.println("A blog for Software Testers");
	}
	
	Assert.assertEquals("HardAssertion", "HardAssertion", "Failed the assertEquals");
	Assert.assertEquals(className, "HardAssertions", "Passed With class name");
	System.out.println("Successfully passed!");
	}
	}
