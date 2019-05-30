package userdefinedExceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

class UserDefinedExceptions extends Exception{
	public static void main(String args[]) throws NewExcept {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter two Numbers(i,j)");
			int a,b,c=0;
			try {
				a=in.nextInt();
				b=in.nextInt();
				c=a/b;
			}
			
			catch ( InputMismatchException e ) {
				System.out.println("Entered Input are not Integers");
				throw new NewExcept("HEllo World!");
			}
			catch ( ArithmeticException e ){
				System.out.println("J cannot be  Zero");
				throw new NewExcept("j is 0  and u r wrong");
			}
	}
}
