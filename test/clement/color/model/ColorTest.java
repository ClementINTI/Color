package clement.color.model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColorTest {

	private Color colorInt;
	private Color colorHexa;

	@Before
	public void setup() {
		colorInt = new Color(11, 24, 65);
		colorHexa = new Color("#123456");
	}

	@After
	public void tearDown() {
		colorInt = null;
		colorHexa = null;
	}

//---------------------------------TEST constructeur int IllegalArgumentException---------------------------------------
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

	// ---------------------------------TEST constructeur hexa et set hexa
	// IllegalArgumentException --------------
	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa1() {
		new Color("#");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHexa1() {
		new Color("#");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa2() {
		new Color("#GHIJKL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHexa2() {
		new Color("#GHIJKL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa3() {
		new Color("000000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHexa3() {
		new Color("000000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa4() {
		new Color("1000000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHexa4() {
		new Color("1000000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa5() {
		new Color("#GH0000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHexa5() {
		new Color("#GH0000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa6() {
		new Color("#00IJ11");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHexa6() {
		new Color("#00IJ11");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa7() {
		new Color("#2233KL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHexa7() {
		new Color("#2233KL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructeurHexa8() {
		new Color("#GHIJKL");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetHexa8() {
		new Color("#GHIJKL");
	}
	// ---------------------------------TEST Set int
	// IllegalArgumentException -------------

	@Test(expected = IllegalArgumentException.class)
	public void testSetBlue1() {
		colorInt.setBlue(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetBlue2() {
		colorInt.setBlue(256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetGreen1() {
		colorInt.setGreen(256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetGreen2() {
		colorInt.setGreen(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetRed1() {
		colorInt.setRed(256);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetRed2() {
		colorInt.setRed(-1);
	}

	// ---------------------------------TEST getteur
	// ---------------------------------------
	@Test
	public void testGetBlue() {
		assertEquals(11, colorInt.getBlue());
	}

	@Test
	public void testGetGreen() {
		assertEquals(24, colorInt.getGreen());
	}

	@Test
	public void testGetRed() {
		assertEquals(65, colorInt.getRed());
	}

	@Test
	public void testGetHexa() {
		assertEquals("#123456", colorHexa.getHexValue());
	}

	// --------------------------------- TEST setteur
	@Test
	public void testSetBlue() {
		colorInt.setBlue(255);
		assertEquals(255, colorInt.getBlue());
	}

	@Test
	public void testSetGreen() {
		colorInt.setGreen(255);

		assertEquals(255, colorInt.getGreen());
	}

	@Test
	public void testSetRed() {
		colorInt.setRed(255);
		assertEquals(255, colorInt.getRed());
	}

	@Test
	public void testSetHexa() {
		colorHexa.setHexValue("#789ABC");
		assertEquals("#789ABC", colorHexa.getHexValue());
	}

	@Test
	public void testToString() {
		assertEquals("[value=#D58D35, r=213, g=141, b=53]", colorInt.toString());
	}
}
