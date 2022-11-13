import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {
	//****We will read datas from file.
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		File file = new File("dosya.txt"); // declare the file
		try {					
			fis = new FileInputStream(file);//When we run this , 'fis' referances comes to start point of file.
			/*//Read character one by one.
			System.out.println(fis.read());//Return value as byte type
			System.out.println((char)(fis.read()));//Converting value byte to character.
			
			fis.skip(5);//Move forward 5 step then start there. 
			System.out.println((char)(fis.read()));*/
			//*******If we want to read all file , we should create a loop.
			int deger;
			String s = "";
			while((deger = fis.read()) != -1){ //-1 means there is no any readable character
				
				s += (char)deger;
			}
			
			System.out.println("File content : "+ s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No found file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("There is error while reading data.");
		}
		
		finally {
			try {
				fis.close();//Dont forget to close file.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("There is error while closing the file.");
			}
		}
	}

}
