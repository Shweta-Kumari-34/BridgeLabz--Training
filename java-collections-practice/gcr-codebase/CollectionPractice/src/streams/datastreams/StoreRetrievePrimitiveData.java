package streams.datastreams;

import java.io.*;

public class StoreRetrievePrimitiveData {

	public static void main(String[] args) {

		String fileName = "D:\\java file\\LargestSecondLargest.java";

		// Writing student data
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));

			dos.writeInt(101); // roll number
			dos.writeUTF("Surbhi"); // name
			dos.writeDouble(8.5); // GPA

			dos.close();
			System.out.println("Student data written successfully.");

		} catch (IOException e) {
			System.out.println("Write Error Occur: " + e.getMessage());
		}

		// Reading student data
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(fileName));

			int rollNo = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();

			dis.close();
           
			System.out.println("*************Student Details***************");
			System.out.println("Roll No: " + rollNo);
			System.out.println("Name: " + name);
			System.out.println("GPA: " + gpa);
            System.out.println("*********************************************");
		} catch (IOException e) {
			System.out.println("Read Error Occur: " + e.getMessage());
		}
	}
}
