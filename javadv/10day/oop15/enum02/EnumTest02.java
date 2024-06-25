package oop15.enum02;

public class EnumTest02 {
	public static void main(String[] args) {
		Person man = Person.WOMAN;
		
		if(man == Person.MAN) {
			System.out.println("남성이시군요!");
		}
		else if(man == Person.WOMAN) {
			System.out.println("여성이시군요!");
		}
		else {
			System.out.println("애기시군요!");
		}
//		
//		if(man == Animal.DOG) {
//			System.out.println("사람이 멍멍이냐");
//		}
	}
}
