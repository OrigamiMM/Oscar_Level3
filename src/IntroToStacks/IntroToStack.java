package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Stack<Double> stack = new Stack<Double>();
		double dub1;
		double dub2;
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			stack.push(rand.nextDouble()*100);
			System.out.println(stack.pop());
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String num1 = JOptionPane.showInputDialog("Enter any number between number 0 and 100");
		String num2 = JOptionPane.showInputDialog("Chose a second number between 0 and 100");
		dub1 = Double.parseDouble(num1);
		dub2 = Double.parseDouble(num2);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
