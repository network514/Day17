package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J02_Panel {

	Frame fr;
	
	Label lb;
	Button bt1, bt2, bt3;
	
	public J02_Panel() {
		
		fr = new Frame();
		fr.setBounds(800, 80, 400, 300);
		fr.setLayout(new BorderLayout());
		
		lb = new Label();
		bt1 = new Button("한글 문장 쓰기");
		bt2 = new Button("영어 문장 쓰기");
		bt3 = new Button("화면 지우기");

		Panel pn = new Panel();
		pn.setLayout(new GridLayout(3, 1));
		pn.add(bt1);
		pn.add(bt2);
		pn.add(bt3);
		
		fr.add("Center", lb);
		fr.add("East", pn);
		
		fr.setVisible(true);
		
		 bt1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				lb.setText("가나다라마바");
			}
		});
		 
		 bt2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				lb.setText("abcde");
			}
		});
		 
		 bt3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				lb.setText("");
			}
		});
	}
	
}

















