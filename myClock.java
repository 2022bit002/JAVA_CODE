

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

class clock{
	
	JFrame f;
	JLabel l,l1;
	
	
	clock(){
		f = new JFrame("This is my clock");
		l = new JLabel();
		l1 =new JLabel();
		f.add(l);
		f.setVisible(true);
		f.setSize(600,600);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		time();
	}
	
	void time(){
		while(true){
		
		long milisec = System.currentTimeMillis();
		
		long totalsec = milisec/1000;
		
		long sec = totalsec % 60;
		
		long totalmin = totalsec/60;
		
		long min = (totalmin + 30)%60;
		
		long totalhr = totalmin / 60;
		
		long hr = (totalhr + 5)%24;
		
		String w = "Today time is : ";
		String t = hr+":"+min+":"+sec ;
		
		//l1.setText(t);
		l.setText(w);
		}
	}
	
	public static void main(String ...args){
		new clock();
	}
}
