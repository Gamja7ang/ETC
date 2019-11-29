package guitest;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseEventTest extends javax.swing.JFrame implements MouseListener, MouseMotionListener {
	JLabel label = new JLabel("마우스 드래그");
	JTextField jTextfield = new JTextField();
	
	public MouseEventTest() {
		this.add(label, "North");
		this.add(jTextfield,"South");
		
		this.setSize(300, 400);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//이벤트 리스너 추가
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		jTextfield.setText("("+e.getX()+","+e.getY()+")");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스 위에 있으면 안쪽 메시지 출력
		jTextfield.setText("마우스 안쪽");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스 위에 있으면 바깥쪽 메시지 출력
		jTextfield.setText("마우스 바깥쪽");
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
