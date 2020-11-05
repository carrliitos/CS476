/**
* Fixtures - a fixed state of a set of objects used as a baseline for running 
* tests.
* The purpose of a test fixture is to ensure that there is a well-known and fixed
* environment in which tests are run so that results are repeatable.
*
* setUp() - runs before every test invocation
* tearDown() - runs after every test method
*/

package UnitTesting;

import junit.framework.*;

public class Fixtures extends TestCase {
	protected int value1, value2;

	// assigning values
	protected void setUp() {
		value1 = 3;
		value2 = 3;
	}

	// test method to add two valuess
	public void testAdd() {
		double result = value1 + value2;
		assertTrue(result == 6);
	}
}