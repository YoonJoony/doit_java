package oop17.collection_list01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListTest1 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		// add(element) : 하나 추가
		list1.add(3); list1.add(4); list1.add(5);
		System.out.println(list1.toString());
		
		// add(index, element) : 인덱스에 하나 추가
		list1.add(1, 6);
		System.out.println(list1.toString());
		
		// addAll(collection 객체) : 뒤에 붙은 컬렉션 객체 전부 추가
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1); list2.add(2);
		list2.addAll(list1);
		System.out.println(list2.toString());
		
		// addAll(index, collection 객체) : 인덱스에 컬렉션 객체 전부 추가
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(11); list3.add(22);
		list3.addAll(1, list1);
		System.out.println(list3.toString());
		
		// set(index, element) : index 번호 요소를 elements 요소로 변경
		list3.set(1, 55);
		list3.set(3, 66);
		// list3.set(9, 1000);
		System.out.println(list3.toString());
		
		// remove(index) : index 위치 요소 삭제
		list3.remove(4);
		System.out.println(list3.toString());
		
		// remove(Object o) : wrapper 객체에 해당하는 값 제거
		list3.remove(Integer.valueOf(22));
		System.out.println(list3.toString());
		
		// clear() : 전부 제거
		list3.clear();
		System.out.println(list3.toString());
		
		// isEmpty() : 값이 비어있는지 확인
		System.out.println(list3.isEmpty());
		
		// size() : 배열의 크기
		System.out.println(list3.size());
		list3.add(1);
		list3.add(2);
		System.out.println(list3.size());
		
		// get(index) : index 위치 값 출력
		System.out.println(list3.get(0));
		System.out.println(list3.get(1));
		System.out.println(list3.toString());
		
		// 배열로 변환
		Object[] obj = list3.toArray();
		System.out.println(Arrays.toString(obj));
		
		Integer[] integers1 = list3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integers1));
		
		Integer[] integers2 = list3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integers2));
		
		// /?ㄴ
	}
}
