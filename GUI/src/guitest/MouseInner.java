package guitest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseInner extends javax.swing.JFrame {
	JLabel label = new JLabel("���콺 �巡��");
	JTextField jtextfield = new JTextField();
	
	public MouseInner() {
		add(label,"North");
		add(jtextfield,"South");
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �̺�Ʈ �����ʸ� ����ϸ� JFrame ��ü�� �ּҸ� �Բ� ������.
		this.addMouseMotionListener(new MouseMotionClass());
		this.addMouseListener(new MouseClass());
	}
	public static void main(String[] args) {
		new MouseInner();
	}
	// Inner Class
		class MouseMotionClass extends MouseMotionAdapter
		{
			@Override
			public void mouseDragged(MouseEvent e)
			{
				jtextfield.setText("(" + e.getX() + ", " + e.getY() + ")");
			}
		}

		// Inner Class
		class MouseClass extends MouseAdapter
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				jtextfield.setText("����");
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				//�տ� MouseExam.this �� ������ ������ �� �� �ִ�.
				(MouseInner.this).jtextfield.setText("�ٱ���");
			}
		}
}
