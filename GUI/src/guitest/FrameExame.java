package guitest;

import java.awt.Button;
import java.awt.Frame;
import javax.swing.JFrame;

/*awt 운영체제에 따라 느낌이 다르다.
java.awt.*
ex:Button, Frame, TextField....

swing: 운영체제에서 동일한 느낌을 제공:look&feel
javax.swing.*
ex:JButton, JFrame, JTextField....
화면 구성을 두 가지를 섞어서 코딩 합니다.

용어
1) Container : 한 개 이상의 Container위에 Component에 오려질 영역
ex:Frame, Window, Panel, Dialog, Applet
2)Component : 실제로 화면을 구성하는 요소들..
ex:Button, TextField, TextArea, List,..
3)LayoutManager: Container 위에 Component들을 올린 때 자리 배치 방법
ex:FlowLayout, BorderLayout, GridLayout, CardLayout,

어떻게 코딩하면되는가?
상속을 받을 때는 많이 사용하는 요소를 상속 받아 사용한다.
화면 생성은 프로그램 초기에 이루어져야하므로 주로 생성자에서 작업이 이루어진다.

1)Container위에 Component 추가방법
프레임.add(Component component);
2)크기지정
프레임.setBounds(x,y,width, height)
3)Container 보이기
프레임.setVisible(Boolean b);

*/

public class FrameExame {
	JFrame frame = new JFrame("java frame");
	Button button = new Button("click");
	
	public void init() {
		frame.add(button);
		frame.setSize(300, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FrameExame frameExame = new FrameExame();
		frameExame.init();
	}
}
