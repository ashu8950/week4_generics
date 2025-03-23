package stream.data_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentDataWriter {

    // Writes student details to a binary file using DataOutputStream
    public void writeStudentData(String filePath, int roll, String name, double gpa) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
        }
    }
}

