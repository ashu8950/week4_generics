package stream.read_large_file;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\read_large_file\\large"; // Replace with actual file path

        ErrorLogFilter filter = new ErrorLogFilter();

        try {
            filter.filterErrors(filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
