package Greatorthan18;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Greatorthan18 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int i;
		int j;
		int c;
		System.out.println("Enter Age");
		try {
				i = in.nextInt();
				if(i < 18) {
					throw new Error18("Access denied - You must be at least 18 years old.");
				}
		} catch(InputMismatchException e){
				System.out.println("please enter Integers");
				//i=0;
				//i=in.nextInt();
		}
	}
}

