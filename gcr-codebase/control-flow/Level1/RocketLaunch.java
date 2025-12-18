import java.util.Scanner;
//Creating a class with name as  RocketLaunch 
public class RocketLaunch{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//declaring variable and reading input from user
int counter;
System.out.println("Enter the counter value ");
counter=input.nextInt();

//for rocket launch while loop will run till the counter value becomes 1
while(counter>=1){
System.out.println("The value of the counter is "+counter);
counter--;
}

System.out.println("Rocket Launched ");
input.close();
}
}



