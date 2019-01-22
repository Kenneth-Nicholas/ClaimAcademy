/*(Approximating ) can be computed using the following formula:
Write a program that displays the result of
Use 1.0 instead of 1 in your program.
Pi = 4 * ( 1 - 1/3 + 1/5 - 1/7 + 1/9 ...)
 */

package approximatingPi;

public class ApproximatingPi {

	public static void main(String[] args) {
		
		double pi = (4.0d * (((((((1.0d - (1.0d/3.0d)) + (1.0d/5.0d)) - (1.0d/7.0d)) + (1.0d/9.0d)) - (1.0d/11.0d)) + (1.0d/13.0d))));

		System.out.println(pi);
		
	}
	
}
