/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

public class Test extends TestCase {

    private WasRun test;
    private TestSuite suite;
    public Test(String testMethodName) {
        super(testMethodName);
    }

    @Override
    public void wasSetUp() {
        test = new WasRun("testMethod");
    }

    public void testFailedResultFormatting() throws Exception {
        result = new TestResult();
        result.TestStarted();
        result.TestFailes();
        assert result.summary().equals("1 run, 1 failed");
    }

    public void testSuite() throws Exception {
        suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);
        assert result.summary().equals("2 run, 1 failed");
    }

    public static void main(String[] args) {
        try {
            new Test("testSuite");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
