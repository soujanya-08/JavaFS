package JavaTest;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ DemoTest.class,DemoTest2.class })
public class AllTests {

}
