package ord.howard.edu.lsp.assignment5;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class cleartest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		ArrayList<Integer> list1= new ArrayList<>();
		int output = test.clear(list1);
		assertEquals(0, output);
	}

}
