package guiTest;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.JFrame;

//awt 운영체제에 따라 느낌이 다르다, 시각적으로 다르게 느껴짐
//java.awt.*; Button, Frame, TextField etc.
//swing : 운영체제에서 동일한 느낌을 제공, look&fell
//javax.swing.* : JButton, JFrame, JTextField etc.
//화면 구성을 두가지를 섞어서 코딩을 한다.

//용어
// 1. Container : 한 개 이상의 Container 위에 Component를 올려질 영역
// Frame, Window, Panel,Dialog, Applet(현재 잘 사용 안함) etc.
//2. Component : 실제로 화면을 구성하는 요소들
// Button, TextField, TextArea, list etc.
//3. LayoutManager : Container 위에 Component들을 올릴 때 자리 배치 방법
//FlowLayout, BorderLayout, GridLayout, CardLayout etc.

//어떻게 코딩하면 되는가?
//상속을 받을 수 있으면 상속을 받아야 함(많이 사용하는 Component), op언어
//화면 생성은 프로그램 초기에 이루어져야 하므로, 주로 생성자에서 작업이 이루어진다.

//Container 위에 Component 추가방법
// Frame.add((Component component));
//크기지정 : setSize(width, height), setBounds(x, y, height, width)
//Container가 보이도록 해야함 : setVisible(Boolean b); 값은 only true/false

public class FrameExam {
	JFrame frame = new JFrame("Java Frame");
	Button button = new Button("CLICK");
	
	
	public void creatFrame() {
		frame.add(button);
		frame.setSize(300, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		FrameExam frameExam = new FrameExam();
		frameExam.creatFrame();
	}

}
