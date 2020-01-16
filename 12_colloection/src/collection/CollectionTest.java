/* 1/7(화) 3 */
package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* interface 사용하려면
1. implements
   	모든 추상메소드를 Override를 해줘야 함
2. 익명 클래스
   	모든 추상메소드를 Override를 해줘야 함   
3. 대신 implements 해주는 클래스
   	ArrayList를 제일 많이 씀, LinkedList(큐), Stack
4. 메소드를 통한 생성
 */

public class CollectionTest {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); //중복허용, 순서
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it = coll.iterator(); //생성
		while(it.hasNext()) { 
			System.out.println(it.next());
		}
	}
}
