import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null; //finaly blo�unda tan�mlad���m�z i�in null ba�latt�k.
		
		try {
			writer = new FileWriter("dosya.txt"); // Dosyam�z� olu�turduk(dosya.txt,true) yaparsak var olan dosya verilerinin yan�na yazar
			// Dosyaya yazd�r�yoruz
			writer.write("Ahmet Metin Birsen \n"); 
			writer.write("-Istanbul Ayd�n �niversitesi \n");
			writer.write("Enes Birsen \n"); 
			writer.write("-Zonguldak �niversitesi \n");
			writer.write("Emrullah  Bozkurt \n"); 
			writer.write("-Istanbul Teknik �niversitesi \n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Dosya a��l�rken ioException olu�tu");
		}
		
		finally {
			if(writer != null){//Dosya ger�ekten a��ld�m� yoksa null mu kald�
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Dosya kapat�l�rken hata olu�tu");
				}
			}
		}
	}

}
