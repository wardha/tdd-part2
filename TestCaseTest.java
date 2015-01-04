package TddPart2;

import static org.junit.Assert.assertTrue;

public class TestCaseTest extends TestCase{
	
	TestCaseTest(String name) {
		super(name);
	}

	 public void testRunning(){
		WasRun testRunning = new WasRun("testrunning");
		assertTrue(testRunning.wasRun.equals("null"));
		testRunning.run();
		assertTrue(testRunning.wasRun.equals("true"));
		TestCaseTest testCaseTest = new TestCaseTest("testrunning");
		testCaseTest.run();
		assertTrue(testRunning.wasRun.equals("true"));

		}
}
