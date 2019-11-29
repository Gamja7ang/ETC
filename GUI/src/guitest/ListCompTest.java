package guitest;

import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.JFrame;

public class ListCompTest extends JFrame {
	String ch_item[]= {"월","화","수","목","금","토","일"};
	List list = new List(4,true);//4행으로 보여지고 멀티초이스 가능
	TextArea text = new TextArea(5,20);
	public ListCompTest() {
		super("JComboBox");
		//레이아웃 FlowLayout 설정
		setLayout(new FlowLayout());
		//List에 항목 추가
		for(String str:ch_item)
			list.add(str);
		// 추가
		super.add(list);
		super.add(text);
		//크기지정
		setSize(400, 300);
		//보여줘
		setVisible(true);
		//x 버튼 클릭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ListCompTest();
	}
}
