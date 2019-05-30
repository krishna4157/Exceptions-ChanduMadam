import java.util.Scanner;
class Tcmethod  {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int i;
		int j;
		int c;
		System.out.println("Enter two Numbers(i,j)");
		try {
				i = in.nextInt();
				j = in.nextInt();
				c = i / j;
		}
			catch ( ArithmeticException e ){
				System.out.println("J cannot be  Zero");
			}
	}
}