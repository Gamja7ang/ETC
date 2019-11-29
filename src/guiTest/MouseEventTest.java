package guiTest;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseEventTest extends javax.swing.JFrame implements MouseMotionListener, MouseListener {
	JLabel label = new JLabel("���콺 �巡��");
	JTextField jTextField = new JTextField();
	
	public MouseEventTest() {
		this.add(label, "North");
		this.add(jTextField, "South");
		
		this.setSize(300, 400);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�̺�Ʈ ������ �߰�
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		jTextField.setText("(" + e.getX() + "," + e.getY() + ")"); //getX(), getY() : ���콺�� �ִ� ��ǥ��
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		//���콺 ���� ������ ���� �޼��� ���
		jTextField.setText("���콺 ����");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//���콺 ���� ������ �ٱ��� �޼��� ���
		jTextField.setText("���콺 �ٱ���");
	}

	@Override
	public void mousePressed(MouseEvent e) { }

	@Override
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseMoved(MouseEvent e) { }
	
	@Override
	public void mouseClicked(MouseEvent arg0) { }
	
	
	public static void main(String[] args) {
		new MouseEventTest();
		
	}

}
