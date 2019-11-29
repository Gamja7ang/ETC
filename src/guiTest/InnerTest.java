package guiTest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InnerTest extends javax.swing.JFrame {
	JLabel label = new JLabel("���콺 �巡��");
	JTextField jtextfield = new JTextField();
	
	public InnerTest() {
		add(label, "North");
		add(jtextfield, "South");
		setSize(300, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�̺�Ʈ �����ʸ� ���
		this.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				jtextfield.setText("("+e.getX()+","+e.getY()+")");
			}
			
		});
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				jtextfield.setText("����");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				jtextfield.setText("�ٱ���");
			}
			
		});
	}

	public static void main(String[] args) {
		new InnerTest();

	}

}

/*���͸� Ŭ������ �̺�Ʈ ó�� //�̸��� �����Ƿ� ��ȸ��
�͸� Ŭ���� : �̺�Ʈ ó��, ���� ���� �� �͸� Ŭ������ ���
���뼺�� �������� ���
Ŭ���� ���� ��ü�� �ִ°�ó�� ���δ�.

��Inner Class�� �̺�Ʈ ó�����
�ܺ� Ŭ������ ���������, ��ü�� �Ѱ��ִ� �κ��� ó���� �� �ֱ� ������ ����������.
���� Ŭ������ �ܼ��� �ܺ��� Ŭ�������� �����ٰ� �ٿ��ִ� �� ���̴�.
��, ��ü ���� �Ѱ��־��� �κ��� ���̻� �ʿ������� �ʰ� �θ�Ŭ������ ����Ǿ� �ִ� ������ü�� �״�� ����� �� �ִ�.

Class MouseMotionTest extends MouseMotionAdapter{}
//Handler ȣ�� : new MouseMotionTest() ȣ�� ����
(�͸�)new MouseMotionAdapter(){Ŭ���� ���� ������ �ۼ��Ѵ�} //�̸��� ����
*/