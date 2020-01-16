package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame{
	
	public WindowTest() {
		super("내가만든 윈도우"); //부모생상자 호출
		
		setForeground(Color.BLUE);
		//setBackground(Color.CYAN); //배경색을 주겠다, Color.~안해주면 this.~에서(내클래스에서) 찾음
		setBackground(new Color(55,75,150));
		//this.setSize(300, 400);
		setBounds(700, 200, 300, 400);
		setVisible(true); //많이 쓰임	
	}
	
	@Override
	public void paint(Graphics g) { //CallBack 콜백메소드(일정 시점이되면 JVM에 의해서 호출), 내가 만든메소드를 자바가 호출
									//repaint
		g.drawLine(30, 200, 250, 50);
		g.drawLine(250, 200, 30, 50);
		g.drawRect(10, 10, 150, 150);
		g.drawOval(150, 20, 30, 40);
	}

	public static void main(String[] args) {
		new WindowTest(); //1회용, 한번만 쓰고 사라짐
	}

}
