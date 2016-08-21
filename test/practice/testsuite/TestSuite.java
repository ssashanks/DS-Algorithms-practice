package practice.testsuite;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        practice.linkedlist.Stack.class,
        practice.linkedlist.Queue.class
})

public class TestSuite {

}


