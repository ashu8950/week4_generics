package exception_error.checked_exception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srcPath = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\exception_error\\checked_exception\\data";
		try {
			//reading the txt file
			BufferedReader reader = new BufferedReader(new FileReader(srcPath));
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
			//closing so that no leak of data 
			reader.close();
		}
		//file not found exception
		catch(IOException e) {
			System.out.println("File not found");
		}

	}

}
