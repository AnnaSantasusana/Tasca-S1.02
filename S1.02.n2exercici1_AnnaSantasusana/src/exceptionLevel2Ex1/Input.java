package exceptionLevel2Ex1;

import java.util.*;

public class Input {

	static Scanner input = new Scanner(System.in);
	
	public static byte readByte(String message) {
		byte inputByte = 0;
		boolean correctValue = false;
		
		do{
			System.out.println(message);
			try {
				inputByte = input.nextByte();
				System.out.print("OK! Your answer is: ");
				correctValue = true;
			} catch (InputMismatchException e){
				System.out.println("Format error! Invalid value.");
			}
			input.nextLine(); // per netejar el buffer
		} while (!correctValue);
		
		return inputByte;
	}
	
	public static int readInt(String message) {
		int inputInt = 0;
		boolean correctValue = false;
		
		do{
			System.out.println(message);
			
			try {
				inputInt = input.nextInt();
				System.out.print("OK! Your answer is: ");
				correctValue = true;
			} catch (InputMismatchException e){
				System.out.println("Format error! Invalid value.");
			}
			input.nextLine();
		} while (!correctValue);
		
		return inputInt;
	}
	
	public static float readFloat(String message) {
		float inputFloat = 0.0f;
		boolean correctValue = false;
		
		do {
			System.out.println(message);
			
			try {
				inputFloat = input.nextFloat();
				System.out.print("OK! Your answer is: ");
				correctValue = true;
			} catch (InputMismatchException e){
				System.out.println("Format error! Invalid value.");
			}
			input.nextLine();
		} while (!correctValue);
	
	return inputFloat;
		
	}
	
	public static double readDouble(String message) {
		double inputDouble = 0.0d;
		boolean correctValue = false;
		
		do {
			System.out.println(message);
			
			try {
				inputDouble = input.nextDouble();
				System.out.print("OK! Your answer is: ");
				correctValue = true;
			} catch (InputMismatchException e){
				System.out.println("Format error! Invalid value.");
			}
			input.nextLine();
		} while (!correctValue);
	
	return inputDouble;
		
	}
	
	public static char readChar(String message) {
		String inputString = "";
		char inputChar = 0;
		boolean correctValue = false;
		
		do {
			System.out.println(message);
			try {
				inputString = input.next();
				if ((inputString.length() > 1) || (inputString.matches(".*[0-9].*"))) {
					throw new Exception();
				} else {
					System.out.print("OK! Your answer is: ");
					correctValue = true;
				}
			} catch (Exception e){
				System.out.println("Format error! Invalid value.");
			}
			input.nextLine();
		} while (!correctValue);
	
	inputChar = inputString.charAt(0);
	return inputChar;
	
	}
	
	public static String readString(String message) {
		String inputString = "";
		boolean correctValue = false;
		
		do {
			System.out.println(message);
			
			try {
				inputString = input.next();
				if (inputString.matches(".*[0-9].*")) {
					throw new Exception();
				} else {
					System.out.print("OK! Your answer is: ");
					correctValue = true;
				}
			} catch (Exception e){
				System.out.println("Format error! Invalid value.");
			}
			input.nextLine();
		} while (!correctValue);
	
	return inputString;
		
	}
	
	public static boolean readYesNo(String message) {
		String answerSTR = "";
		boolean answer = false;
		boolean correctValue = false;
		
		do {
			System.out.println(message);
			
			try {
				answerSTR = input.next();
				if (answerSTR.equalsIgnoreCase("s")) {
					answer = true;
					System.out.print("OK! Your answer is: ");
					correctValue = true;
				}else if (answerSTR.equalsIgnoreCase("n")) {
					answer = false;
					System.out.print("OK! Your answer is: ");
					correctValue = true;
				} else {
					throw new Exception();
				}
			} catch (Exception e){
				System.out.println("Format error! Invalid value.");
			}
			input.nextLine();
		} while (!correctValue);
	
	return answer;
		
	}

}
