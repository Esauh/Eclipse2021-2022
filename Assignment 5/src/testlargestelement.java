import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class largestelementTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		ArrayList<Integer> list1= new ArrayList<>();
		int output = test.largestelement(list1);
		assertEquals(1, output);
	}


}
