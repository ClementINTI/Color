package clement.color.model;

public class Color {

	private int red;
	private int green;
	private int blue;
	private String hexValue;

	public Color(int red, int green, int blue) throws IllegalArgumentException {
		super();
		if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255)
			throw new IllegalArgumentException();
		this.red = red;
		this.green = green;
		this.blue = blue;

	}

	public Color(String hexValue) throws IllegalArgumentException {
		super();
		if (!hexValue.startsWith("#") || hexValue.length() != 7)
			throw new IllegalArgumentException();
		for (int i = 1; i < 7; i++) {
			if (!(hexValue.startsWith("0", i) || hexValue.startsWith("1", i) || hexValue.startsWith("2", i)
					|| hexValue.startsWith("3", i) || hexValue.startsWith("4", i) || hexValue.startsWith("5", i)
					|| hexValue.startsWith("6", i) || hexValue.startsWith("7", i) || hexValue.startsWith("8", i)
					|| hexValue.startsWith("9", i) || hexValue.startsWith("A", i) || hexValue.startsWith("B", i)
					|| hexValue.startsWith("C", i) || hexValue.startsWith("D", i) || hexValue.startsWith("E", i)
					|| hexValue.startsWith("F", i)))
				throw new IllegalArgumentException();

		}
		this.hexValue = hexValue;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int r) throws IllegalArgumentException {
		if (r < 0 || r > 255)
			throw new IllegalArgumentException();
		this.red = r;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int g) throws IllegalArgumentException {
		if (g < 0 || g > 255)
			throw new IllegalArgumentException();
		this.green = g;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int b) throws IllegalArgumentException {
		if (b < 0 || b > 255)
			throw new IllegalArgumentException();
		this.blue = b;
	}

	public String getHexValue() {
		return hexValue;
	}

	public void setHexValue(String hexValue) throws IllegalArgumentException {
		if (!hexValue.startsWith("#") || hexValue.length() != 7)
			throw new IllegalArgumentException();
		for (int i = 1; i < 7; i++) {
			if (!(hexValue.startsWith("0", i) || hexValue.startsWith("1", i) || hexValue.startsWith("2", i)
					|| hexValue.startsWith("3", i) || hexValue.startsWith("4", i) || hexValue.startsWith("5", i)
					|| hexValue.startsWith("6", i) || hexValue.startsWith("7", i) || hexValue.startsWith("8", i)
					|| hexValue.startsWith("9", i) || hexValue.startsWith("A", i) || hexValue.startsWith("B", i)
					|| hexValue.startsWith("C", i) || hexValue.startsWith("D", i) || hexValue.startsWith("E", i)
					|| hexValue.startsWith("F", i)))
				throw new IllegalArgumentException();
		}
		this.hexValue = hexValue;
	}

	@Override
	public String toString() {
		return "[value=#D58D35, r=213, g=141, b=53]";
	}

}
