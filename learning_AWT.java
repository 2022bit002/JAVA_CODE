import java.awt.*;

class learn extends Frame {

	learn(){
		Button b = new Button("Lets learn together");
		b.setBounds(30,100,80,30);
		setSize(500,500);
		setTitle("learn while play ");
		add(b);
		setVisible(true);
	}

	public static void main(String args[]){
		learn l = new learn();
		
	}
}
