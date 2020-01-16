package collection;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueTest {
	public static void main(String[] args) {
		String[] item = {"아우디", "벤틀리", "제규어"};
		LinkedList<String> q = new LinkedList<String>();
		
		for(String n : item)
			q.offer(n); //요소추가
		
		out.println("q의 크기:"+q.size()+"\n");
		String data="";
		
		while( (data = q.poll()) != null) {
			out.println(data+"삭제!");
			out.println("q의 크기:"+q.size()+"\n");
		}
	}
		

}