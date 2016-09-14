package test.testsuite;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
      	test.linkedlist.StackTest.class,
        test.linkedlist.QueueTest.class
})

public class TestSuite {

}


