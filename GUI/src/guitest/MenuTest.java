package guitest;

import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
/*JMenuBar: JMenu�� �ø� Ʋ
JMenu: �������� ���� �� �����ϴ� ���
JMenuItem: JMenu�� add�ϰ�, JMenu�� JMenuBar�� add�Ѵ�.

�޴��� �޴����� �ڸ��� ���� �����ϰ�
Frame�� North�� ���� ���� �ƴϴ�.

JFrame.setMenuBar(JMenuBar);
*/
public class MenuTest {
	JFrame jFrame = new JFrame("menu ����");
	JTextArea textArea = new JTextArea("������ �Է��ϼ���",5,10);//��ũ�ѹ� ����
	JScrollPane jp = new JScrollPane(textArea);//��ũ�ѹ� �����
	
	//�޴� ����
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("����");
	JMenu helpMenu = new JMenu("Help");
	
	public MenuTest() {
		//���� �޴� ����
		fileMenu.add(new JMenuItem("�� ����"));
		fileMenu.getItem(0).setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_MASK^InputEvent.ALT_MASK));//����Ű����
		fileMenu.add(new JMenuItem("����"));
		fileMenu.add(new JMenuItem("����"));
		fileMenu.addSeparator(); //���м� �߰�
		fileMenu.add(new JMenuItem("����"));
		//���� �޴�����
		helpMenu.add(new JMenuItem("����"));
		helpMenu.add(new JMenuItem("����"));
		
		//�޴��� �޴��ٿ� ���
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		
		//�޴��ٸ� �߰�
		jFrame.setJMenuBar(menuBar);
		
		//�ؽ�Ʈ ���� �߰�
		jFrame.add(jp, "Center");
		
		//������ũ������ �� ������ ���̱�
		jFrame.setSize(300, 300);
		jFrame.setVisible(true);
		
		//'x'��ưŬ���� ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuTest();
	}
}