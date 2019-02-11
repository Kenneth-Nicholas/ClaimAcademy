package test;

import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Date date = new Date();
		
		System.out.println(date.toString());
		
		Random random = new Random(1);
		
		Random random2 = new Random(1);
		
		System.out.println(random.nextInt(1000));
		System.out.println(random2.nextInt(1000));
		
		String string = new String("hello world");

		stringTest(string);
		
		System.out.println(string);
		
		int[] array = new int[3];
		
		array[0] = 0;
		
		array[1] = 1;
		
		array[2] = 2;
		
		arrayTest(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		Test test = new Test();
		
		objectTest(test);
		
		System.out.println(test.getString());
		System.out.println(test.isBool());
		System.out.println(test.getInteger());
		System.out.println(test.getDoub());
		System.out.println(test.getCharacter());
		
		
		
//Writing To File//****************************************************		
		
		
		
		File file = new File("output.txt");
		
		PrintWriter output = new PrintWriter(file);
		
		output.println("hello world");
		
		output.close();
		
		
		
//Reading From File//***************************************************
		
		
		
		File inputFile = new File("input.txt");
		
		Scanner input = new Scanner(inputFile);
		
		String helloWorld = input.nextLine();
		
		input.close();
		
		System.out.println(helloWorld);

		
		
// **********************************************************************		
		
		
		
	}	
	
	public static void stringTest(String string) {
		
		string += "hello world";
		
	}
	
	public static void arrayTest(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] += 1;
			
		}
		
	}
	
	public static void objectTest(Test test) {
		
		test.setString("hello world");
		test.setBool(true);
		test.setInteger(7);
		test.setDoub(7.0d);
		test.setCharacter('W');
		
	}
		
}
