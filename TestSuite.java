/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class TestSuite {

    ArrayList<TestCase> tests;

    public TestSuite() {
        tests = new ArrayList<TestCase>();
    }

    public void add(TestCase test) {
        tests.add(test);
    }

    public void run(TestResult result) throws Exception {
        for (TestCase test : tests) {
            test.run(result);
        }
    }
}
