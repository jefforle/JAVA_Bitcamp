package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar);   
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("---------------------");
		
	//객체 나이순 정렬(오름차순)
		PersonDTO aa = new PersonDTO("hong", 25);
		PersonDTO bb = new PersonDTO("lee", 18);
		PersonDTO cc = new PersonDTO("park", 30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa); //list에 aa를 담아라, aa의 주소가 담김
		list.add(bb);
		list.add(cc);
		System.out.println("정렬 전AA="+list); //toString에 의해 주소가 아니라 데이터 출력
		Collections.sort(list);
		System.out.println("정렬 후AA="+list);
		
		System.out.println("---------------------");
		
	//정렬기준을 이름으로 새롭게 변경
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {//익명클래스. 여기서 new는 Comparator를 new하는게 아니라 익명클래스를 new하는 것임
			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) {
			//오름차순 
				//return dto1.getName().compareTo(dto2.getName()); 
				//String은 Compare클래스를 들고있기떄문에 compareTo를 언제든 쓸수있음
				
			//내림차순
				//return dto2.getName().compareTo(dto1.getName());
				return dto1.getName().compareTo(dto2.getName()) * -1;
			}
		};
		
		System.out.println("이름으로 새롭게 변경");
		Collections.sort(list, com);
		System.out.println(list);
		
	}
	

}
