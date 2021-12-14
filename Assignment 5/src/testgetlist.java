import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getlistTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.getlist();
		assertEquals(1, output);
	}


}
