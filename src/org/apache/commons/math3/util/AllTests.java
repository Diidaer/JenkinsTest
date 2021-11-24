package org.apache.commons.math3.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;
import junit.framework.*;

@RunWith(Suite.class)
@SuiteClasses({ MyLinkedListTest.class })
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(MyLinkedList.class));
		return suite;
	}
}
