/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.lang.reflect.Method;

/**
 *
 * @author Dani
 */
public class TestCase {

    protected String name;

    public TestCase(String testMethodName) {
        this.name = testMethodName;
    }

    public void setUp() {
    }

    public void run() throws Exception {
        setUp();
        Method method = this.getClass().getDeclaredMethod(this.name);
        if (method != null) {
            method.setAccessible(true);
            method.invoke(this);
        }
    }
}
