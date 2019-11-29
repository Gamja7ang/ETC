package guitest;

import java.awt.Button;
import java.awt.Frame;
import javax.swing.JFrame;

/*awt �ü���� ���� ������ �ٸ���.
java.awt.*
ex:Button, Frame, TextField....

swing: �ü������ ������ ������ ����:look&feel
javax.swing.*
ex:JButton, JFrame, JTextField....
ȭ�� ������ �� ������ ��� �ڵ� �մϴ�.

���
1) Container : �� �� �̻��� Container���� Component�� ������ ����
ex:Frame, Window, Panel, Dialog, Applet
2)Component : ������ ȭ���� �����ϴ� ��ҵ�..
ex:Button, TextField, TextArea, List,..
3)LayoutManager: Container ���� Component���� �ø� �� �ڸ� ��ġ ���
ex:FlowLayout, BorderLayout, GridLayout, CardLayout,

��� �ڵ��ϸ�Ǵ°�?
����� ���� ���� ���� ����ϴ� ��Ҹ� ��� �޾� ����Ѵ�.
ȭ�� ������ ���α׷� �ʱ⿡ �̷�������ϹǷ� �ַ� �����ڿ��� �۾��� �̷������.

1)Container���� Component �߰����
������.add(Component component);
2)ũ������
������.setBounds(x,y,width, height)
3)Container ���̱�
������.setVisible(Boolean b);

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
