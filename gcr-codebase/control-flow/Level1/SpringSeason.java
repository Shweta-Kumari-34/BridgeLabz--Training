//Creating a class with name as SpringSeason
public class SpringSeason{
public static void main(String[]args){

//reading input from command line 
int month =Integer.parseInt(args[0]);
int day=Integer.parseInt(args[1]);

//checking conditions and displaying result
boolean isSpring=(month==3 && day>=20) ||(month ==4) ||(month ==5)||(month ==6 && day<=20);
if(isSpring){
System.out.println("Its a Spring Season ");
}
else {
System.out.println("Not a Spring Season ");
}
}
}