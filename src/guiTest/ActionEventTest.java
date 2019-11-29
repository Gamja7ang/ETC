package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventTest extends javax.swing.JFrame implements ActionListener {
//	JFrame jFrame = new JFrame("버튼 이벤트 처리");
	//버튼 생성
	JButton btn1 = new JButton("click1");
	JButton btn2 = new JButton("click2");
	//생성자
	 public ActionEventTest() {
		//레이아웃 설정
		this.setLayout(new FlowLayout());
		//버튼 추가
		this.add(btn1); this.add(btn2);
		//크기지정과 보이기 설정
		this.setSize(300, 200);
		this.setVisible(true);
		//이벤트 등록하기
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		//닫기버튼 클릭시 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//ActionListener 재정의
		if(arg0.getSource().equals(btn1)) {
			JOptionPane.showMessageDialog(this, "Button1");
		} else {
			JOptionPane.showMessageDialog(this, "Button2");
		}

	}

	public static void main(String[] args) {
		new ActionEventTest();

	}

}
