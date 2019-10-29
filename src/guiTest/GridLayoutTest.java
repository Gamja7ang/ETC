package guiTest;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {
	JFrame jFrame = new JFrame("GridLayout");
	JButton [] btn = new JButton[6];
	
	public GridLayoutTest() {
		//GridLayout ����
		jFrame.setLayout(new GridLayout(3,2));
		//Container ��������
		Container container = jFrame.getContentPane();
		//Component ������ �� �߰��ϱ�
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i+"��° ��ư"); //Button Ÿ�Կ��� String�� ���� ��
			container.add(btn[i]);
		}
		//Frame ũ�� ����
		jFrame.setSize(300, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new GridLayoutTest();
	}

}
