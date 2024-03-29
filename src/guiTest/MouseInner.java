package guiTest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseInner extends javax.swing.JFrame {
	JLabel label = new JLabel("마우스 드래그");
	JTextField jtextfield = new JTextField();
	
	public MouseInner() {
		add(label, "North");
		add(jtextfield, "South");
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addMouseMotionListener(new MouseMotionClass()); 
		this.addMouseListener(new MouseClass());
		
			
	}
	
	

	public static void main(String[] args) {
		new MouseInner();

	}
	
	//Inner Class
	class MouseMotionClass extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			jtextfield.setText("("+e.getX()+","+e.getY()+")");
		}
	}
	
	//Inner Class
	class MouseClass extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) { //앞에MouseInner.this가 생략된 것으로 볼 수 있다.
			(MouseInner.this).jtextfield.setText("안쪽");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			jtextfield.setText("바깥쪽");
		}
	}
	

}
