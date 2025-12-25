import java.util.Scanner;
//Creating a class with name as CollinearPoints
public class CollinearPoints {

// Method using slope formula
static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
//calculating using cross multiplication
return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
}

// Method using area of triangle formula
static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {

double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
return area == 0;
    }

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

//Reading input points
System.out.println("Enter x1 and  y1 value: ");
int x1 = input.nextInt();
int y1 = input.nextInt();
System.out.println("Enter x2 and y2 value: ");
int x2 = input.nextInt();
int y2 = input.nextInt();
System.out.println("Enter x3 and y3 value: ");
int x3 = input.nextInt();
int y3 = input.nextInt();

// Check using slope method and displaying the result
if (isCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
System.out.println("Points are collinear using Slope Method");
}
else{
System.out.println("Points are NOT collinear using Slope Method");
}

// Check using area method and dispalying the result
if (isCollinearByArea(x1, y1, x2, y2, x3, y3)) {
System.out.println("Points are collinear using Area Method");
} else {
System.out.println("Points are NOT collinear using Area Method");
}

input.close();
}
}