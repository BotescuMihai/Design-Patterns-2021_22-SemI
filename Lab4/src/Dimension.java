public class Dimension{
	private int height, width;
	
	public Dimension(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Dimension [height=" + height + ", width=" + width + "]";
	}
	
	
	
	
}