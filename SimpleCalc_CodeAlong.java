import java.io.*;
import java.util.*;
import javax.swing.*;

public class SimpleCalc {

	public static void main(String[] args) {
		
		getInput();
		

	}
	
	public static void getInput() {
	
		double num1 = 0.0;
		double num2 = 0.0;
		String userStr = "";
		String choice = "";
		
		
		userStr = JOptionPane.showInputDialog("Enter First Number: ");
		num1 = Double.parseDouble(userStr);
		
		do {
			choice = JOptionPane.showInputDialog("Enter operation [+, -, *, /, %, ^]:");
			userStr = JOptionPane.showInputDialog("Enter Second Number: ");
			num2 = Double.parseDouble(userStr);
			
		}while(choice.equals("/") && num2 == 0);
		
		results(num1, num2, choice);
	}
	
	public static double addition (double n1, double n2) {
		
		return n1 + n1;
	}
	
	public static double subtraction (double n1, double n2){
		
		return n1 - n2;
	}
	
	public static double multiply (double n1, double n2) {
		
		return n1 * n2;
	}
	
	public static double divide (double n1, double n2) {
			
		return n1 / n2;
	}
	public static double percentTtl (double part, double ttl) {
		
		double answer = 0;
		
		answer = (part/ttl) * 100;
		
		return answer;
	}
	public static double power (double x, double y) {
		double answer = 1.0;
		
		for (int i = 0; i < y; i++) {
			answer *= x;
		}
		
		return answer;
	}
	
	public static void results (double n1, double n2, String op) {
		
		if (op.equals("+")) {
			JOptionPane.showMessageDialog(null, addition(n1,n2));
		}
		else if (op.equals("-")) {
			JOptionPane.showMessageDialog(null, subtraction(n1,n2));
		}
		else if (op.equals("*")) {
			JOptionPane.showMessageDialog(null, multiply(n1,n2));
		}
		else if (op.equals("/")) {
			JOptionPane.showMessageDialog(null, divide(n1,n2));
		}
		else if (op.equals("%")) {
			JOptionPane.showMessageDialog(null, percentTtl(n1,n2) + "%");
		}
		else if (op.equals("^")) {
			JOptionPane.showMessageDialog(null, power(n1,n2));
		}
		else {
			JOptionPane.showMessageDialog(null, op + " is not a valid operation.");
		}

	}
	
	

}
