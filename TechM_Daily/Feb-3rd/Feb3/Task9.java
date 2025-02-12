package Feb3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Task9 {
	
	    public static void main(String[] args) {
	        String filePath = "C:\\Users\\rushi\\eclipse-workspace\\Sample\\src\\Feb3";
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	        }
	    }
	}

