/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.lang.reflect.Method;

public class TestCase {

    protected String name;
    protected TestResult result;

    public TestCase(String testMethodName) {
        this.name = testMethodName;
    }

    public void wasSetUp() {
    }

    public TestResult run() throws Exception {
        result = new TestResult();
        result.TestStarted();
        wasSetUp();
        Method method = this.getClass().getDeclaredMethod(this.name);
        try{
            method.setAccessible(true);
            method.invoke(this);
        }
        catch(Exception e){
        result.TestFailes();
         }
        tearDown();
        return result;
    }

    public void tearDown() {
    }
}
