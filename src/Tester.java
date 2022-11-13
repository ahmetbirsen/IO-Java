import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tester {
	
	public static void readText(String string) {
		DataInputStream dis;
		;
		try {
			dis = new DataInputStream (new FileInputStream(string));
			String first = dis.readUTF();
			String second = dis.readUTF();
			String third = dis.readUTF();
			System.out.println(first);
			System.out.println(second);
			System.out.println(third);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream f;
		
		try {
			f = new FileOutputStream("tester.txt");
			DataOutputStream dos = new DataOutputStream (f);
			dos.writeUTF("Course : Programming Lab");
			dos.writeUTF("Classing duration is normally 1 hour, but sometimes finishes early");
			dos.writeUTF("Today is our exam.");
			
			dos.flush();
			dos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		readText("tester.txt");
	}

}
