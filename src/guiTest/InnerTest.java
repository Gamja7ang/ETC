package guiTest;

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
		add(label, "North");
		add(jtextfield, "South");
		setSize(300, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//이벤트 리스너를 등록
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

/*▶익명 클래스로 이벤트 처리 //이름이 없으므로 일회성
익명 클래스 : 이벤트 처리, 앱을 만들 때 익명 클래스를 사용
재사용성이 떨어지는 방식
클래스 내용 자체를 넣는것처럼 보인다.

▶Inner Class로 이벤트 처리방법
외부 클래스와 비슷하지만, 객체를 넘겨주는 부분을 처리할 수 있기 때문에 간편해진다.
내부 클래스는 단순히 외부의 클래스들을 가져다가 붙여넣는 것 뿐이다.
또, 객체 등을 넘겨주었던 부분이 더이상 필요해지지 않고 부모클래스에 선언되어 있던 전역객체를 그대로 사용할 수 있다.

Class MouseMotionTest extends MouseMotionAdapter{}
//Handler 호출 : new MouseMotionTest() 호출 예시
(익명)new MouseMotionAdapter(){클래스 안의 내용을 작성한다} //이름이 없음
*/