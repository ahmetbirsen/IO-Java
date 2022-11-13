import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TesterTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//Write an integer to the file
			FileOutputStream fos = new FileOutputStream("ahmet.bin");
			
			int num = 0x31323334; //1234
			System.out.println("Our number is : "+num);
			//Big Endian
			fos.write(num>>24);
		
			fos.write(num>>16);
			
			fos.write(num>>8);
			
			fos.write(num);
			//****************String Yazma********************
			String str = "hello world";
			int strLength = str.length();
			short strlength = (short)strLength;
			fos.write(strlength);
			fos.write(strlength>>8);
			fos.write(str.getBytes());
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//Read an integer from the file
			FileInputStream fis = new FileInputStream("ahmet.bin");
			int num = 0 ;
			byte [] bytes = new byte[4];
			fis.read(bytes);
			System.out.println("*****************");
			
			num = num | bytes[0];
			num = num << 8;
			num = num | bytes[1];
			num = num << 8;
			num = num | bytes[2];
			num = num << 8;
			num = num | bytes[3];
			System.out.println("number is : " + num);
			
			//*************String okuma**********************
			short sLength = 0 ;
			byte[] bytel = new byte[2];
            fis.read(bytel);
            sLength = (short) (sLength | bytel[0]);
            sLength <<= 8;
            sLength = (short) (sLength | bytel[1]);
			
			byte[] bytes1 = new byte[sLength];
			fis.read(bytes1);
			String s = new String(bytes1, StandardCharsets. UTF_8);
			System.out.print(s);

			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
