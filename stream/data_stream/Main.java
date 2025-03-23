package stream.data_stream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filePath = "student_data.dat";

        StudentDataWriter writer = new StudentDataWriter();
        StudentDataReader reader = new StudentDataReader();

        try {
            writer.writeStudentData(filePath, 101, "Alice", 3.85);
            reader.readStudentData(filePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
