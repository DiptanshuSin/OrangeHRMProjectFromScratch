package com.OrangeHRM.test;

import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;

public class dummyTest extends BaseClass {

	@Test
	public void dummyTestfirst() {
		String title = driver.getTitle();
		assert title.equals("OrangeHRM") : "Test Failed- Title does not Match";

		System.out.println("Test Passed- Title matching");
	}

}
