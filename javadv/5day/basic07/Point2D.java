package basic07;

public class Point2D {
	int x;
	int y;
	int z;
	
	public Point2D() {
		this(10, 20, 30);
		System.out.println("기본 생성자 수행 중");
	}
	
	public Point2D(int num1, int num2, int num3) {
		this.x = num1;
		this.y = num2;
		this.z = num3;
		System.out.println("Point2D(x, y) 생성자 수행중 ");
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
	
	public void setZ(int y) {
		this.y = z;
	}
	
	public void print() {
		System.out.print("X = " + getX());
		System.out.print(" Y = " + getY());
		System.out.print(" Z = " + getZ());
	}
}
