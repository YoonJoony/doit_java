package basic05;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[][][] array = {
				{
					{100, 90, 80, 70},
					{ 90, 80, 70, 60},
					{ 80, 70, 60, 50}
				},
				{
					{ 80, 70, 60, 50},
					{100, 90, 80, 70},
					{ 90, 80, 70, 60}
				},
				{
					{ 90, 80, 70, 60},
					{ 80, 70, 60, 50},
					{100, 90, 80, 70}
				},
				
		};
		System.out.println("\t\t[성적표]");
		System.out.println("================== 1학기 ====================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		int sum;
		for(int tab = 0; tab < array.length; tab++) {
			for(int i = 0; i < array[tab].length; i++) {
				sum = 0;
				for(int j = 0; j < array[tab][i].length; j++) {
					sum += array[tab][i][j];
					System.out.print(array[tab][i][j] + "\t");
				}
				System.out.print(sum + "\t");
				System.out.print(sum / array[tab][i].length + "\t");
				System.out.println();
			}
		System.out.println("================== "+(tab+2)+"학기 ====================");
		}

	}
}
