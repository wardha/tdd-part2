/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

public class TestResult {

    public int runCount;
    private int errCount;

    TestResult() {
        runCount = 0;
    }

    public void TestStarted() {
        runCount += 1;
    }
    public void TestFailes(){
      errCount+=1;
    }

    public String summary() {
        return runCount + " run, 0 failed";
    }
}
