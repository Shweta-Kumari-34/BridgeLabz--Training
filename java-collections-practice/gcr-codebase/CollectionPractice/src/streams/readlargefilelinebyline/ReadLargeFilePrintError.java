package streams.readlargefilelinebyline;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadLargeFilePrintError {

	    public static void main(String[] args) {

	        String filePath = "D:\\java file\\ExceptionHandling.txt";   

	        try {
	            BufferedReader br = new BufferedReader(new FileReader(filePath));
	            String line;
                
	            //read file and print that line containing (error) word
	            while ((line = br.readLine()) != null) {   
	                if (line.toLowerCase().contains("error")) {
	                    System.out.println(line);          
	                }
	            }

	            br.close();
            
	            // block that prevent abnormal termination of program
	        } catch (IOException e) {
	            System.out.println("File reading error");
	        }
	    }
	}

