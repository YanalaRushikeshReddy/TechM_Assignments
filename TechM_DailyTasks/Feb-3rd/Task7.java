package Feb3;

import java.io.File;

public class Task7 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rushi\\eclipse-workspace\\Sample\\src\\Feb3";
        
        File file = new File(filePath);
        
        if (file.exists()) {
            
            long fileSizeInBytes = file.length();
            
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;
            
            System.out.println("File size: ");
            System.out.println("Bytes: " + fileSizeInBytes);
            System.out.println("KB: " + fileSizeInKB);
            System.out.println("MB: " + fileSizeInMB);
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
