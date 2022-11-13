import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File obj = new File("ahmet.txt");
			FileOutputStream fos = new FileOutputStream(obj);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(2);
			dos.writeUTF("ahmet");
			dos.writeBoolean(true);
			fos.close();
			dos.close();
			
			FileInputStream fis = new FileInputStream(obj);
			DataInputStream dis = new DataInputStream(fis);
			int data = dis.readInt();
			String name = dis.readUTF();
			boolean bool = dis.readBoolean();
			System.out.println(data);
			System.out.println(name);
			System.out.print(bool);
			fis.close();
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
