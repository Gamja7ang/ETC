package guiTest;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseEventTest extends javax.swing.JFrame implements MouseMotionListener, MouseListener {
	JLabel label = new JLabel("마우스 드래그");
	JTextField jTextField = new JTextField();
	
	public MouseEventTest() {
		this.add(label, "North");
		this.add(jTextField, "South");
		
		this.setSize(300, 400);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트 리스너 추가
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		jTextField.setText("(" + e.getX() + "," + e.getY() + ")"); //getX(), getY() : 마우스가 있는 좌표값
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스 위에 있으면 안쪽 메세지 출력
		jTextField.setText("마우스 안쪽");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스 위에 있으면 바깥쪽 메세지 출력
		jTextField.setText("마우스 바깥쪽");
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
