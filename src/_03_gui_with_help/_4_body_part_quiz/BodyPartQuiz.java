package _03_gui_with_help._4_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String path = "src/_03_gui_with_help/_4_body_part_quiz/";
	String firstImage = "arnold.jpeg";
	String secondImage = "leonardo.jpeg";
	String thirdImage = "morgan.jpeg";
	String fourthImage = "jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(500, 500);

		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 0;
		// 2. Set the size of the window in the initializeGui() method 

		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this?");
		String guess1 = JOptionPane.showInputDialog("who is this?");
		String guess2 = JOptionPane.showInputDialog("who is this?");
		String guess3 = JOptionPane.showInputDialog("who is this?");
		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
		if (guess.equalsIgnoreCase("arnold")) {
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. This is Arnold.");
			score-=1;
			}
		showNextImage();
		if (guess1.equalsIgnoreCase("arnold")) {
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. This is Leonardo.");
			score-=1;
		}
		showNextImage();
		if (guess2.equalsIgnoreCase("arnold")) {
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. This is Morgan.");
			score-=1;	
			}
		showNextImage();
		if (guess3.equalsIgnoreCase("arnold")) {
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. This is Jack.");
			score-=1;
			}
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		

		// 8. .... repeat 4-7 for all your images.....

		// 9. Show them their current score
JOptionPane.showMessageDialog(null, "Your score was " +score + ". Great job! Enjoy the rest of your day.");
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(path+firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(path+secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(path+thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(path+fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();

		return new JLabel("No more images");
	}
}