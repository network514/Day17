package gui;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class J03_KeyListener {

	Frame fr;
	Button bt;
	
	public J03_KeyListener() {
		fr = new Frame();
		fr.setBounds(800, 80, 300, 200);
		
		bt = new Button("화면 이동");
		fr.add(bt);
		
		fr.setVisible(true);
		
		bt.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println(e.getKeyCode());
//				=> 키보드에 대한 작동 정보를 모두
//					이벤트 객체인 e가 알고 있다.
				
				int x = fr.getX();
//				=> fr 화면의 x좌표
				int y = fr.getY();
//				=> fr 화면의 y좌표
				
//				키보드 화살표 : 왼쪽 37 / 위 38 / 오른쪽 39 / 아래 40
				
				if(e.getKeyCode()==37) {
					x -= 10;
				} else if(e.getKeyCode()==39) {
					x += 10;
				} else if(e.getKeyCode()==38) {
					y -= 10;
				} else if(e.getKeyCode()==40) {
					y += 10;
				}
				
				fr.setLocation(x, y);
			}
		});
		
		
	}
	
	
	
}
















