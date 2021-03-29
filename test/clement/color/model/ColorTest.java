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
	public void testConstructeurInt() {
		new Color(256, 10, 10);
		new Color(-1, 10, 10);
		new Color(10, 256, 10);
		new Color(10, -1, 10);
		new Color(10, 10, 256);
		new Color(10, 10, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa() {
		new Color("#");
		new Color("#GHIJKL");
		new Color("000000");
		new Color("1000000");
		new Color("#GH0000");
		new Color("#00IJ11");
		new Color("#2233KL");
		new Color("#GHIJKL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetBlue() {
		color.setBlue(-1);
		color.setBlue(256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetGreen() {
		color.setGreen(-1);
		color.setGreen(256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetRed() {
		color.setRed(-1);
		color.setRed(256);
	}

	@Test
	public void testToString() {
		assertEquals("[value=#D58D35, r=213, g=141, b=53]", color.toString());
	}
}
