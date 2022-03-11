package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener{
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	public void stuff() {
			JFrame frame = new JFrame();
			frame.setVisible(true);
			
			JPanel panel = new JPanel();
			
			button.addActionListener(this);
			button1.addActionListener(this);
			button2.addActionListener(this);
			panel.add(button);
			panel.add(button1);
			panel.add(button2);
			frame.add(panel);
			frame.pack();
			 
		
}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button3 = (JButton) e.getSource();
		if(button3==button) {
			showDucks();
		}
		if(button3==button1) {
		showFrog();	
		}
		if(button3==button2) {
			showFluffyUnicorns();
		}
	}
}