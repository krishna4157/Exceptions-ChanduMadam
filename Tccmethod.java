import java.util.InputMismatchException;
import java.util.Scanner;
public class Tccmethod {
	public static void main(String[] args)throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two Numbers(i,j)");
		int a, b, c;
		try {
			a = in.nextInt();
			b = in.nextInt();
			c = a / b;
		}
		
		catch ( InputMismatchException e ) {
			System.out.println("Entered Input are not Integers");
		}
		catch ( ArithmeticException e ){
			System.out.println("J cannot be  Zero");
		}
	}
}
