package org.apache.commons.math3.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCompareToDoubleDoubleDouble() {
		Double x = new Double(8);
		Double y = new Double(10);
		Double eps = new Double(1);
		int n;
		n = MyLinkedList.compareTo(x, y, eps);
		assertEquals(-1, n);
	}

	@Test
	public void testEqualsFloatFloat() {
		Float x = new Float(8.8);
		Float y = new Float(8.8);
		boolean n;
		n = MyLinkedList.equals(x, y);
		assertEquals(true, n);
	}

	@Test
	public void testEqualsDoubleDouble() {
		Double x = new Double(8.888);
		Double y = new Double(10.111);
		boolean n;
		n = MyLinkedList.equals(x, y);
		assertEquals(false, n);
	}

}
