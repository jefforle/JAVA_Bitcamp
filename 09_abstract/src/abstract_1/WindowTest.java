package abstract_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame{
	public WindowTest(){
		setBounds(700, 200, 300, 400);
		setVisible(true); 
	}
	
	@Override
	public void paint(Graphics g) {//paint는 콜백메소드
		Toolkit t = Toolkit.getDefaultToolkit(); //new한것과 동일! Toolkit클래스가 abstract클래스라 new로 생성 불가능..자식클래스도 없음..=>메소드로 생성!
		Image img = t.getImage("2020.jpg"); //이미지 불러오기 (이미지파일은 src폴더 안에 넣으면 안됨)
		g.drawImage(img, 20, 100, this); //이미지 그리기
	}
	
	public static void main(String[] args) {
		new WindowTest();
	}

}
