package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Frame implements Runnable{ //implements의 의미는 Runnable의 모든 추상메소드를 재구현해야한다!(인터페이스는 짝퉁)
	
	public Clock() {
		setFont(new Font("돋움체", Font.BOLD, 30));
		setForeground(Color.RED);
		setBounds(700, 200, 300, 100);
		setVisible(true);
		
		//나한테서 WindowListener가 발생하는데 WindowAdapter는 추상클래스라 new할 수 없어서 익명클래스가 필요함, 
		//WindowAdapter는 추상클래스지만 추상메소드가 없음 때문에, 오버라이딩 해도되고 안해도 되고 선택적으로 오버라이딩
		this.addWindowListener(new WindowAdapter() { //종료
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//스레드 생성
		Thread t = new Thread(this); //나를 스레드로 만들어 주세요 
		//스레드 시작
		t.start(); //run() 실행
		
	}
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH시 mm분 ss초");
		Date date = new Date();
		g.drawString(simpleDateFormat.format(date), 40, 80);
		//g.drawString(date+"", 60,60);
		
	}
	
	@Override
	public void run() {
		while(true) {
			repaint(); //paint다시 실행, 지우고 다시그리고
			try {
				Thread.sleep(1000);//1초, 대기시간을 줘라
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

	public static void main(String[] args) {
		new Clock();

	}


}
