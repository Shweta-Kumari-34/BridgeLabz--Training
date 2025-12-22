import java.util.Scanner;
//Creating a class with name as TwoToOneArray
public class TwoToOneArray{
 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading input for number of rows and column
System.out.println("Enter number of rows ");
int rows =input.nextInt();
System.out.println("Enter number of column ");
int column =input.nextInt();

// Declare the 2D Array
int[][] matrix = new int[rows][column];

// reading the elements of the 2D Array matrix
System.out.println("Enter the elements of the matrix ");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < column; j++) {
matrix[i][j] = input.nextInt();
}
}
//copying 2D to 1D array
int []array = new int [rows * column ];
int index =0;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < column; j++) {
array[index] = matrix[i][j];
index ++;
}
}

//Displaying the 1D array elements
System.out.println(" Elements of 1D array are ");
for (int i = 0; i < array.length; i++) {
System.out.println( array[i] + " ");
}
input. close();
}
}