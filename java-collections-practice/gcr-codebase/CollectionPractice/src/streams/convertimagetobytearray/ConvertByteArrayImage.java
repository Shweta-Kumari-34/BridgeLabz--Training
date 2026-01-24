package streams.convertimagetobytearray;
import java.io.*;
public class ConvertByteArrayImage {

	    public static void main(String[] args) {

	        String sourceImage = "C:\\Users\\work3\\Downloads\\ObjectDiagram.jpeg";
	        String outputImage = "C:\\Users\\work3\\Downloads\\Sequence-Diagram.jpeg";
            
	        //Exception generating code is written here
	        try {
	            // Reading image file into byte array
	            FileInputStream fis = new FileInputStream(sourceImage);
	            ByteArrayOutputStream baos = new ByteArrayOutputStream();

	            int b;
	            while ((b = fis.read()) != -1) {
	                baos.write(b);
	            }

	            byte[] imageBytes = baos.toByteArray();

	            fis.close();
	            baos.close();

	            // Writing byte array back to new image file
	            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
	            FileOutputStream fos = new FileOutputStream(outputImage);

	            while ((b = bais.read()) != -1) {
	                fos.write(b);
	            }

	            bais.close();
	            fos.close();

	            System.out.println("Image copied successfully using ByteArray Streams.");

	        }
	        //prevent abnormal termination of program
	        catch (IOException e) {
	            System.out.println("Error Occur: " + e.getMessage());
	        }
	    }
	}


