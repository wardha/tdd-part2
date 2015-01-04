/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.lang.reflect.Method;


public class TestCase {

    protected String name;

    public TestCase(String testMethodName) {
        this.name = testMethodName;
    }

    public void wasSetUp() {
    }

    public void run() throws Exception {
        wasSetUp();
        Method method = this.getClass().getDeclaredMethod(this.name);
        if (method != null) {
            method.setAccessible(true);
            method.invoke(this);
        }
    }

    public void tearDown() {
    }
}
