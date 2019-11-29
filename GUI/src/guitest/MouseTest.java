package guitest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseTest extends javax.swing.JFrame {
	JLabel label = new JLabel("���콺 �巡��");
	JTextField jtextfield = new JTextField();
	
	class MouseMotionTest extends MouseMotionAdapter{
		MouseTest superClass;

		@Override
		public void mouseDragged(MouseEvent e) {
			superClass.jtextfield.setText("("+e.getX()+","+e.getY()+")");
		}
		public MouseMotionTest(MouseTest superClass) {
		//���ڷ� ���� �θ� ��ü�� ���������� �����Ѵ�.
			this.superClass =superClass;
		}
	}
	//MouseAdapter�� ��ӹ޾� mouseEntered,mouseExited�� 
	//������ �ϴ� Ŭ�����̴�.
	//���콺 �̵� ��Ȳ�� �ؽ�Ʈ�ʵ忡 �������ؼ�
	//�θ��� �ּҸ� �����ڸ� ���� �޾� �ü� �ֵ����ؾ���.
	class MouseClass extends MouseAdapter{
		//�θ�ü ������
		MouseTest superClass;

		@Override
		public void mouseEntered(MouseEvent e) {
			superClass.jtextfield.setText("����");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			superClass.jtextfield.setText("�ٱ���");
		}
//���ڷ� ���� �θ� ��ü�� ���������� �����Ѵ�.		
		public MouseClass(MouseTest superClass) {
			this.superClass = superClass;
		}
	}
	
	public MouseTest() {
		add(label,"North");
		add(jtextfield, "South");
		setSize(300, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
//�̺�Ʈ������ ����Ͽ� JFrame ��ü�ּҸ� �Բ� ������.
		this.addMouseMotionListener(new MouseMotionTest(this));
		this.addMouseListener(new MouseClass(this));
	}	
	public static void main(String[] args) {
		new MouseTest();
	}
}
