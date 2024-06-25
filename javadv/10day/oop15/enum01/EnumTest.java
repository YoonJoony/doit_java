package oop15.enum01;

public class EnumTest {
	public static void main(String[] args) {
		whoAreYou(Person.MAN);
		whoAreYou(Animal.DOG);
		
		int myFriend = Person.WOMAN;
		if(myFriend == Animal.CAT) {
			System.out.println("고양이 이녀석--");
		} else {
			System.out.println("아! 고양인줄 알았습니다..");
		}
	}

	private static void whoAreYou(int man) {
		switch (man) {
		case Person.MAN:
			System.out.println("남성입니다.");
			break;
		case Person.WOMAN:
			System.out.println("여성입니다.");
			break;
		case Person.BABY:
			System.out.println("응애입니다.");
			break;
		}
	}
}
