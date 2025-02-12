package Feb3;
import java.io.File;
	public class Task2
	{
		
		    public static void main(String[] args) {
		        File directory = new File("C:\\Users\\rushi\\eclipse-workspace\\Sample\\src\\Feb3");
		        if (!directory.exists() || !directory.isDirectory()) {
		            System.out.println("Error");
		            return;
		        }
		        for (File file : directory.listFiles()) 
		        {
		            System.out.println(file.getName());
		        }
		    
		
		}
	}
