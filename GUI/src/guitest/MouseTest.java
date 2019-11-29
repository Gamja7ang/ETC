package guitest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseTest extends javax.swing.JFrame {
	JLabel label = new JLabel("마우스 드래그");
	JTextField jtextfield = new JTextField();
	
	class MouseMotionTest extends MouseMotionAdapter{
		MouseTest superClass;

		@Override
		public void mouseDragged(MouseEvent e) {
			superClass.jtextfield.setText("("+e.getX()+","+e.getY()+")");
		}
		public MouseMotionTest(MouseTest superClass) {
		//인자로 받은 부모 객체를 전역변수에 저장한다.
			this.superClass =superClass;
		}
	}
	//MouseAdapter을 상속받아 mouseEntered,mouseExited를 
	//재정의 하는 클래스이다.
	//마우스 이동 상황을 텍스트필드에 쓰기위해서
	//부모의 주소를 생성자를 통해 받아 올수 있도록해야함.
	class MouseClass extends MouseAdapter{
		//부모객체 담을곳
		MouseTest superClass;

		@Override
		public void mouseEntered(MouseEvent e) {
			superClass.jtextfield.setText("안쪽");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			superClass.jtextfield.setText("바깥쪽");
		}
//인자로 받은 부모 객체를 전역변수에 저장한다.		
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
//이벤트리스너 등록하여 JFrame 객체주소를 함께 보낸다.
		this.addMouseMotionListener(new MouseMotionTest(this));
		this.addMouseListener(new MouseClass(this));
	}	
	public static void main(String[] args) {
		new MouseTest();
	}
}
