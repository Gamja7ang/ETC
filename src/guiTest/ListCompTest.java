package guiTest;

import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.JFrame;

public class ListCompTest extends JFrame{

	private static final long serialVersionUID = 1L;
	
	String ch_item[] = {"��", "ȭ", "��", "��", "��", "��", "��" };
	List list = new List(4, true); //4���� ��, multi choice ����
	TextArea text = new TextArea(5, 20); //5��, 20��
	
	public ListCompTest() {
		super("JComboBox");
		
		//Layout ���� (flowLayout)
		setLayout(new FlowLayout());
		
		//List�� �׸� �߰�
		for(String str : ch_item)
			list.add(str);
		
		//Frame �߰�
		super.add(list);
		super.add(text);
		
		//ũ�� ����
		setSize(400, 300);
		
		//�����ֱ�
		setVisible(true);
		
		//X ��ư Ŭ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new ListCompTest();
	}

}
