package report_0103;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

/* [숙제1]
 * 윈도우 창 위에 클릭한 좌표(x,y)를 찍어라
 * 생성자 말고 init()메소드 사용
 */

public class WindowTest extends JFrame implements MouseListener, MouseMotionListener {
	//Frame(awt)는 잔상이 안남고 계속 새로 만들어 부하가 많이 생기지만, 이를 해결한 JFrame(스윙)은 잔상이 남음 
	int x, y;
	
	public void init() {			
		setBounds(700, 200, 300, 400);
		setVisible(true); 

		//이벤트
		this.addMouseListener(this); 
		this.addMouseMotionListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(x+","+y, x, y);
	}

	//MouseListener Override - Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint(); //다시호출해라, update()먼저찾고, paint()순으로 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	//MouseMotionListener Override - Event Handler
	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new WindowTest().init();
	}

}
