package stream.user_input;

import java.io.*;

public class UserInfoSaver {

    public static void main(String[] args) {
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));

            // Read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // File to save user info
            writer = new FileWriter("C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\user_input\\user_info");

            // Write to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("\nUser information saved successfully to user_info.txt");

        } catch (IOException e) {
            System.err.println("Error during I/O operation: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}

