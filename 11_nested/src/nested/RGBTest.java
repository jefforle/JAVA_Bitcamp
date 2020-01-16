package nested;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//public class RGBTest extends Frame implements WindowListener{
public class RGBTest extends JFrame{
	private JButton redB, greenB, blueB;
	private DrCanvas can;
	
	public RGBTest() {
		//redB = new JButton("RED");
		redB = new JButton(new ImageIcon("q.gif"));
		//인터페이스여도 다른클래스가 대신 구현해줄게 대신구현해주는 클래스가 추상클래스면 익명클래스가 들어와야된고 아니면 new해서 생성해주면 됨
		greenB = new JButton("GREEN");
		blueB = new JButton("BLUE");
		
		can = new DrCanvas();
		
		Panel p = new Panel();
		p.add(redB);
		p.add(greenB);
		p.add(blueB);
		
		Container c = this.getContentPane();
		c.add("North", p);
		c.add("Center", can);
		
		setBounds(700, 200, 300, 300);
		setVisible(true);
		
//		addWindowListener(this); --1)리스너 implements 2)인터페이스의 모든 추상메소드 오버라이딩 3)이벤트처리 ex) this.addWindowListener(this);
		addWindowListener(new WindowAdapter() {//WindowAdapter는 추상클래스지만 추상 메소드가 하나도 없음, 선택적으로 오버라이딩해서 사용
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		redB.addActionListener(new ActionListener() { //ActionListener는 WindowListener처럼 Adapter가 없으니, 익명클래스로 new하여 사용
		//ActionListener는 인터페이스라 new가 안됨-> 익명클래스가 들어옴
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(255,0,0));
			}
		});
		greenB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,255,0));
			}
		});
		blueB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,0,255));
			}
		});
		
	}

	class DrCanvas extends Canvas{
		public DrCanvas() {
			this.setBackground(new Color(255,200,255));
		}
	}


//	@Override
//	public void windowActivated(WindowEvent e) {}
//
//	@Override
//	public void windowClosed(WindowEvent e) {}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {}
//
//	@Override
//	public void windowIconified(WindowEvent e) {}
//
//	@Override
//	public void windowOpened(WindowEvent e) {}

	public static void main(String[] args) {
		new RGBTest();
		
	}
}
