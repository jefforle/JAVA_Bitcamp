/* 1/13 (월) 1 */
package thread;

import java.io.IOException;
import java.util.Scanner;

public class ATMTest implements Runnable {
	private long depositMoney = 100000; //잔액
	private long balance; //찾을 금액
	
	@Override
	//public synchronized void run() { //동기화 O, 1번에 1스레드만 통과, mon이 들어와서 나갈때까지 son은 못들어오게
	public void run() {
			//synchronized(this) { //동기화 O
			synchronized(ATMTest.class) { //동기화 O, ATMTest를 한번에 하나씩만 들여보내겠다
			Scanner scan = new Scanner(System.in);
			System.out.println(Thread.currentThread().getName()+"님"); //현재 cpu안에 올라와있는 스레드의 이름만 꺼내와라
			
			try {
				System.out.print("찾을 금액:");
				balance = scan.nextLong();			
			}catch (NumberFormatException e) {
				e.printStackTrace();
			}
			withdraw(); 
		}
	}
	public void withdraw() {
		if(depositMoney>=balance) {
			if(balance%10000 == 0) {
				depositMoney = depositMoney - balance;
				System.out.println("잔액은 "+depositMoney+"입니다.");
			}else 
				System.out.println("만원단위로 입력하세요.");
		}else
			System.out.println("잔액 부족");
		
	}
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm, "엄마"); //mom과 son이 atm을 같이 물고가야 동기화가 일어남
		Thread son = new Thread(atm, "아들");
		//1개의 클래스 파일을 mom, son이 공유
//		Thread mom = new Thread(new ATMTest, "엄마"); //동기화의 의미가 없음, 각자의 주소(객체)가지고 있으므로
//		Thread son = new Thread(new ATMTest, "아들");
		System.out.println(atm);
		mom.start();
		son.start();
		
	}

}
