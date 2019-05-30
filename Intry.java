import java.awt.Color;
import java.awt.Graphics;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Graphics;
public class Intry extends JFrame{
	public static void main( String[] args ) {
		try {
			Scanner in = new Scanner(System.in);
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
					//jf.setBackground(Color.BLUE);
				    System.out.println("code is Entered very deep in program !");	
				}
				try {	
					int  i, j, k;
					System.out.println( "Enter i value :" );
					i = in.nextInt();
					System.out.println( "Enter j value :" );
					j = in.nextInt();
					k = i / j;
					System.out.println( " K value is: " +k);
				}
				catch ( InputMismatchException e ) {
					System.out.println( "code is Entered in second deep in program!");
				}
		}
		catch( ArithmeticException e ) {
			System.out.println("'I am out and free!'Code says");
		}
	}
}