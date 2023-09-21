package co.edu.unbosque.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalcAllTestsV3 extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(CalcAllTestsV3.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CalcTest2V3.class);
		suite.addTestSuite(CalcTestV3.class);
		//$JUnit-END$
		return suite;
	}

}
