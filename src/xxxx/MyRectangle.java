package xxxx;

public class MyRectangle {
	public double width;
	public double depth;
	
	public MyRectangle() {
		// TODO Auto-generated constructor stub
	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return width*depth;
	}

	}
