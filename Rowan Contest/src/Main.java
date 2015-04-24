import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		final String FILE_NAME = "src/test.txt";
		File f = new File(FILE_NAME);
		Scanner fScan, lScan;
		String line;
		
		fScan = new Scanner(f);
		
		while (fScan.hasNextLine())
		{
			line = fScan.nextLine();
			System.out.println(line);
		}
		
		
		
		
		fScan.close();
		

	}

}
