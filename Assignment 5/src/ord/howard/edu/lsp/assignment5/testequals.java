package ord.howard.edu.lsp.assignment5;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class equalsTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		IntegerSet set1= new IntegerSet(list1);
		IntegerSet set2= new IntegerSet(list2);
		boolean output = test.set1.equals(set2);
		assertEquals(false, output);
	}

}
