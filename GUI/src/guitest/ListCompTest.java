package guitest;

import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.JFrame;

public class ListCompTest extends JFrame {
	String ch_item[]= {"��","ȭ","��","��","��","��","��"};
	List list = new List(4,true);//4������ �������� ��Ƽ���̽� ����
	TextArea text = new TextArea(5,20);
	public ListCompTest() {
		super("JComboBox");
		//���̾ƿ� FlowLayout ����
		setLayout(new FlowLayout());
		//List�� �׸� �߰�
		for(String str:ch_item)
			list.add(str);
		// �߰�
		super.add(list);
		super.add(text);
		//ũ������
		setSize(400, 300);
		//������
		setVisible(true);
		//x ��ư Ŭ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ListCompTest();
	}
}
