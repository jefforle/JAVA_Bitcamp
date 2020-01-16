package swing;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class JListEx extends JFrame{
	public JListEx() {
		setLayout(new FlowLayout());
		String[] listData = {"hong", "lee", "park", "java", "jsp"};
		JList<String> list1 = new JList<String>(listData);
		list1.setSelectedIndex(1);
		
		//JList list2 = new JList(new DefaultListModel());
		//DefultListModel model = (DefaultListModel)list2.getModel();
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		JList<String> list2 = new JList<String>(model);
		model.addElement("apple");
		model.addElement("apple2");
		model.addElement("apple3");
		model.addElement("apple4");
		list2.setSelectedIndex(1);
		
		Vector<String> vListData = new Vector<String>();
		JList<String> list3 = new JList<String>(vListData);
		JScrollPane scroll = new JScrollPane(list3);
		vListData.add("soccer"); vListData.add("soccer");
		vListData.add("soccer2"); vListData.add("soccer");
		vListData.add("soccer3"); vListData.add("soccer");
		vListData.add("soccer4"); vListData.add("soccer");
		vListData.add("soccer4"); vListData.add("soccer");
		
		class Student{
			String id;
			String name;
			String department;
			public Student (String id, String name, String department) {
				this.id = id;
				this.name = name;
				this.department = department;	
			}
			public String toString() {
				return name;
			}
		}
		JList list4 = new JList(new DefaultListModel<String>());
		list4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListModel<Student> model2 = (DefaultListModel<Student>)list4.getModel();
		model2.addElement(new Student("100", "hong", "computer"));
		model2.addElement(new Student("200", "hong", "computer"));
		model2.addElement(new Student("300", "hong", "computer"));
		model2.addElement(new Student("400", "hong", "computer"));
		
		add(list1); 
		add(list2); 
		add(scroll); 
		add(list4); 

		setBounds(300, 300, 300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListEx();
	}

}
