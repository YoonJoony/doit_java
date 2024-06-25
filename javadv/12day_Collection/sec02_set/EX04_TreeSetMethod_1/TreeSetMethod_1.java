package sec02_set.EX04_TreeSetMethod_1;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod_1 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		for(int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet.toString());
		// 1. first : 가장 큰 값
		System.out.println(treeSet.first());
		// 2. last() : 가장 작은 값
		System.out.println(treeSet.last());
		// 3. lower() : 제공된 값보다 작은 값 중 가장 큰 값
		System.out.println(treeSet.lower(26));
		// 4. higher() : 제공된 값보다 큰 값중 가장 작은 값
		System.out.println(treeSet.higher(26)); //28

		// 5. floor() : 제공된 값과 같거나 작은 값 중 가장 큰 값
		System.out.println(treeSet.floor(25)); //24
		System.out.println(treeSet.floor(26)); //26
		//#6. ceiling(E element) : 제공된 값보다 크거나 같은 값 중 가장 작은 값
		System.out.println(treeSet.ceiling(25)); //26
		System.out.println(treeSet.ceiling(26)); //26
		System.out.println();
		
		//#7. pollFirst() : 가장 작은 값 반환 후 삭제
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize); //25
		for(int i=0; i<treeSetSize; i++) {
			System.out.print(treeSet.pollFirst() + " "); // 2 4 6 8 10 12 14 ... 50
		}
		System.out.println();
		System.out.println(treeSet.size()); //0

		//#8. pollLast() : 가장 큰 값 반환 후 삭제
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		treeSetSize = treeSet.size(); //25
		for(int i=0; i<treeSetSize; i++) {
			System.out.print(treeSet.pollLast() + " "); //50 48 46 44 42 40 ... 2
		}
		System.out.println();
		System.out.println(treeSet.size()); //0
		
		//#9. SortedSet<E> headSet(E element)
		// element보다 작은 객체드로 구성된 SortedSet 리턴
		for(int i=50; i>0; i-=2) { //[2, 4, 6, ..., 50]
			treeSet.add(i);
		}
		SortedSet<Integer> sSet = treeSet.headSet(20); 
		System.out.println("Sorted.headSet() : " + sSet.toString()); //[2, 4, 6, 8, 10, 12, 14, 16, 18]		
		
		//#10. NavigableSet<E> headSet(E element, boolean inclusive)
		// headSet(element, true) : element보다 같거나 작은 값 
		NavigableSet<Integer> nSet = treeSet.headSet(20, true); 
		System.out.println(nSet.toString()); //[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]	
		nSet = treeSet.headSet(20, false);
		System.out.println(nSet.toString()); //[2, 4, 6, 8, 10, 12, 14, 16, 18]	
		
		//#11. SortedSet<E> tailSet(E element: 
		// tailSet(element) element보다 큰 객체들로 구성된 SortedSet 리턴
		sSet = treeSet.tailSet(20);
		System.out.println(sSet.toString()); // [20, 22, 24, ..., 50]
		
		//#12. NavigableSet<E> tailSet(E element, boolean inclusive)
		nSet = treeSet.tailSet(20, true);
		System.out.println(nSet.toString()); // [20, 22, 24, ..., 50]
		nSet = treeSet.tailSet(20, false);
		System.out.println(nSet.toString()); // [22, 24, ..., 50]
		
		//#13. SortedSet<E> subSet(E element, E element)
		// subset(n1, n2) : n1보다 크고 n2보다 작은 객체들로만 구성된 SortedSet 리턴
		sSet = treeSet.subSet(10, 20);
		System.out.println(sSet.toString()); // [10, 12, ... , 18]
		
		//#14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		nSet = treeSet.subSet(10, true, 20, false);
		System.out.println(nSet.toString()); // [10, 12, ... , 18]
		nSet = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet.toString()); // [12, 14, ... , 20]
		
		//#15. NavigableSet<E> descendingSet()
		System.out.println(treeSet); //오름차순
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet); //내림차순
		descendingSet=descendingSet.descendingSet();
		System.out.println(descendingSet); //오름차순
	}
}
