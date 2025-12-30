import java.util.Scanner;
public class FitnessTracker{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

double []pushUpCount=new double[7];
double average;
int total=0;
String status;
for( int i=0;i<7;i++){
System.out.println("***************************************************");
System.out.println("Select the status of the day");
System.out.println("Case1:  working");
System.out.println("Case2:  Rest");
status=input.next();

if(status.equalsIgnoreCase("working")){
System.out.println("Enter the Push-up counts of day "+(i+1) );
pushUpCount[i]=input.nextInt();
total+= pushUpCount[i];
}else {
continue;
}
}
System.out.println("***************************************************");
System.out.println();
average = (total/7);
System.out.println("The average temperature is "+average);
System.out.println("The total push-up in this week is "+total);
input.close();
}
}