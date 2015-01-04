/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

/**
 *
 * @author Dani
 */
public class WasRun extends TestCase {

    private boolean wasRun;
    private boolean wasSetUp;

    public WasRun(String testMethodName) {
        super(testMethodName);
        this.wasRun = false;
    }

    public boolean wasRun() {
        return this.wasRun;
    }

    public boolean wasSetUp() {
        return this.wasSetUp;
    }

    @Override
    public void setUp() {
        this.wasSetUp = true;
    }

    public void testMethod() {
        this.wasRun = true;
    }
}
