/* 1/13 (월) 2 */
package thread;

public class Synchronized extends Thread {
	private static int count;
	
	public static void main(String[] args) {
		Synchronized aa = new Synchronized(); //스레드 생성
		Synchronized bb = new Synchronized();
		Synchronized cc = new Synchronized();
		//각각의 주소값을 가짐, 같은 클래스파일
		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");
		aa.start();
		bb.start();
		cc.start();
	}
	
	//public synchronized void run() { --동기화 X, 1번에 1스레드가 와야되는데 동시에 들어옴..
	public void run() {
		//synchronized(this) { --동기화 X, aa,bb,cc의 주소의 값이 다 다름. 각자의 자원을 사용하고 있음 각자의 자원을 쓰는건 동기화의 의미가 없음
		synchronized(Synchronized.class) { //동기화 O, aa,bb,cc는 컴파일하면 같은  클래스파일을 가짐, 같은 클래스파일을 가진 것(Synchronized.class 이름의 파일을 가진것)끼리 동기화해라!
			for(int i=1; i<=5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName()+":"+count);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	
	}

}
