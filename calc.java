package calculator;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class calc {
	// Label and frame
	JFrame frame;
	JLabel label;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc gui = new calc(); 
		gui.init();
		
		
		
		
	}
	public void init() {
		//Window initialization 
		frame = new JFrame("Calc 0.1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JButton plusButt = new JButton("+");
		JButton minusButt = new JButton("-");
		JButton butt_1 = new JButton("1");
		JButton butt_2 = new JButton("2");
		JButton butt_3 = new JButton("3");
		JButton butt_4 = new JButton("4");
		JButton butt_5 = new JButton("5");
		JButton butt_6 = new JButton("6");
		JButton butt_7 = new JButton("7");
		JButton butt_8 = new JButton("8");
		JButton butt_9 = new JButton("9");
		JButton butt_0 = new JButton("0");
		JButton divbutt = new JButton("/");
		JButton multbutt = new JButton("*");
		
		label = new JLabel("Label");
		Container c = frame.getContentPane();
		c.setLayout(new GridLayout(5,5));
		//Adding components
		c.add(label); 
		c.add(plusButt);
		c.add(minusButt);
		c.add(butt_1);
		c.add(butt_2);
		c.add(butt_3);
		c.add(butt_4);
		c.add(butt_5);
		c.add(butt_6);
		c.add(butt_7);
		c.add(butt_8);
		c.add(butt_9);
		c.add(butt_0);
		c.add(divbutt);
		c.add(multbutt);
		//Window parameters
		frame.setSize(200,300);
		frame.setVisible(true);
		
		
	}
	
}
