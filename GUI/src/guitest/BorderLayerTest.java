package guitest;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayerTest extends JFrame {
	JFrame jframe = new JFrame("제목");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	
	public BorderLayerTest() {
//컴포넌트를 담을 컨테이너 구하기
		Container container = jframe.getContentPane();
		container.add(btn1, BorderLayout.NORTH);
		container.add(btn2, BorderLayout.EAST);
		container.add(btn3, BorderLayout.WEST);
		container.add(btn4, BorderLayout.SOUTH);
		container.add(btn5, BorderLayout.CENTER);
// 프레임 크기지정
		jframe.setSize(300, 300);
// 프레임 보이기 지정
		jframe.setVisible(true);
//종료버튼 설정
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BorderLayerTest();
	}
}
