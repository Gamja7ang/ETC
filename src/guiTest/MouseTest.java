package guiTest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseTest extends javax.swing.JFrame {
	JLabel label = new JLabel("���콺 �巡��");
	JTextField jtextfield = new JTextField();
	
	class MouseMotionTest extends MouseMotionAdapter{
		MouseTest superClass; //���������� ����

		@Override
		public void mouseDragged(MouseEvent e) {
			superClass.jtextfield.setText("("+e.getX()+","+e.getY()+")"); //getX(), getY() : ���콺�� �ִ� ��ǥ��
		}
		
		public MouseMotionTest(MouseTest superClass) {
			//���ڷ� ���� �θ� ��ü ���������� �����Ѵ�
			this.superClass = superClass;
		}
		
	}

		//MouseAdapter�� ��ӹ޾� mouseExited, mouseEntered  ������ �ϴ� Ŭ����
		//Adapter�� ��ӹ޾� Event�� ó����
		//���콺�� �̵� ��Ȳ�� TextField�� ���� ���ؼ� �θ��� �ּҸ� �����ڸ� ���� �޾ƿ� �� �ֵ��� �ؾ���.
	class MouseClass extends MouseAdapter{ 
		//implement MouseMotionListener, MouseListener �� interface�̱� ������ ��� ���� Override ���־�� ������,
		// MouseAdapter�� MouseMotionAdapter�� Ŭ������ ������ ���ϴ� �͸� Override �� �� �� ����
		MouseTest superClass; //�������� ����, �θ�Ŭ����

		@Override
		public void mouseEntered(MouseEvent e) { //���콺�� â�� ���ʿ� �ִ� ���� �ؽ�Ʈ�� ǥ��(���콺 �̵�)
			superClass.jtextfield.setText("����");
		}

		@Override
		public void mouseExited(MouseEvent e) { //���콺�� â�� �ٱ��ʿ� �ִ� ���� �ؽ�Ʈ�� ǥ��(���콺 �̵�)
			superClass.jtextfield.setText("�ٱ���");
		}
		
		public MouseClass(MouseTest superClass) { //��ȣ�ȿ� �θ�ü ���� �� ����
			this.superClass = superClass; // ���ڷ� ���� �θ�ü ���������� ����
		}
		
		
	}
	
	
	public MouseTest() {
		add(label, "North");
		add(jtextfield, "South");
		setSize(300, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�̺�Ʈ ������ ����Ͽ� JFrame ��ü �ּҸ� �Բ� ������.
		this.addMouseMotionListener(new MouseMotionTest(this));
		this.addMouseListener(new MouseClass(this));
	}
	
	

	public static void main(String[] args) {
		new MouseTest();

	}

}
