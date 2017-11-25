package visual13_4;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class VibratingEx extends JFrame{
	public VibratingEx() {
		super("�����ϴ� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 300);
		setLocation(100, 100); // �ʱ���ġ ����
		setVisible(true);
		
		VibratingThread vt = new VibratingThread(this);
		vt.start();	
	}
	class VibratingThread extends Thread implements Runnable{
		Component comp;
		public VibratingThread(Component c) {
			this.comp = c;
		}
		public void run() {
			Random r = new Random();
			int x = comp.getX();
			int y = comp.getY();
			
			while(true) {
				try {
					Thread.sleep(10); // 10ms�������� ���
				} catch(InterruptedException e) {
					return;
				}
				
				// �������� ��ġ�� ��ȭ��Ŵ
				int sign = 1;
				
				if(r.nextBoolean()) sign = 1;
				else sign = -1;
				int tmpX = x + r.nextInt(5)*sign;

				if(r.nextBoolean()) sign = 1;
				else sign = -1;
				int tmpY = y + r.nextInt(5)*sign;
				
				comp.setLocation(tmpX, tmpY);
			}
		}	
	}
	public static void main(String[] args) {
		new VibratingEx2();
	}
}
