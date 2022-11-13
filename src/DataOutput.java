import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {
	File file ;
	public FileOutputStream fos;
	public DataOutput(FileOutputStream fileOutputStream) {
		fos = fileOutputStream;
	}
	
	public void writeInt(int number) {
		
		
		//We are using Big-Endian notation
		try {
			
			//Write an integer to the file
			
			
			System.out.println("Our number is : "+number);
			//Big Endian
			fos.write(number>>24);
		
			fos.write(number>>16);
			
			fos.write(number>>8);
			
			fos.write(number);
			
			fos.flush();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Writing integer process has been done successfully . ");
		
	}
	
	public void writeString (String string) {
		
		
		
		
		try {
			
			System.out.println("Our string is : "+string);
			int strLength = string.length();//We define the string length because we will write string to file amount of string length
			
			short strlength = (short)strLength;//We convert int to short because at first we have to write 2 byte to file .
			
			//And we are writing with Little Endian
			fos.write(strlength);
			fos.write(strlength>>8);//We wrote two byte to file for writing. Now we are writing string to file use get.byte method
									// because getbyte method is a kind of interpreter . 
			fos.write(string.getBytes());
			
			fos.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Writing string process has been done successfully . ");
	}
	
	public void close() {
		
		try {
			
			fos.close();
			System.out.println("File closed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
