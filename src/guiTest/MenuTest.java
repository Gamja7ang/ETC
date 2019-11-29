package guiTest;

import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class MenuTest {
	JFrame jframe = new JFrame("menu ����");
	JTextArea textArea = new JTextArea("������ �Է��ϼ���", 5, 10); //Scroll bar ����
	JScrollPane jp = new JScrollPane(textArea); //Make Scroll bar
	
	//Menu ����
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("FIle");
	JMenu helpMenu = new JMenu("HELP");
	
	public MenuTest() {
		//���� �޴� ����
		fileMenu.add(new JMenuItem("������"));
		fileMenu.getItem(0).setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK^InputEvent.ALT_MASK)); //Ȭ����ǥ�� �Ἥ Character
		fileMenu.add(new JMenuItem("����"));
		fileMenu.add(new JMenuItem("����"));
		fileMenu.addSeparator(); //���м� �߰�
		fileMenu.add(new JMenuItem("����"));
		//���� �޴� ����
		helpMenu.add(new JMenuItem("����"));
		helpMenu.add(new JMenuItem("����"));
		//�޴��� �޴��ٿ� ���
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		//�޴��ٸ� Container�� �߰�
		jframe.setJMenuBar(menuBar);
		//�ؽ�Ʈ �����߰�
		jframe.add(jp, "Center");
		//������ ũ������ �� ������ ���̱�
		jframe.setSize(300, 300);
		jframe.setVisible(true);
		//�ݱ��ư Ŭ���� ����
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuTest();
		
	}

}
