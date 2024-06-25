package basic05;

public class MethodOfString_2 {
	public static void main(String[] args) {
		// 문자열 수정
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		// @replace()
		System.out.println(str1.replace("Study", "공부"));
		
		// @split()
		String[] strArrayStrings = "abc/def-ghi jkl" .split("/|-|)");
		//System.out.println(str1.replace("Study", 0));
	}
}
