package guitest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventTest extends javax.swing.JFrame implements ActionListener {
	//��ư ����
	JButton btn1 = new JButton("click1");
	JButton btn2 = new JButton("click2");
	//������
	public ActionEventTest() {
		//���̾ƿ� ����
		this.setLayout(new FlowLayout());
		//��ư�� �߰�
		this.add(btn1);
		this.add(btn2);
		//ũ�� �� ���̱� ����
		this.setSize(300, 200);
		this.setVisible(true);
		//'x'��ưŬ���� ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�̺�Ʈ ���
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//ActionListener ������
		if(arg0.getSource().equals(btn1)) {
			JOptionPane.showMessageDialog(this, "button1");
		}else{
			JOptionPane.showMessageDialog(this, "button2");
		}
	}

	public static void main(String[] args) {
		new ActionEventTest();
	}
}
