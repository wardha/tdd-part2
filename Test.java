/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

public class Test extends TestCase {

    private WasRun test;

    public Test(String testMethodName) {
        super(testMethodName);
    }

    @Override
    public void wasSetUp() {
        test = new WasRun("testMethod");
    }

    public void testRunning() throws Exception {
        test.run();
        assert test.wasRun();
    }

    public void testSetUp() throws Exception {
        test.run();
        assert test.wasRun();
    }

    public void testTemplateMethod() throws Exception {
        test = new WasRun("testMethod");
        test.run();
        assert test.log().equals("setUp testMethod tearDown ");
    }

    public void testResult() throws Exception {
        test = new WasRun("testMethod");
        test.run();
        assert result.summary().equals("1 run, 0 failed");
    }

    public void testFailedResult() throws Exception {
        test = new WasRun("testBrokenMethod");
        test.run();
        assert result.summary().equals("1 run, 1 failed");
    }
    public void testFailedResultFormatting() throws Exception {
        result= new TestResult();
        result.TestStarted();
        result.TestFailes();
        assert result.summary().equals("1 run, 1 failed");
    }

    
    public static void main(String[] args) {
        try {
            new Test("testFailedResultFormatting").run();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
