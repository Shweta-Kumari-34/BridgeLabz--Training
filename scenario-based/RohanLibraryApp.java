import java.util.Scanner;
public class RohanLibraryApp{
public static void main(String []args){
Scanner input=new Scanner(System.in);

int []returnDate =new int[5];
int []dueDate =new int[5];
double fine=0;

System.out.println("***************************************************");
for(int i=0;i<5;i++){
System.out.println("Enter the return date of book "+ (i+1));
returnDate[i]=input.nextInt();
System.out.println("Enter the due date of book "+ (i+1));
dueDate[i]=input.nextInt();
}

for( int i=0;i<5;i++){
if( returnDate[i] > dueDate[i]){
fine+=(returnDate[i] - dueDate[i])*5;
}
}
System.out.println("***************************************************");
System.out.println();
System.out.println("The calculated fine is "+fine);

input.close();
}
}


