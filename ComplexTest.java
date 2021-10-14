import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ComplexTest {
	Complex a;
	Complex b;
	Complex c;
	Complex d;

	@Before
	public void setUp() {
		a = new Complex(5, 5);
		b = new Complex(5, -5);
		c = new Complex(1, 0);
		d = new Complex(0, 1);
	}

	@Test
	public void testAdd() {
		assertEquals(new Complex(10, 0), a.plus(b));
	}
	
	@Test
	public void testMinus() {
		assertEquals(new Complex(0, 10), a.minus(b));
	}
	
	@Test
	public void testToString() {
		assertEquals(a.toString(), "5.0 + 5.0i");	
		assertEquals(b.toString(), "5.0 - 5.0i");			
		assertEquals(c.toString(), "1.0");
		assertEquals(d.toString(), "1.0i");
	}
} 
