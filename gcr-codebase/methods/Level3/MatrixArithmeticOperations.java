import java.util.Random;
//creating a class with name as MatrixArithmeticOperations
public class MatrixArithmeticOperations {

//Method to create a random matrix
static int[][] createRandomMatrix(int rows, int cols) {
int[][] matrix = new int[rows][cols];
Random rand = new Random();

for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix[i][j] = rand.nextInt(10); // values 0–9
}
}
return matrix;
}

// Method to display a matrix
static void displayMatrix(int[][] matrix) {
for (int[] row : matrix) {
for (int value : row) {
System.out.print(value + " ");
}
System.out.println();
}
}

// Method to add two matrices
static int[][] addMatrices(int[][] A, int[][] B) {
int rows = A.length;
int cols = A[0].length;
int[][] result = new int[rows][cols];

for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
result[i][j] = A[i][j] + B[i][j];
}
}
return result;
}

//Method to subtract two matrices
static int[][] subtractMatrices(int[][] A, int[][] B) {
int rows = A.length;
int cols = A[0].length;
int[][] result = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
result[i][j] = A[i][j] - B[i][j];
}
}
return result;
}

//Method to multiply two matrices
static int[][] multiplyMatrices(int[][] A, int[][] B) {
int rows = A.length;
int cols = B[0].length;
int common = B.length;

int[][] result = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
for (int k = 0; k < common; k++) {
result[i][j] += A[i][k] * B[k][j];
}
}
}
return result;
}

// Main method
public static void main(String[] args) {

//declaring and initializing variables and matrix
int rows = 2, cols = 3;
int rowsB = 3, colsB = 2;
int[][] A = createRandomMatrix(rows, cols);
int[][] B = createRandomMatrix(rows, cols);

//calling methods and displaying the result
System.out.println("Matrix A:");
displayMatrix(A);
System.out.println("\nMatrix B:");
displayMatrix(B);
System.out.println("\nAddition (A + B):");
displayMatrix(addMatrices(A, B));
System.out.println("\nSubtraction (A - B):");
displayMatrix(subtractMatrices(A, B));

//calling methods and storing the resultant matrix
int[][] C = createRandomMatrix(rowsB, colsB);
System.out.println("\nMatrix C:");
displayMatrix(C);
System.out.println("\nMultiplication (A x C):");
displayMatrix(multiplyMatrices(A, C));
}
}