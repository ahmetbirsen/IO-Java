import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {

	//We will open a file and write our data as byte. 
	public static void main(String[] args) {
		FileOutputStream fos = null ;
		File file = new File("dosya.txt"); // dosya.txt created file.
		try {
			fos = new FileOutputStream(file);// We sent the referance . But when we modify data it writes again an againg. But if use that method which is below it writes near it.
			//fos = new FileOutputStream(file,true); --> Writes next to existing data . 
			fos.write(65);//Writes value to file.(Write as int)It defines as a ASCI char . 
			fos.write(74);
			byte [] array ={101,75,66,68};//We are creating byte array and but it that bytes . 
			// then write to the file . (It compares that which value assigned before in ASCI table
			fos.write(array);
			String s = "Ahmet Birsen";//Lets convert string to byte
			byte[] sArray = s.getBytes();//
			fos.write(sArray);
			//***If we want to write data to file , we should convert it all as a byte. .
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FileNotFoundException Oluþtu");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("There is error while writing");
		}
		finally{
			try {
				fos.close();//We should close the file whether there is error or not .
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("There is error while closing the file");
			} 
		}
	}

}
