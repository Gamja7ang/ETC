package guitest;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayerTest extends JFrame {
	JFrame jframe = new JFrame("����");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	
	public BorderLayerTest() {
//������Ʈ�� ���� �����̳� ���ϱ�
		Container container = jframe.getContentPane();
		container.add(btn1, BorderLayout.NORTH);
		container.add(btn2, BorderLayout.EAST);
		container.add(btn3, BorderLayout.WEST);
		container.add(btn4, BorderLayout.SOUTH);
		container.add(btn5, BorderLayout.CENTER);
// ������ ũ������
		jframe.setSize(300, 300);
// ������ ���̱� ����
		jframe.setVisible(true);
//�����ư ����
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BorderLayerTest();
	}
}
