package visual13_2;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.Random; 

 public class randomMoveEx extends JFrame {	 
 	public randomMoveEx() {  
 		setTitle("원이 랜덤한 위치로 이동"); 
 		setDefaultCloseOperation(EXIT_ON_CLOSE);
 		
 		final MyPanel panel = new MyPanel();   
 		setContentPane(panel);  
 	    
 		setSize(300, 300);  
 		setVisible(true);  
 	}
 	// 원이 400ms 간격으로 생성시키는 클래스
 	class MyPanel extends JPanel {  
		public MyPanel() {  
			new Thread (new Runnable() { 
 				public void run() {
 					try {
 						while( true ) { 
 							repaint();  
 							Thread.sleep(400); // 400ms간격
 						} 
 					} catch(Exception e) {  
 						return;
 					}  
 				}
 			}).start();
		}
		// 원을 랜덤한 위치로 생성시키는 컴포넌트
		public void paintComponent(Graphics g) {
			Random r = new Random();
			// 랜덤한 위치 선정
			int x = r.nextInt(getWidth()-50);
			int y = r.nextInt(getHeight()-50);
			g.clearRect(0, 0, getWidth(), getHeight()); // 기존 원을 지움
			g.drawOval(x, y, 50, 50); // 지름이 50픽셀인 원 그림 
		}  
 	}  
 	public static void main(String[] args) {  
 		new randomMoveEx();  
    }  
 }  
