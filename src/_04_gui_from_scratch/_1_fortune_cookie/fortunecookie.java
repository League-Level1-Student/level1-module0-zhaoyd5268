package _04_gui_from_scratch._1_fortune_cookie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class fortunecookie implements ActionListener {
	
	public void showButton() {
	JFrame frame = new JFrame();
		System.out.println("Button clicked");
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		
		button.addActionListener(this);
		
		int rand = new Random().nextInt(5);
		if (rand==0) {
			System.out.println("You will not pay taxes for a month.");
		}
		if (rand==1) {
			System.out.println("You will find luck in your heart.");
		}
		if (rand==2) {
			System.out.println("You will find your way through a unknown and hard path.");
		}
		if (rand==3) {
			System.out.println("Your friends will become your greatest allies in the road ahead.");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
