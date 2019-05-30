package Add3Integers;
import java.util.Scanner;
class Add3 {
		public static void main(String[] args) throws Exception {
			Scanner in = new Scanner(System.in);
			int i;
			int j;
			int k;
			int l;
			System.out.println("Enter two Numbers(i,j,k)");
			try {
					i = in.nextInt();
					j = in.nextInt();
					k = in.nextInt();
					l = i + j + k;
					if( l > 100 ) {
						throw new less100("Total is less Than 100");
					}
			}
				catch( ArithmeticException e ){
					System.out.println("J cannot be  Zero");
				}
		}
}

