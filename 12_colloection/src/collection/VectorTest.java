package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터크기=" + v.size()); //0
		System.out.println("벡터크기=" + v.capacity()); //기본용량 10개, 10개씩 증가
		System.out.println();
		
		System.out.println("항목추가");
		for(int i=1; i<=10; i++) {
			v.add(i+""); //i를 String 타입으로 형변환
		}
		System.out.println("벡터 크기=" + v.size()); //10
		System.out.println("벡터 용량=" + v.capacity()); //10
		System.out.println();

		v.addElement(5+"");  //중복허용, 순서
		System.out.println("벡터 크기=" + v.size()); //11
		System.out.println("벡터 용량=" + v.capacity()); //12
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"  ");
		}
		System.out.println();
		
		//v.remove("5"); //앞쪽 5가 제거됨
		v.remove(10); //index값으로 뒤쪽 5제거 
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		
		Vector<String> v2 = new Vector<String>(5,2);
		
		
	}

}
