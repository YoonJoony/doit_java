package basic05;

public class ValueAssignment {
	public static void main(String[] args) {
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = ４;
		array1[2] = ５;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		int[] array2;
		array2 = new int[3];
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;	
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		
		int[] array3 = new int[] {3, 4, 5};
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);

	}
}
