package Feb3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Task8 {
	
	    public static void main(String[] args) {
	        String filePath = "C:\\Users\\rushi\\eclipse-workspace\\Sample\\src\\Feb3";
	        File file = new File(filePath);
	        
	        if (file.exists()) {
	            try (FileInputStream fis = new FileInputStream(file)) {
	                long fileSize = file.length();
	                byte[] byteArray = new byte[(int) fileSize];
	                int bytesRead = fis.read(byteArray);
	                System.out.println("File content read into byte array. Number of bytes read: " + bytesRead);
	            } catch (IOException e) {
	                System.out.println("Error reading the file: " + e.getMessage());
	            }
	        } else {
	            System.out.println("The file does not exist.");
	        }
	    }
	}

