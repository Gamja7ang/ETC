package guitest;

import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
/*JMenuBar: JMenu을 올릴 틀
JMenu: 눌렷을때 서브 가 존재하는 경우
JMenuItem: JMenu에 add하고, JMenu를 JMenuBar에 add한다.

메뉴는 메뉴만의 자리가 따로 존재하고
Frame의 North에 들어가는 것은 아니다.

JFrame.setMenuBar(JMenuBar);
*/
public class MenuTest {
	JFrame jFrame = new JFrame("menu 예제");
	JTextArea textArea = new JTextArea("내용을 입력하세요",5,10);//스크롤바 없음
	JScrollPane jp = new JScrollPane(textArea);//스크롤바 만들기
	
	//메뉴 선언
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("파일");
	JMenu helpMenu = new JMenu("Help");
	
	public MenuTest() {
		//파일 메뉴 생성
		fileMenu.add(new JMenuItem("새 파일"));
		fileMenu.getItem(0).setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_MASK^InputEvent.ALT_MASK));//단축키설정
		fileMenu.add(new JMenuItem("열기"));
		fileMenu.add(new JMenuItem("저장"));
		fileMenu.addSeparator(); //구분선 추가
		fileMenu.add(new JMenuItem("종료"));
		//도움말 메뉴생성
		helpMenu.add(new JMenuItem("버전"));
		helpMenu.add(new JMenuItem("정보"));
		
		//메뉴를 메뉴바에 등록
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		
		//메뉴바를 추가
		jFrame.setJMenuBar(menuBar);
		
		//텍스트 영역 추가
		jFrame.add(jp, "Center");
		
		//프레임크기지정 후 프레임 보이기
		jFrame.setSize(300, 300);
		jFrame.setVisible(true);
		
		//'x'버튼클릭시 종료
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuTest();
	}
}