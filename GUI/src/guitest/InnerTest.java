package guitest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InnerTest extends javax.swing.JFrame {
	JLabel label = new JLabel("마우스 드래그");
	JTextField jtextfield = new JTextField();
	
	public InnerTest() {
		add(label,"North");
		add(jtextfield,"South");
		setSize(300, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		// 이벤트 리스너를 등록
		this.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				jtextfield.setText("("+e.getX()+","+e.getY()+")");
			}
		});
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				jtextfield.setText("안쪽");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jtextfield.setText("바깥쪽");
			}
			
		});
	}
	public static void main(String[] args) {
			new InnerTest();
	}

}
