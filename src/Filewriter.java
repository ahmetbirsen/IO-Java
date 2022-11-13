import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null; //finaly bloðunda tanýmladýðýmýz için null baþlattýk.
		
		try {
			writer = new FileWriter("dosya.txt"); // Dosyamýzý oluþturduk(dosya.txt,true) yaparsak var olan dosya verilerinin yanýna yazar
			// Dosyaya yazdýrýyoruz
			writer.write("Ahmet Metin Birsen \n"); 
			writer.write("-Istanbul Aydýn Üniversitesi \n");
			writer.write("Enes Birsen \n"); 
			writer.write("-Zonguldak Üniversitesi \n");
			writer.write("Emrullah  Bozkurt \n"); 
			writer.write("-Istanbul Teknik Üniversitesi \n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Dosya açýlýrken ioException oluþtu");
		}
		
		finally {
			if(writer != null){//Dosya gerçekten açýldýmý yoksa null mu kaldý
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Dosya kapatýlýrken hata oluþtu");
				}
			}
		}
	}

}
