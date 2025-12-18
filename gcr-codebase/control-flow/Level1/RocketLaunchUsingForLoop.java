import java.util.Scanner;
//Creating a class with name as  RocketLaunch 
public class RocketLaunchUsingForLoop{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//declaring variable and reading input from user
int counter;
System.out.println("Enter the counter value ");
counter=input.nextInt();

//for rocket launch while loop will run till the countDown value becomes 1
for(int countDown=counter; countDown>=1; countDown--){
System.out.println("The value of the counter is "+countDown);
}

System.out.println("Rocket Launched ");
input.close();
}
}

