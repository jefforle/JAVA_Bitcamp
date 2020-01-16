package thread;

public class RoseTest extends Thread {
	private String name;
	
	public RoseTest(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			//스레드는 순차적이 아니라 번갈아 가면서 수행, 다만 어디까지 수행하는지 기억해야 함
			System.out.println(name+"\t"+Thread.currentThread()+"\t i="+i); //currentThread(): 현재 CPU안에 들어온 프로세스
		}
		System.out.println(name+"종료\n");
		
	}
	
	public static void main(String[] args) {
		RoseTest aa = new RoseTest("장미"); //객체 3개 생성 => 스레드 생성
		RoseTest bb = new RoseTest("메리골드"); //스레드 생성
		RoseTest cc = new RoseTest("무궁화"); //스레드 생성
		
		//이름바꾸기
		aa.setName("장미");
		bb.setName("메리골드");
		cc.setName("무궁화");
		
		//우선순위1~10, default는 5
//		aa.setPriority(MAX_PRIORITY);//:10, 제일먼저 마무리시키고 싶다(10이 높음) but 믿지마 운영체제가 더 높음
//		bb.setPriority(5);
//		cc.setPriority(1);
		
		
		//실행 가능한 상태로 만들어 줌
		aa.start(); //스레드 시작 - 스레드 실행(운영체제에 의해)
		try {
			aa.join(); //해당 쓰레드가 끝날때까지 다른쓰레드는 기다려라 (해당스레드가 멈출때까지 기다려라)	
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		bb.start(); //스레드 시작 - 스레드 실행(운영체제에 의해)
		cc.start(); //스레드 시작 - 스레드 실행(운영체제에 의해)
	}

}