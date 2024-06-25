package oop15.enum03;

import oop15.enum03.Person;

public class EnumTest03 {
	public static void main(String[] args) {
		whoAreYou(Person.MAN);
		
		Person myFreindPerson1 = Person.WOMAN;
		//myFreindPerson myFriend2 = Animal.DOG;
	}

	private static void whoAreYou(Person man) {
		switch (man) {
		case MAN:
			System.out.println("남성입니다.");
			break;
		case WOMAN:
			System.out.println("여성입니다.");
			break;
		case BABY:
			System.out.println("응애입니다.");
			break;
		}
	}
}
