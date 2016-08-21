package test.testsuite;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        test.linkedlist.Stack.class,
        test.linkedlist.Queue.class
})

public class TestSuite {

}


