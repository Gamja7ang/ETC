package guitest;

import java.awt.FileDialog;

import javax.swing.JFrame;

public class FileDialogTest extends JFrame {
	public FileDialogTest() {
		FileDialog load = new FileDialog(this,"������");
		FileDialog save = new FileDialog(this,"������",FileDialog.SAVE);
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		load.setVisible(true);//���Ϻҷ����� â ����
		System.out.println("��������"+load.getDirectory());
		System.out.println("���ϼ���"+load.getFile());
		save.setVisible(true);//���� �����ϱ� â ����
	}
	public static void main(String[] args) {
		new FileDialogTest();
	}
}
