package Bai2;

public class ToaDo2D {
	private String ten;
	private int x;
	private int y;
	private int z;
	
	public ToaDo2D() {
		super();
	}
	public ToaDo2D(String ten, int x, int y, int z) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public ToaDo2D negate() {
		return new ToaDo2D(ten, -x, -y, -z);
	}
	public double getDistance() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	public String toString() {
		return ten+"("+x+", "+y+", "+z+")";
	}
}
