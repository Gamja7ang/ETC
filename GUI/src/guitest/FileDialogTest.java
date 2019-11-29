package guitest;

import java.awt.FileDialog;

import javax.swing.JFrame;

public class FileDialogTest extends JFrame {
	public FileDialogTest() {
		FileDialog load = new FileDialog(this,"열기모드");
		FileDialog save = new FileDialog(this,"저장모드",FileDialog.SAVE);
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		load.setVisible(true);//파일불러오기 창 열기
		System.out.println("폴더선택"+load.getDirectory());
		System.out.println("파일선택"+load.getFile());
		save.setVisible(true);//파일 저장하기 창 열기
	}
	public static void main(String[] args) {
		new FileDialogTest();
	}
}
