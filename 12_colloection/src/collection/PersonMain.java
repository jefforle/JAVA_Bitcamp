package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonMain {
//	String name;
	static Map<String,Integer> map = new HashMap<String, Integer>();
	
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("hong", 25);
		PersonDTO bb = new PersonDTO("lee", 18);
		PersonDTO cc = new PersonDTO("park", 30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa); //list에 aa를 담아라, aa의 주소가 담김
		list.add(bb);
		list.add(cc);
		
		return list; //데이터를 넘겨주는것이 아니라 주소를 넘겨줌!!
	}
	public static void main(String[] args) {
		
		PersonMain pm = new PersonMain();
		ArrayList<PersonDTO> list = pm.init(); //주소가 넘어옴
			
		for(int i=0; i<list.size(); i++) {
			System.out.println("이름:"+list.get(i).getName()+ " 나이:"+list.get(i).getAge());
			//System.out.println(list.get(i)); --주소가 출력됨
		}
		System.out.println("---------------------");
		
		for(PersonDTO dto : list) {
			//System.out.println("이름:"+dto.getName()+ " 나이:"+dto.getAge());
			System.out.println(dto); //PersonDTO에서 toString 오버라이딩
		}
		System.out.println("---------------------");
		
		Iterator<PersonDTO> it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
