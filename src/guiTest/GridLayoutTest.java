package guiTest;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {
	JFrame jFrame = new JFrame("GridLayout");
	JButton [] btn = new JButton[6];
	
	public GridLayoutTest() {
		//GridLayout 적용
		jFrame.setLayout(new GridLayout(3,2));
		//Container 가져오기
		Container container = jFrame.getContentPane();
		//Component 생성한 후 추가하기
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i+"번째 버튼"); //Button 타입에는 String이 들어가야 함
			container.add(btn[i]);
		}
		//Frame 크기 지정
		jFrame.setSize(300, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new GridLayoutTest();
	}

}
