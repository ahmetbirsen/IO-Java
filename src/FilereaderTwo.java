import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FilereaderTwo {
	private String name;
	private String advisor;
	private int type; 
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdvisor() {
		return advisor;
	}


	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FilereaderTwo fl = new FilereaderTwo();
			Scanner scanner = new Scanner (new FileReader("Studentinformation.txt"));//Scanner objesi dosyadaki verileri okuyacak
			ArrayList<String> arraylist = new ArrayList<String>();
			scanner.useDelimiter("-");
			while(scanner.hasNext()) {
				
				arraylist.add(scanner.next());
				//System.out.println(scanner.next());
				//fl.setType(scanner.nextInt());
			}
			scanner.close();
			//System.out.println(" : " + fl.getType());
			//System.out.println("////////////////////////////////");
			//System.out.println(arraylist.get(4));
			//System.out.println("/////////////////////////////////");
			for(String x : arraylist) {
			System.out.println(x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
