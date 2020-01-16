package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel {
	Object[][] data = { {"nari", "AA", new Integer(1234), "친구"},
						{"hong", "BB", new Integer(1234), "안녕"},
						{"gil", "CC", new Integer(1234), "선배"},
						{"dong", "AA", new Integer(1234), "친구2"}};
	
	String[] name = {"이름", "아이디", "비밀번호", "구분"}; //필드명 들

	@Override
	public int getColumnCount() { //테이블의 열의 수[필수]
		return name.length;
	}

	@Override
	public int getRowCount() { //테이블의 행의 수[필수]
		return data.length;
	}

	@Override
	public Object getValueAt(int r, int c) { //실제 데이터 추출[필수]
		return data[r][c];
	}
	@Override
	public boolean isCellEditable(int r, int c) { //편집가능하도록
		return (c!=0) ? true : false;
	}
	@Override
	public String getColumnName(int c) { //테이블 타이틀명 부여
		return name[c];
	} 
	@Override
	public void setValueAt(Object obj, int r, int c) { //필드값 변경
		data[r][c] = obj;
	}

}

public class JTableEx extends JFrame{
	JTable table;
	JTableModel model; //사용자 모델정의 클래스
	
	public JTableEx() {
		model = new JTableModel();
		table = new JTable(model);
		add(new JScrollPane(table)); //스크롤바 생성하면서
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonEx();
	}
}