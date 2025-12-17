import java.util.Scanner;
public class PerimeterOfRectangle{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
Double length,width,Perimeter;
System.out.println("Enter The Value of Length");
length=input.nextDouble();
System.out.println("Enter The Value of Width");
width=input.nextDouble();
Perimeter=2*(length+width);
System.out.println("The resultant Perimeter of the Rectangle is "+Perimeter);

}
}
