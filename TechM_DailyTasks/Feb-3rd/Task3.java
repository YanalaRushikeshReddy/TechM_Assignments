package Feb3;
import java.io.File;
	public class Task3
	{
		
		    public static void main(String[] args) {
		        File directory = new File("C:\\Users\\rushi\\eclipse-workspace\\Sample\\src\\Feb3");
		        if (directory.exists()) {
		            System.out.println("Yes");
		        }
		        else
		        {
		        	System.out.println("No");
		        }
		}
	}

