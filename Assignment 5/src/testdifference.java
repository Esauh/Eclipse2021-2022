import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class differenceTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		IntegerSet set1= new IntegerSet(list1);
		IntegerSet set2= new IntegerSet(list2);
		IntegerSet output= ((IntegerSet) test.set1).difference(set2);
		assertEquals(1, output);
	}


}
