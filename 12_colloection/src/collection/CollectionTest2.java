/* 1/7(화) 4 */
package collection;

import java.util.ArrayList;

public class CollectionTest2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이"); //중복허용, 순서
//		list.add(25); --<String>으로 Generic 했기 때문에
//		list.add(43.8);
		list.add("기린");
		list.add("코끼리");
		
		for(int i=0; i<list.size(); i++) { //배열.length대신 배열.size
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------------");
		
		for(String a : list) {
			System.out.println(a);
		}

	}

}
