package visual13_1;

import java.util.Scanner;

public class ThreadEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ� Ű�� �Է�>> "); // �����带 �����ϱ� ���� �Է�
		String entry = sc.next();
		
		Thread th = new Thread(new CountingThread()); 		
		th.run();
		
		sc.close();
	}
}
// Runnable�� ��ӹ޾� Ŭ���� ����
class CountingThread implements Runnable{
	@Override
	public void run() {
		System.out.println("������ ���� ����");
		
		for(int i = 0; i < 10; i++) // 1~10���� ���
			System.out.print((i+1) + " ");
		
		System.out.println("");
		System.out.println("������ ����");
	}	
}
