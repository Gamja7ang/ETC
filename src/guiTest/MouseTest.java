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
	JLabel label = new JLabel("마우스 드래그");
	JTextField jtextfield = new JTextField();
	
	class MouseMotionTest extends MouseMotionAdapter{
		MouseTest superClass; //전역변수로 선언

		@Override
		public void mouseDragged(MouseEvent e) {
			superClass.jtextfield.setText("("+e.getX()+","+e.getY()+")"); //getX(), getY() : 마우스가 있는 좌표값
		}
		
		public MouseMotionTest(MouseTest superClass) {
			//인자로 받은 부모 객체 전역변수에 저장한다
			this.superClass = superClass;
		}
		
	}

		//MouseAdapter를 상속받아 mouseExited, mouseEntered  재정의 하는 클래스
		//Adapter를 상속받아 Event를 처리함
		//마우스의 이동 상황을 TextField에 쓰기 위해서 부모의 주소를 생성자를 통해 받아올 수 있도록 해야함.
	class MouseClass extends MouseAdapter{ 
		//implement MouseMotionListener, MouseListener 는 interface이기 때문에 모든 것을 Override 해주어야 하지만,
		// MouseAdapter와 MouseMotionAdapter는 클래스기 때문에 원하는 것만 Override 해 줄 수 있음
		MouseTest superClass; //전역변수 선언, 부모클래스

		@Override
		public void mouseEntered(MouseEvent e) { //마우스가 창의 안쪽에 있는 것을 텍스트로 표시(마우스 이동)
			superClass.jtextfield.setText("안쪽");
		}

		@Override
		public void mouseExited(MouseEvent e) { //마우스가 창의 바깥쪽에 있는 것을 텍스트로 표시(마우스 이동)
			superClass.jtextfield.setText("바깥쪽");
		}
		
		public MouseClass(MouseTest superClass) { //괄호안에 부모객체 담을 곳 지정
			this.superClass = superClass; // 인자로 받은 부모객체 전역변수에 저장
		}
		
		
	}
	
	
	public MouseTest() {
		add(label, "North");
		add(jtextfield, "South");
		setSize(300, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트 리스너 등록하여 JFrame 객체 주소를 함께 보낸다.
		this.addMouseMotionListener(new MouseMotionTest(this));
		this.addMouseListener(new MouseClass(this));
	}
	
	

	public static void main(String[] args) {
		new MouseTest();

	}

}
