package oop15.enum04;

public class EnumTest {
	public static void main(String[] args) {
		City city = City.BUSAN;
		int a = city.getPopulation();
		System.out.println(a);
		System.out.println(City.SEOUL.getPopulation());
	}
}
