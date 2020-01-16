/* 1/14 (화) 4-2 */
package io;

import java.awt.Event;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
//JFrame위에 버튼, 스크롤 등을 바로 올리지 말고 컨테이너나 패널을 만들어서 그위에 올리자
//JMenuBar는 독단적
public class MenuPane extends JMenuBar{
	private JMenu fileM, editM, viewM;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM;
	
	public MenuPane() {
		fileM = new JMenu("파일");
		editM = new JMenu("편집");
		viewM = new JMenu("보기");
		
		newM = new JMenuItem("새로만들기");
		openM = new JMenuItem("열기");
		saveM = new JMenuItem("저장");
		exitM = new JMenuItem("종료");
		cutM = new JMenuItem("잘라내기");
		copyM = new JMenuItem("복사");
		pasteM = new JMenuItem("붙여넣기");
		
		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveM);
		fileM.add(exitM);
		
		editM.add(cutM);
		editM.add(copyM);
		editM.add(pasteM);
		
		add(fileM);
		add(editM);
		add(viewM);
		
		//단축키 Alt+X, C, V
		cutM.setAccelerator(KeyStroke.getKeyStroke('X',Event.ALT_MASK));  
		copyM.setAccelerator(KeyStroke.getKeyStroke('C',Event.ALT_MASK));  
		pasteM.setAccelerator(KeyStroke.getKeyStroke('V',Event.ALT_MASK)); 
	
	}
	
	public JMenuItem getNewM() {
		return newM;
	}
	public JMenuItem getOpenM() {
		return openM;
	}
	public JMenuItem getSaveM() {
		return saveM;
	}
	public JMenuItem getExitM() {
		return exitM;
	}
	public JMenuItem getCutM() {
		return cutM;
	}
	public JMenuItem getCopyM() {
		return copyM;
	}
	public JMenuItem getPasteM() {
		return pasteM;
	}
	

}
