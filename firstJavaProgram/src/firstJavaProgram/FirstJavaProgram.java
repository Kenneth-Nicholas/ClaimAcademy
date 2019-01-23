package firstJavaProgram;

public class FirstJavaProgram {

	public static void main(String[] args) {
		
		System.out.println("This is my first program in java");
		
		int a = 1;
		
		int b = 2;
		
		int c = 3;
		
		for(int i = 0; i < 10; i++) {
			
			a += i;
			b += a;
			c += b;
			
		}
		
		System.out.println("int a is now equal to " + a);
		System.out.println("int b is now equal to " + b);
		System.out.println("int c is now equal to " + c);
		
	} // End of main

} // End of FirstJavaProgram Class
