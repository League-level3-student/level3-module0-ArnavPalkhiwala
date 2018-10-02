package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method

	public static void main(String[] args) {

		// 2. create an array of 5 robots.

		Robot[] robot = new Robot[5];

		// 3. use a for loop to initialize the robots.

		for (int i = 0; i < robot.length; i++) {

			Robot r = new Robot();
			robot[i] = r;
			r.setSpeed(10);

		// 4. make each robot start at the bottom of the screen, side by side, facing up
			
			r.setX(i*200 + 25);
			r.setY(540);

			
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		
		
		
		Random s = new Random(51);
		
		boolean finished = false;

		while (!finished) {
			
		
		for (int i = 0; i < robot.length; i++) {
			
			robot[i].move(s.nextInt(51));
			
			if (robot[i].getY() <= 0) {
				
				JOptionPane.showMessageDialog(null, "You are a winner!");
				
			}

		}
		}
			

	
	}
	
}


