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
	JFrame jframe = new JFrame("menu 예제");
	JTextArea textArea = new JTextArea("내용을 입력하세요", 5, 10); //Scroll bar 없음
	JScrollPane jp = new JScrollPane(textArea); //Make Scroll bar
	
	//Menu 선언
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("FIle");
	JMenu helpMenu = new JMenu("HELP");
	
	public MenuTest() {
		//파일 메뉴 생성
		fileMenu.add(new JMenuItem("새파일"));
		fileMenu.getItem(0).setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK^InputEvent.ALT_MASK)); //홑따옴표를 써서 Character
		fileMenu.add(new JMenuItem("열기"));
		fileMenu.add(new JMenuItem("저장"));
		fileMenu.addSeparator(); //구분선 추가
		fileMenu.add(new JMenuItem("종료"));
		//도움말 메뉴 생성
		helpMenu.add(new JMenuItem("버전"));
		helpMenu.add(new JMenuItem("정보"));
		//메뉴를 메뉴바에 등록
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		//메뉴바를 Container에 추가
		jframe.setJMenuBar(menuBar);
		//텍스트 영역추가
		jframe.add(jp, "Center");
		//프레임 크기지정 후 프레임 보이기
		jframe.setSize(300, 300);
		jframe.setVisible(true);
		//닫기버튼 클릭시 종료
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuTest();
		
	}

}
