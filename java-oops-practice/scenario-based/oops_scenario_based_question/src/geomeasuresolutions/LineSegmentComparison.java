package geomeasuresolutions;

public class LineSegmentComparison {
	//constructors
private double x1, y1, x2, y2, a1, b1, a2, b2;
LineSegmentComparison(double x1, double y1, double x2, double y2, double a1, double b1, double a2, double b2 ){
	this.x1=x1;
	this.y1=y1;
	this.x2=x2;
	this.y2=y2;
	this.a1=a1;
	this.b1=b1;
	this.a2=a2;
	this.b2=b2;
	
}
//calculate the length of the two line
public static double calculateLength1(double x1, double y1, double x2, double y2) {
	double length1 = Math.sqrt(
             Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
     );
	return length1;

}

public static double calculateLength2(double a1, double b1, double a2, double b2) {
	double length2 = Math.sqrt(
            Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2)
    );
	return length2;
	
}

//Print the result after comparison
public static void lineComparision(double length1, double length2) {
System.out.println("******************Result Out******************");
if(length1>length2) {
System.out.println("First Line is longer");
}
else if(length2>length1) {
	System.out.println("Second Line is longer");
}
else {
	System.out.println("Both Line is of equal length");
}
}



}
