import java.util.Scanner;
//creating a clas with name as  AttendanceSystem
//to track the School Bus Attendance of student
public class  AttendanceSystem{
public static void main(String[]args){
Scanner input= new Scanner (System.in);

String []names=new String[10];
System.out.println("Enter the student names ");

for( int i=0;i<10;i++){
names[i]=input.next();
}

int count=1;
int presentCount=0;
int absentCount=0;
String status;

for(String name : names){
System.out.println("Enter the attendance status of "+name );
System.out.println("Case1: Present");
System.out.println("Case2:  Absent");
count++;

status=input.next();

if(status.equalsIgnoreCase("Present")){
presentCount++;
}
else if(status.equalsIgnoreCase("Absent")){
absentCount++;
}
else {
System.out.println("please enter valid status of student attendance");
}
}

System.out.println("Total present count is " + presentCount);
System.out.println("Total absent count is " + absentCount);
input.close();
}
}


