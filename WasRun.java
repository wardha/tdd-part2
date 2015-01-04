/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

public class WasRun extends TestCase {

    public boolean wasRun;
    public boolean wasSetup;
    public String log;

    public WasRun(String name) {
        super(name);
        this.wasRun = false;
    }

    private void testMethod() {
        wasRun = true;
    }

    @Override
    public void wasSetUp() {
        wasRun = false;
        wasSetup = true;
        log = "wasSetup";
    }

    boolean wasRun() {
        return wasRun;
    }

    @Override
    public void tearDown() {
        log += "tearDown";
    }
    public String log(){
    return log;
    }
}
