package com.imie.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideTest {
	
	private Divide div = new Divide(2);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		org.junit.Assert.assertNotNull(this.div);
		org.junit.Assert.assertEquals(20,this.div.value);
	}

	@Test
	public void testMake() {
		this.div.make(2);
		
		org.junit.Assert.assertNotNull(this.div);
		org.junit.Assert.assertEquals(1,this.div.getValue());
		
		this.div.make(0);
		Assert.assertEquals(Integer.MIN_VALUE, this.div.value);
	}
	
	/*@Test
	public void testGetValue() {
		org.junit.Assert.assertNotNull(this.div);
		org.junit.Assert.assertEquals(1,this.div.getValue());
	}*/

}
