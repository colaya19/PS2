package pkgEmpty;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyInteger uno = new MyInteger(2);
		MyInteger dos = new MyInteger(7);
		
		assertEquals(uno.isOdd(), true);
		assertEquals(uno.isPrime(), true);
		assertEquals(uno.isEven(), false);
		assertEquals(dos.isPrime(), true);
		assertEquals(dos.isOdd(), true);
		assertEquals(MyInteger.isOdd(uno), true);
		assertEquals(MyInteger.isPrime(uno), true);
		assertEquals(MyInteger.isEven(uno), false);
		assertEquals(uno.equals(dos), false);
		assertEquals(uno.equals(5), true);
	}

}
