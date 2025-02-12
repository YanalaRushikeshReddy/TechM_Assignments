package Feb3;
import java.io.File;
public class Task5 {
	

	    public static void main(String[] args) {
	        String filePath = "C:\\Users\\rushi\\eclipse-workspace\\Sample\\src\\Feb3";
	        
	        File file = new File(filePath);
	        
	        if (file.exists()) {
	            long lastModified = file.lastModified();
	            
	            java.util.Date date = new java.util.Date(lastModified);
	            
	            System.out.println("Last modified date of the file: " + date);
	        } else {
	            System.out.println("The file does not exist.");
	        }
	    }
}