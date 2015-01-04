/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

/**
 *
 * @author Dani
 */
public class Test extends TestCase {

    private WasRun test;

    public Test(String testMethodName) {
        super(testMethodName);
    }

    @Override
    public void setUp() {
        test = new WasRun("testMethod");
    }

    public void testRunning() throws Exception {
        test.run();
        assert test.wasRun();
    }

    public void testSetUp() throws Exception {
        test.run();
        assert test.wasSetUp();
    }

    public static void main(String[] args) {
        try {
            new Test("testRunning").run();
            new Test("testSetUp").run();
        } catch (Exception e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
