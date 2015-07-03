package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class J01_Handler 
				implements ActionListener {

	Label lb;
	
	public J01_Handler(Label lb) {
		this.lb = lb;
	}
	
	public void actionPerformed(ActionEvent e) {

		lb.setText("버튼을 통해 레이블에 ]"
						+ "메시지를 출력");
	}
}














