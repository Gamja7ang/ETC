package guiTest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CompositeLayout {
	JFrame jFrame = new JFrame(); //전체적인 프레임
	JPanel jPanel = new JPanel(); //상단에 위치할 패널
	JButton [] btn = new JButton[4];
	
	public CompositeLayout() {
		//버튼 생성
		for(int i = 0; i<btn.length; i++) {
			btn[i] = new JButton(i+"번째 버튼");
			
		}
		
		//패널에 버튼 추가
		jPanel.add(btn[0]);
		jPanel.add(btn[1]);
		
		jFrame.add(jPanel, "North");
		jFrame.add(btn[2], "West");
		jFrame.add(btn[3], "Center");
		
		//사이즈 및 보여짐 설정과 창닫기
		jFrame.setSize(200, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CompositeLayout();
	}

}
