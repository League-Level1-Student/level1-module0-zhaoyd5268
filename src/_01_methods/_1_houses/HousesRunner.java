package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		//Do not add any more code here!

		Houses houseBuilder = new Houses();
	houseBuilder.rob("small");
	houseBuilder.rob("large");
	houseBuilder.rob("medium");
	houseBuilder.rob("medium");
	houseBuilder.rob("large");
	houseBuilder.rob("small");
	houseBuilder.rob("large");
	houseBuilder.rob("small");
	houseBuilder.rob("medium");
		


	}

	private static void background(Color black) {
		// TODO Auto-generated method stub
		
	}

}
