package TddPart2;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RunTest {
	@Test public void test(){
		 WasRun test = new WasRun("wasRunTest");
		 assertTrue(test.wasRun.equals("null"));  
		 test.run();
		 assertFalse(test.wasRun.equals("false"));  
		 assertTrue(test.wasRun.equals("true"));  

		} 
		@Test public void testRunning()
		{
			TestCaseTest testCaseTest = new TestCaseTest("testRunning");
			testCaseTest.testRunning();
		}
}
