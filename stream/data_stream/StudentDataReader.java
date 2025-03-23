package stream.data_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StudentDataReader {

    // Reads student details from a binary file using DataInputStream
    public void readStudentData(String filePath) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Student Details:");
            System.out.println("Roll No: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        }
    }
}

