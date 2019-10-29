package guiTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame{
		JFrame jframe = new JFrame("제목");
	
		private static final long serialVersionUID = 1L;
	
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");

		public BorderLayoutTest() {
			Container container = jframe.getContentPane();
			container.add(btn1, BorderLayout.NORTH);
			container.add(btn2, BorderLayout.EAST);
			container.add(btn3, BorderLayout.WEST);
			container.add(btn4, BorderLayout.SOUTH);
			container.add(btn5, BorderLayout.CENTER);
			
			jframe.setSize(300, 300);
			
			jframe.setVisible(true);
			
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
/*			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			this.add(btn4);
			this.add(btn5);
			*/
		}
		
		/*
		public ButtonTest() {
//			super("제목");  아래와 둘 다 가능
			JFrame jframe = new JFrame("제목");
			//Component를 담을 Container 구하기
			
			this.setLayout(new FlowLayout());
			this.add(btn1); this.add(btn2); 	this.add(btn3);
			this.setSize(300, 400);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}*/
		
	public static void main(String[] args) {
		new BorderLayoutTest();

	}

}
