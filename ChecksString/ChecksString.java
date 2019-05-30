package ChecksString;
import java.util.Scanner;
public class ChecksString {
	public static Scanner in = new Scanner(System.in);
	public static void main(String args[]) throws OutofClass{
		int n;
		String str;
		String str1=null;
		System.out.println("Enter the Names divided by ' ':");
		str = in.nextLine();
		n = str.length();
		System.out.println("Enter the Name :");
		str1 = in.next();
		cw(str,str1,n);
	}
	
	private static void cw(String input, String userName, int n) throws OutofClass{
			try {
				input = null;
				String ch[] = input.split(" ");		
				int len = ch.length;
				for(int i = 0;i < len; i++) {								
						if(ch[i].contains(userName)){		
							System.out.println("You are Enrolled!");
								break;
						}else {
							throw new OutofClass("'You are not Enrolled for the class'.");
						}			
				}
			} catch (Exception e) {
				throw new OutofClass("'You are not Enrolled for the class'.");
			}finally {
			in.close();	
			}
	}
}
