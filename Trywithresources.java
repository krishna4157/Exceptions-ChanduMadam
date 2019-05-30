
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
class Trywithresources{
	private static void printFile() throws IOException{
	    try(  FileInputStream     input         = new FileInputStream("file.txt");
	          BufferedInputStream bufferedInput = new BufferedInputStream(input)
	    ) {
	        int data = bufferedInput.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = bufferedInput.read();
	        }
	    }
	}
}