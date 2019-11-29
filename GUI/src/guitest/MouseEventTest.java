package guitest;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseEventTest extends javax.swing.JFrame implements MouseListener, MouseMotionListener {
	JLabel label = new JLabel("���콺 �巡��");
	JTextField jTextfield = new JTextField();
	
	public MouseEventTest() {
		this.add(label, "North");
		this.add(jTextfield,"South");
		
		this.setSize(300, 400);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�̺�Ʈ ������ �߰�
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		jTextfield.setText("("+e.getX()+","+e.getY()+")");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		//���콺 ���� ������ ���� �޽��� ���
		jTextfield.setText("���콺 ����");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// ���콺 ���� ������ �ٱ��� �޽��� ���
		jTextfield.setText("���콺 �ٱ���");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {}
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}

	public static void main(String[] args) {
		new MouseEventTest();
	}

}
