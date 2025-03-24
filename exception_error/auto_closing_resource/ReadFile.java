package exception_error.auto_closing_resource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srcPath = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\exception_error\\checked_exception\\data";
		 // Try-with-resources block
        try (BufferedReader reader = new BufferedReader(new FileReader(srcPath))) {
            // Read and print the first line
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            // Handle file not found or read error
            System.out.println("Error reading file");
        }

	}

}
