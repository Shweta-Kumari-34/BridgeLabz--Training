package streams.filehandling;
import java.io.*;
public class ReadWriteTextFile {

	    public static void main(String[] args) {
            //source file path
	        String sourceFile = "D:\\java file\\YoungestAndTallestFriends.java";
	        //Destination file path
	        String destFile = "D:\\java file\\Student.java";
	        
            //try block for exception code
	        try {
	            FileInputStream fis = new FileInputStream(sourceFile);  
	            FileOutputStream fos = new FileOutputStream(destFile);  

	            int b;
	            while ((b = fis.read()) != -1) {  
	                fos.write(b);                
	            }

	            fis.close();  
	            fos.close();

	            System.out.println("File copied successfully");

	        }
	        //catch block that prevent abnormal termination of program
	        catch (FileNotFoundException e) {
	            System.out.println("Source file not found: " + sourceFile);
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}


