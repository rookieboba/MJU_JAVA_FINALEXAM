package Test3;


import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Finalexam extends JFrame {

	JLabel la;
	
	public Finalexam(){
		super("Finalexam");
		la = new JLabel("Drag");
		
		setTitle("FinalExam03");
		Container c = getContentPane();
		
		c.setLayout(null);
		
		la.setLocation(50, 50);
		la.setSize(30, 10);
		la.addMouseListener(new MyHandler());
		c.add(la);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	private class MyHandler extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e){
			JLabel la = (JLabel)e.getSource();
			Container c =la.getParent();
			
			int xBound = c.getWidth() - la.getWidth();
			
			int yBound = c.getHeight() - la.getHeight();
			
			la.setLocation((int)(Math.random()*xBound), (int)(Math.random()*yBound));
		}
	}
	
	public static void main(String[] args) {
		new  Finalexam ();
	}

}
