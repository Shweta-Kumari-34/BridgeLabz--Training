import java.util.Random;
//creating a class with name as MatrixManipulationOperations
public class MatrixManipulationOperations {

//Create random matrix
public static int[][] createRandomMatrix(int rows, int cols) {
Random r = new Random();
int[][] m = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
m[i][j] = r.nextInt(10); // 0 to 9
}
}
return m;
}

// Display Matrix (for int type)
public static void displayMatrix(int[][] m) {
for (int i = 0; i < m.length; i++) {
for (int j = 0; j < m[i].length; j++) {
System.out.print(m[i][j] + " ");
}
System.out.println();
}
System.out.println();
}

// Display Matrix (for double type - inverse result)
public static void displayMatrix(double[][] m) {
for (int i = 0; i < m.length; i++) {
for (int j = 0; j < m[i].length; j++) {
System.out.printf("%.2f ", m[i][j]); // formatted output
}
System.out.println();
}
System.out.println();
}

//calculating the Transpose of matrix
public static int[][] transpose(int[][] m) {
int[][] t = new int[m[0].length][m.length];
for (int i = 0; i < m.length; i++) {
for (int j = 0; j < m[0].length; j++) {
t[j][i] = m[i][j];
}
}
return t;
}

//calculating the Determinant of 2x2
static int determinant2x2(int[][] m) {
return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
}

//calculating the Determinant of 3x3
static int determinant3x3(int[][] m) {
return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
- m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
+ m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
}

// calculating the Inverse of 2x2
static double[][] inverse2x2(int[][] m) {
int det = determinant2x2(m);
if (det == 0) {
System.out.println("Inverse not possible (Determinant = 0)");
return null;
}

double[][] inv = new double[2][2];
inv[0][0] =  m[1][1] / (double) det;
inv[0][1] = -m[0][1] / (double) det;
inv[1][0] = -m[1][0] / (double) det;
inv[1][1] =  m[0][0] / (double) det;

return inv;
}

// calculating the Inverse of 3x3
static double[][] inverse3x3(int[][] m) {
double det = determinant3x3(m);
if (det == 0) {
System.out.println("Inverse not possible (Determinant = 0)");
return null;
}

double[][] inv = new double[3][3];

inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

return inv;
}


public static void main(String[] args) {
//declaring and initializing the matrix
int[][] M = {{1, 2, 3},{7, 8, 9},{5, 6, 4}};

//calling the respective method and displaying the result
System.out.println("Matrix M:");
displayMatrix(M);
System.out.println("Transpose of Matrix M:");
displayMatrix(transpose(M));
System.out.println("Determinant of M:");
System.out.println(determinant3x3(M));
System.out.println("\nInverse of M:");
double[][] inv = inverse3x3(M);

if (inv != null)
displayMatrix(inv);
}
}
