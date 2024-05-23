import java.awt.*;

class awt_learn{
	awt_learn(){
		Frame f = new Frame();
		Button b= new Button("Button 1");
		Button b1 = new Button("Button 2");
		TextField t = new TextField("Write here");
		TextField t1 = new TextField("Write here");
		
		f.add(b);f.add(t);
		f.add(b1);f.add(t1);
		f.setBounds(500,80,100,80);
		b.setBounds(100,80,100,80);
		b1.setBounds(100,80,100,80);
		f.setSize(800,800);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		
		
	}
	
	
	public static void main(String args[])
	{
		awt_learn l = new awt_learn();
	
	}
}
