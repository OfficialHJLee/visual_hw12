package visual13_1;

import java.util.Scanner;

public class ThreadEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 키나 입력>> "); // 스레드를 시작하기 위한 입력
		String entry = sc.next();
		
		Thread th = new Thread(new CountingThread()); 		
		th.run();
		
		sc.close();
	}
}
// Runnable을 상속받아 클래스 생성
class CountingThread implements Runnable{
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");
		
		for(int i = 0; i < 10; i++) // 1~10까지 출력
			System.out.print((i+1) + " ");
		
		System.out.println("");
		System.out.println("스레드 종료");
	}	
}
