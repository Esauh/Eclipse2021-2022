import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class removeItemTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int item = 0;
		ArrayList<Integer> list1= new ArrayList<>();
		int output = test.removeItem(item);
		assertEquals(0, output);
	}

}
