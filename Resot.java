//import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;
class Resot {
	public static void main( String[] args ) {
		int d,f;
		String s;
		String c;
		String x;
		Scanner in = new Scanner(System.in);
				String a;
				f = in.nextInt();
				a = in.nextLine();
		//in.nextLine();
		System.out.println("'Hello World!'code Says "+a);
		try( Scanner bn = new Scanner( System.in ) ){
			s = bn.nextLine();
			d = in.nextInt();
			System.out.println("'Hello World!'code Says "+a+" "+s+" ");
		}
		catch ( InputMismatchException e ) {
			System.out.println("hehe "+e);
		}

	}
}