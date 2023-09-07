package practice;

public class Cube {
	protected double length;
	
	public Cube() {
		// TODO Auto-generated constructor stub
	}
	
	public Cube(double length) throws CubeException {
		setLength(length);
	}

	public void setLength(double length) throws CubeException {
		if (length > 0) {
			this.length = length;
		}else {
			throw new CubeException("邊長不可為負值");
		}
	}
	
	public double getLength() {
		return length;
	}
	
	public double volume() {
		return Math.pow(length, 3);
	}

}
