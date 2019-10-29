package guiTest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CompositeLayout {
	JFrame jFrame = new JFrame(); //��ü���� ������
	JPanel jPanel = new JPanel(); //��ܿ� ��ġ�� �г�
	JButton [] btn = new JButton[4];
	
	public CompositeLayout() {
		//��ư ����
		for(int i = 0; i<btn.length; i++) {
			btn[i] = new JButton(i+"��° ��ư");
			
		}
		
		//�гο� ��ư �߰�
		jPanel.add(btn[0]);
		jPanel.add(btn[1]);
		
		jFrame.add(jPanel, "North");
		jFrame.add(btn[2], "West");
		jFrame.add(btn[3], "Center");
		
		//������ �� ������ ������ â�ݱ�
		jFrame.setSize(200, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CompositeLayout();
	}

}
