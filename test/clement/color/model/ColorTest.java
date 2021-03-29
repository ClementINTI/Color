package clement.color.model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColorTest {

	private Color color;

	@Before
	public void setup() {
		color = new Color(0, 0, 0);
	}

	@After
	public void tearDown() {
		color = null;
	}

	// argument invalide
	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurInt1() {
		new Color(256, 10, 10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurInt2() {
		new Color(-1, 10, 10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurInt3() {
		new Color(10, 256, 10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurInt4() {
		new Color(10, -1, 10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurInt5() {
		new Color(10, 10, 256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurInt6() {
		new Color(10, 10, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa1() {
		new Color("#");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa2() {
		new Color("#GHIJKL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa3() {
		new Color("000000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa4() {
		new Color("1000000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa5() {
		new Color("#GH0000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa6() {
		new Color("#00IJ11");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa7() {
		new Color("#2233KL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa8() {
		new Color("#GHIJKL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetBlue1() {
		color.setBlue(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetBlue2() {
		color.setBlue(256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetGreen1() {
		color.setGreen(256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetGreen2() {
		color.setGreen(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetRed1() {
		color.setRed(256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetRed2() {
		color.setRed(-1);
	}

	@Test
	public void testToString() {
		assertEquals("[value=#D58D35, r=213, g=141, b=53]", color.toString());
	}
}
