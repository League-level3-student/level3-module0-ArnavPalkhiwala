package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	static void arrayStrings(String[] string) {

		for (int i = 0; i < string.length; i++) {

			System.out.println(string[i]);

		}

	}
	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order..

	static void reverseString(String[] reverse) {

		for (int i = reverse.length; i < 0; i--) {

			System.out.println(reverse[i]);

		}

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	static void everyother(String[] everyother) {

		for (int i = 0; i < everyother.length; i = i + 2) {

			System.out.println(everyother[i]);

		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	static void allRandom(String[] allrandom) {
		
		for (int i = 0; i < allrandom.length; i++) {

			System.out.println(allrandom[i]);

		}

	}

}
