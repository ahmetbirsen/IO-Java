import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class DataInput {
	File file ;
	public FileInputStream fis;
	public DataInput(FileInputStream fileOutputStream) {
		fis = fileOutputStream;
	}
	
	public int readInt() {
		int num = 0 ;
		try {
			
			
			byte [] bytes = new byte[4];
			fis.read(bytes);
			//Little Endian Notation
			num = num | bytes[0];
			num = num << 8;
			num = num | bytes[1];
			num = num << 8;
			num = num | bytes[2];
			num = num << 8;
			num = num | bytes[3];
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		return num;
	}
	
	public String readString() {
		String ourString = null ;
		try {
			
			short stringLength = 0 ;
			byte[] bytel = new byte[2];
            fis.read(bytel);
            stringLength = (short) (stringLength | bytel[0]);
            stringLength <<= 8;
            stringLength = (short) (stringLength | bytel[1]);
			
			byte[] bytes1 = new byte[stringLength];
			fis.read(bytes1);
			ourString = new String(bytes1, StandardCharsets. UTF_8);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ourString;
	}
public void close() {
		
		try {
			
			fis.close();
			System.out.println("File  closed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
