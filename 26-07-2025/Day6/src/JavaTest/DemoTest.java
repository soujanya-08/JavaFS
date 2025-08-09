package JavaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.wipro.ThreadDemo.JunitTesting;

class DemoTest {
	static JunitTesting t = null;
	@BeforeAll
	static void startUp() {
		t = new JunitTesting();
	}
	@Test
	void test() {
		String s = "SOUJANYA";
		String s2 = new String("SOUJANYA");
		//assertTrue(s.equals(s.toUpperCase()));
		assertEquals(s,s2);// checks the content only
		assertThrows(ArithmeticException.class, ()->{
			int x = 5/0;
		});
		assertDoesNotThrow(() -> {
	        int result = 10 / 2;
	    });
	}
	
	@Test
	void nullExcpetion() {
		assertThrows(NullPointerException.class, ()->{
			String str = null;
			char s =str.charAt(1);
		});
	}
	@ParameterizedTest
	@ValueSource(strings= {"soujanya","nikita","abhi"})
	 	void checkisLower(String s) {
		assertTrue(s.equals(s.toLowerCase()));
	}
	

}
