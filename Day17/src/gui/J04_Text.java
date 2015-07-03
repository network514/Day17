package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class J04_Text {

	Frame fr;
	
	TextArea ta;
	TextField tf;
	Panel pn;
	Button[] bt;
	
	public J04_Text() {
		
		fr = new Frame();
		fr.setBounds(800, 80, 400, 300);
		fr.setLayout(new BorderLayout());

		ta = new TextArea();
		tf = new TextField();
		pn = new Panel();
		bt = new Button[3];
		for(int i=0; i<bt.length; i++) {
			bt[i] = new Button();
		}
		bt[0].setLabel("메시지 입력");
		bt[1].setLabel("메시지 보기");
		bt[2].setLabel("메시지 삭제");
		
		pn.setLayout(new GridLayout(3,1));
		for(int i=0; i<bt.length; i++) {
			pn.add(bt[i]);
		}
		
		fr.add("Center", ta);
		fr.add("East", pn);
		fr.add("South", tf);
		
		fr.setVisible(true);
		
		tf.requestFocus();
//		=> 커서를 tf에 설정함
		
		
//		tf에서 입력한 글이 ta에 나오는 기능
//		=> 글을 쓴 후, 엔터를 치면 리스터가 작동
		tf.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String tfMsg = tf.getText();
				tf.setText("");
				ta.append(tfMsg + "\n");
			}
		});
		
		bt[0].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String rcv = 
				JOptionPane.showInputDialog(
							"화면에 보여줄 메시지 입력");
				ta.append(rcv + "\n");
			}
		});
		
		bt[1].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String rcv = ta.getText();
				JOptionPane.showMessageDialog(
								null, rcv);
			}
		});
		
		
		bt[2].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				ta.setText("");
			}
		});
		
		
		
		
	}
	
	
}





















