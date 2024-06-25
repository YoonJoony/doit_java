package basic07;

public class Point3D extends Point2D{
	private int x;
	private int y;
	
	public Point3D() {
		System.out.println("Point3D() 수행 중");
	}

	public Point3D(int x, int y, int z) {
		this.x = x;			
	}
}
