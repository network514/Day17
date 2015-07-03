package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J01_View {

	Frame fr;
	
	Label lb;
	Button bt;
	
	public J01_View(){
		
		fr = new Frame();
		fr.setBounds(800, 80, 400, 300);
		fr.setLayout(new GridLayout(1, 2));
		
		lb = new Label();
		bt = new Button("버튼을 눌러주세요");
		
		fr.add(lb);
		fr.add(bt);
		
		fr.setVisible(true);
		
		
//		1. 구현클래스 작성 후 이용
//		J01_Handler hh = new J01_Handler(lb);
//		bt.addActionListener(hh);
		
		
//		2. 익명으로 구현 클래스 작성 후 이용
		ActionListener aa = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lb.setText("버튼이 메시지 남김");
			}
		};
		bt.addActionListener(aa);
		
	}
	
}















