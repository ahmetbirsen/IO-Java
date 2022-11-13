import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Filereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner (new FileReader("Studentinformation.txt"));//Scanner object reads datas from file.
			while(scanner.hasNextLine()){  //Is there any line for read ??
					System.out.println("Readed line : "+ scanner.useDelimiter("-"));//Read until see the backslash
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
