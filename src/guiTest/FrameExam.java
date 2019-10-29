package guiTest;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.JFrame;

//awt �ü���� ���� ������ �ٸ���, �ð������� �ٸ��� ������
//java.awt.*; Button, Frame, TextField etc.
//swing : �ü������ ������ ������ ����, look&fell
//javax.swing.* : JButton, JFrame, JTextField etc.
//ȭ�� ������ �ΰ����� ��� �ڵ��� �Ѵ�.

//���
// 1. Container : �� �� �̻��� Container ���� Component�� �÷��� ����
// Frame, Window, Panel,Dialog, Applet(���� �� ��� ����) etc.
//2. Component : ������ ȭ���� �����ϴ� ��ҵ�
// Button, TextField, TextArea, list etc.
//3. LayoutManager : Container ���� Component���� �ø� �� �ڸ� ��ġ ���
//FlowLayout, BorderLayout, GridLayout, CardLayout etc.

//��� �ڵ��ϸ� �Ǵ°�?
//����� ���� �� ������ ����� �޾ƾ� ��(���� ����ϴ� Component), op���
//ȭ�� ������ ���α׷� �ʱ⿡ �̷������ �ϹǷ�, �ַ� �����ڿ��� �۾��� �̷������.

//Container ���� Component �߰����
// Frame.add((Component component));
//ũ������ : setSize(width, height), setBounds(x, y, height, width)
//Container�� ���̵��� �ؾ��� : setVisible(Boolean b); ���� only true/false

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
