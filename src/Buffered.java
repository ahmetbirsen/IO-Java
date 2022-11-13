import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {

	//Filereader : Files are kept on external disk. On the other hand, Filereader reads a character and comes back, instead of reading all of this file, it reads one and comes back again. Therefore , we are experiencing performance loss .
	//Bufferreader : In Bufferreader, it goes to the file and reads it one by one until it see a backslash and put it its box (it has a box in its own method), thus increasing the performance.  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			Scanner scanner = new Scanner(new BufferedReader(new FileReader("dosya.txt")));
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("dosya.txt",true));
			String str = "Talha Küçük - Ýnþaat Mühendisi";
			writer.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
