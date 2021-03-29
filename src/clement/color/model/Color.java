package clement.color.model;

public class Color {

	private int red;
	private int green;
	private int blue;
	private String hexValue;

	public Color(int red, int green, int blue) throws IllegalArgumentException {
		/*
		 * super(); this.r = r; this.g = g; this.b = b;
		 */
	}

	public Color(String hexValue) throws IllegalArgumentException {

	}

	public int getRed() {
		return 300;
	}

	public void setRed(int r) {
		// this.r = r;
	}

	public int getGreen() {
		return 300;
	}

	public void setGreen(int g) {
		// this.g = g;
	}

	public int getBlue() {
		return 300;
	}

	public void setBlue(int b) {
		// this.b = b;
	}

	public String getHexValue() {
		return null;
	}

	public void setHexValue(String hexValue) {
		this.hexValue = hexValue;
	}

	@Override
	public String toString() {
		return null;
	}

}
