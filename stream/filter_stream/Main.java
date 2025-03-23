package stream.filter_stream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\filter_stream\\input";
        String outputFile = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\filter_stream\\output";

        UpperToLowerConverter converter = new UpperToLowerConverter();

        try {
            converter.convertToLowercase(inputFile, outputFile);
            System.out.println("Conversion completed.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
