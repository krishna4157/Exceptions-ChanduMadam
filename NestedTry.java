import java.util.InputMismatchException;
import java.util.Scanner;
class NestedTry {
	public static void main( String[] args ) {
		try {
			Scanner in= new Scanner(System.in);
			try {
				try {
					int i, j, k;
					System.out.println("Enter i value :");
					i = in.nextInt();
					System.out.println("Enter j value :");
					j = in.nextInt();
					k = i / j;
					System.out.println("K value is:"+k);
				} 
					catch ( InputMismatchException e ){
						System.out.println("code is Entered very deep in program!");	
					}
				}
				catch( InputMismatchException e ) {
					System.out.println("code is Entered deep in program!");
				}
			}
		catch( ArithmeticException e ) {
			System.out.println("'I am out and free!'Code says");
		}
	}
}
