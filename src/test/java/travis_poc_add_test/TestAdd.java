package travis_poc_add_test;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import travis_poc_add.AddTwoNumbers;

/**
 * @author sourabh
 *
 */
public class TestAdd extends AddTwoNumbers{
	private int val1;
	private int val2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		val1 = 3;
		val2 = 5;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		val1 = 0;
		val2 = 0;
	}

	/**
	 * Test method for {@link travis_poc_add.AddTwoNumbers#addTwo(int, int)}.
	 */
	@Test
	public void testAddTwo() {
		int sum = 8;
		int total = addTwo(val1, val2);
		assertEquals(sum,  total);

		//fail("Not yet implemented");
	}

}
