package report_0103;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*[문제2] 
 */

//Frame - BorderLayout
public class ImageMove extends Frame implements  ActionListener {
	/**
	 * <font style="color:red;">API문서 만들때 설명 </font>
	 */
	private Button resetB, left, up, down, right; 
	private int x=100, y=100;
	
	public void init() {
		resetB = new Button("RESET"); //버튼생성
		left = new Button("left");
		up = new Button("up");
		down = new Button("아래");
		right = new Button("오른쪽"); //버튼은 물같아서 어디에 잡히냐에 따라 모양이 달라짐
		
		Panel p = new Panel(); //Panel은 FlowLayout(올라온 순서대로 배치-가운데 기준으로)
		p.add(resetB); //버튼을 쟁반(패널)위에 올리고
		p.add(left);
		p.add(up);
		p.add(down);
		p.add(right);
		
		this.add("North", p);
		
		setTitle("이미지 이동");
		setBounds(700, 200, 500, 500);
		setVisible(true); 
		
		//이벤트
		resetB.addActionListener(this); //resetB 안에서 ActionListener이벤트가 발생하면 
		left.addActionListener(this); 
		up.addActionListener(this); 
		down.addActionListener(this); 
		right.addActionListener(this); 
	}
	
	@Override
	public void paint(Graphics g) { 
		Toolkit t = Toolkit.getDefaultToolkit(); 
		Image img = t.getImage("2020.jpg"); 
		//=> Image img = Toolkit.getDefaultToolkit().getImage("2020.jpg"); 
		g.drawImage(img, x, y, this); 
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(x<-180) x=500;
		if(x>500) x=-180;
		if(y<-149) y=500;
		if(y>500) y=-149;
		repaint();
		
		if(e.getSource()==resetB) {
			x=100; y=100;
			repaint();
		}
		else if(e.getSource()==left) {
			x-=10;
			repaint();
		}
		else if(e.getSource()==up) {
			y-=10;
			repaint();
		}
		else if(e.getSource()==down) {
			y+=10;
			repaint();
		}
		else if(e.getSource()==right) {
			x+=10;
			repaint();
		}
		
	}

	public static void main(String[] args) {
		new ImageMove().init();
	
	}


}
