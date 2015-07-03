package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import data.*;

public class J05_View {

	Frame fr;
	
	TextArea ta;
	Button bt1, bt2, bt3;
	Panel pn;
	
	J05_People pp;
	ArrayList<J05_People> lists;
	
	public J05_View() {
		
		lists = new ArrayList();
		
		fr = new Frame();
		fr.setBounds(800, 80, 400, 300);
		fr.setLayout(new BorderLayout());

		ta = new TextArea();
		bt1 = new Button("인사정보 입력");
		bt2 = new Button("인사정보 검색");
		bt3 = new Button("프로그램 종료");
		pn = new Panel();
		pn.setLayout(new GridLayout(3,1));
		pn.add(bt1);
		pn.add(bt2);
		pn.add(bt3);
		
		fr.add("Center", ta);
		fr.add("East", pn);
		
		fr.setVisible(true);
		
		bt1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String name = jop("이름 입력");
				String rAge = jop("나이 입력");
				pp = new J05_People(name, rAge);
				lists.add(pp);
				
				System.out.println("lists : " + lists);
			}
		});

		bt2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String search =
					jop("검색할 이름 입력");
				
//				확장 for-each문의 이용
//				for( 오른쪽 컬렉션 중 한개 선택 : 컬렉션) 
				for( J05_People each : lists) {
					
					if(each.getName().equals(search)) {
						ta.append(each.toString() + "\n");
					}
				}
			}
		});

		
		bt3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
	}

	String jop(String msg) {
		String ret = 
		JOptionPane.showInputDialog(msg);
		return ret;
	}
	
}


















