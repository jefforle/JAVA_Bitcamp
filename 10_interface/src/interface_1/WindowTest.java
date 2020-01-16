package interface_1;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WindowTest extends Frame implements MouseListener, MouseMotionListener {
	//Frame, MouseListener, MouseMotionListener를 모두 사용할 수 있을것 같지만
	//Frame은 상속받아서 다 사용할 수 있지만, MouseListener, MouseMotionListener은 메소드를 재구현해서 사용해야함
	//==> 제일 중요한 클래스를 상속(extends)받고
	public WindowTest(){
		setTitle("내가 만든 윈도우");
		setBounds(700, 200, 300, 400);
		setVisible(true); 
		
		//이벤트
		this.addMouseListener(this); //JVM아 기다리고 있다가 이벤트가 발생하면 addMouseListener를 실행해라 //this:내클래스를 가르킴
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit()); //모든addWindowListener의 구현부는 WindowExit가 가지고 있어요
	}

	public static void main(String[] args) {
		new WindowTest();
	}

	//MouseListener Override - Event Handler
	@Override
	public void mouseClicked(MouseEvent e) { //콜백메소드: 기다리고 있다가 클릭할때 JVM에 의해서 수행
		System.out.println("마우스 클릭");	
		System.out.println("X="+e.getX()+"\t Y:"+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 IN");	
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 OUT");	
		
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
		System.out.println("마우스 DRAG");			
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
