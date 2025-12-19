import java.util.Scanner;
//Creating a class with name as StudentVote
public class StudentVote{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int[] studentAge = new int[10];

//Take student age
System.out.println("Enter the student age");
for (int i = 0; i < 10 ; i++) {
studentAge[i] = input.nextInt();
}

//check voting eligibility as age>=18
for(int i=0;i<10;i++){
if( studentAge[i]>=18){
System.out.println("The student with the age "+ studentAge[i] +" can vote");
}
else if( studentAge[i]<0){
System.out.println("Invalid age");
}
else  {
System.out.println("The student with the age "+ studentAge[i] +" cannot vote");
}
}
input.close();
}
}




           


