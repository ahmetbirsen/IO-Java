import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
			
		try {
			DataOutput dOut = new DataOutput(new FileOutputStream("project.bin"));
			DataInput dInpt = new DataInput(new FileInputStream("project.bin"));
			dOut.writeInt(0x31323334);
			dOut.writeString("hello world");
			dOut.close();
			//**********************************///
			System.out.println("Readed integer : "+dInpt.readInt());
			System.out.println("Readed string  :"+dInpt.readString());
			dInpt.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
