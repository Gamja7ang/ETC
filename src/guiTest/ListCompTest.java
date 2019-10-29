package guiTest;

import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.JFrame;

public class ListCompTest extends JFrame{

	private static final long serialVersionUID = 1L;
	
	String ch_item[] = {"월", "화", "수", "목", "금", "토", "일" };
	List list = new List(4, true); //4개의 행, multi choice 가능
	TextArea text = new TextArea(5, 20); //5행, 20열
	
	public ListCompTest() {
		super("JComboBox");
		
		//Layout 설정 (flowLayout)
		setLayout(new FlowLayout());
		
		//List의 항목 추가
		for(String str : ch_item)
			list.add(str);
		
		//Frame 추가
		super.add(list);
		super.add(text);
		
		//크기 지정
		setSize(400, 300);
		
		//보여주기
		setVisible(true);
		
		//X 버튼 클릭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new ListCompTest();
	}

}
