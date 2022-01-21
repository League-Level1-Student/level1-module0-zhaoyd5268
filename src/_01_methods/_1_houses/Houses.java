package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		// Check the recipe to find out what code to put here
	Robot rob = new Robot();
	rob.setX(20);
	rob.setSpeed(20);
	for (int i = 0; i<9; i++) {
	rob.setPenColor(Color.orange);
	rob.penDown();
	rob.move(100);
	rob.turn(90);
	rob.move(20);
	rob.turn(90);
	rob.move(100);
	rob.setPenColor(Color.GREEN);
	rob.turn(-90);
	rob.move(30);
	rob.turn(-90);

	}
	rob.hide();
	}
}
