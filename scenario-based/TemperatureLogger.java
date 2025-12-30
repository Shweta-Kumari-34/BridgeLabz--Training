import java.util.Scanner;
public class TemperatureLogger{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

double []recordTemp=new double[7];
double averageTemp, maxTemp;
maxTemp=0.0;
double total=0;
System.out.println("***************************************************");
for( int i=0;i<7;i++){
System.out.println("Enter the temperature of day "+(i+1)+  " in Degree Celsius");
recordTemp[i]=input.nextDouble();
total+= recordTemp[i];
if( recordTemp[i]>maxTemp){
maxTemp=recordTemp[i];
}
}
System.out.println("***************************************************");
System.out.println();
averageTemp = (total/7);
System.out.println("The average temperature is "+averageTemp+" °C");
System.out.println("The maximum temperature recorded is "+maxTemp+" °C in this week ");
input.close();
}
}