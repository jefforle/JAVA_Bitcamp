/* 1/6(월) 6 */
package nested;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Card {
	private Frame frame;
	private CardLayout card; //Panel이 쌓여있는것
	
	public Card() {
		frame = new Frame();
		card = new CardLayout();
		frame.setLayout(card);
		
		String[] title = {"RED", "GREEN", "BLUE", "YELLOW", "PUPLE", "SKY"};
		Color[] color = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.MAGENTA, Color.CYAN};
		Panel[] p=new Panel[6];
		for(int i=0; i<p.length; i++) {
			p[i] = new Panel();
			p[i].setBackground(color[i]);
			
			frame.add(p[i], title[i]);
			
			//이벤트
			p[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					card.next(frame);
					card.show(frame, "SKY");//"SKY"인 이름의 frame으로 건너뛰어라
				}
			});
		}
		
		frame.setBounds(700, 200, 300, 300); //Frame을 상속받은게 아니라서 this.setBounds가 아니라 frame.setBounds
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {//WindowAdapter는 추상클래스라 오버라이딩해서 써라 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Card();
		
	}

}
