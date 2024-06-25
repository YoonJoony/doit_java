package oop19.generic02;

public class Solution1_UsingObject {
	public static void main(String[] args) {
		// 1. Goods를 통해서 Apple 객체 추가 및 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		// getObject 타입은 Object 타입이므로 Apple로 다운 캐스팅 필요
		Apple apple = (Apple)goods1.getObject();
		
		// 2. Goods를 통해서 Pencil 객체 추가 및 가져오기
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil)goods2.getObject();
		
		// 3. 잘못된 캐스팅
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple());
//		Pencil pencil2 = (Pencil)goods3.getObject(); //실행예외
	}
}
