package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();	
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이"); //중복허용X, 순서X (<=Collection과 차이점) 같은 데이터 여러번 집어넣더라도 메모리에는 하나만 잡힘
		set.add("기린");
		set.add("코끼리");
		
		Iterator it = set.iterator(); //생성
		while(it.hasNext()) {  //it.hasNext() --항목있냐/없냐(T/F)
			System.out.println(it.next()); //it.next() --현재 위치의 항목을 꺼내고 다음으로 이동
		}
	}

}
