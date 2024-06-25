package basic05;

public class RectangleValueAssinment {
	public static void main(String[] args) {
		//배열 객체 생성 및 원소 값 대입(방법 1)
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		System.out.println(array1[0][0] + " " + array1[0][1] + " " + array1[0][2] + " ");
		System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2] + " ");
		System.out.println();
		
		int[][] array2 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		System.out.println(array1[0][0] + " " + array1[0][1] + " " + array1[0][2] + " ");
		System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2] + " ");
		System.out.println();
		
		int[][] array3;
		array3 = new int[2][3];
		array3[0][0] = 1;
		array3[0][1] = 2;
		array3[0][2] = 3;
		array3[1][0] = 4;
		array3[1][1] = 5;
		array3[1][2] = 6;
		
		System.out.println(array3[0][0] + " " + array3[0][1] + " " + array3[0][2] + " ");
		System.out.println(array3[1][0] + " " + array3[1][1] + " " + array3[1][2] + " ");
		System.out.println();
	}
}
