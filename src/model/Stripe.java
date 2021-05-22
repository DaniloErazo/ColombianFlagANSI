package model;


public class Stripe {
	
	
	private int color;
	private int y;
	private int width;
	private int length;
	private int sleep;
	
	public Stripe(int c, int y, int w, int l, int s) {
		setColor(c);
		this.setY(y);
		setWidth(w);
		setLength(l);
		setSleep(s);
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

}
