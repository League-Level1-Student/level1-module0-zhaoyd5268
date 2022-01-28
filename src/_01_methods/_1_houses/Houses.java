package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	Robot rob = new Robot();
	
public void rob(String height) {
	rob.setWindowColor(Color.BLACK);
	rob.hide();
	int heightasint = 0;
	if (height.equalsIgnoreCase("small")) {

		heightasint=60;
		rob.setPenColor(Color.BLUE);
	}
	if (height.equalsIgnoreCase("medium")) {
rob.setPenColor(Color.white);
		heightasint=120;
	}
	if (height.equalsIgnoreCase("large")) {
rob.setPenColor(Color.PINK);
		heightasint=250;
	}
		rob.setSpeed(20);
		rob.penDown();
		rob.move(heightasint);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(heightasint);
		rob.setPenColor(Color.GREEN);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
}
		
	public void run() {
		// Check the recipe to find out what code to put here



			}
}

