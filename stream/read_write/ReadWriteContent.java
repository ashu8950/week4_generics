package stream.read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteContent {
	public static void main(String[]args) {
		String src = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\read_write\\read.text";
		String dest = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\read_write\\write.text";
		
		 File srcFile = new File(src);
		 File destFile = new File(dest);
		 
		 if (!srcFile.exists()) {
	            System.out.println("Source file does not exist: " + src);
	            return;
	        }
		 //read from file and write to another file
		 try (FileInputStream fis = new FileInputStream(srcFile);
				 FileOutputStream fos = new FileOutputStream(destFile)){
			 byte[] buffer = new byte[1024];
			 int byteRead;
			 while ((byteRead = fis.read(buffer)) != -1) {
	                fos.write(buffer, 0, byteRead);
	            }

	            System.out.println("File copied successfully to: " + dest);

			 
		 }
		 catch (IOException e) {
	            System.out.println("An error occurred during file operation: " + e.getMessage());
	            e.printStackTrace();
	        }
	}
}
