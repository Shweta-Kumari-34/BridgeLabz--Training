import java.util.Scanner;

public class BusRouteDistanceTracker{


public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double totalDistance = 0;
    boolean riding = true;
    int stopNumber = 1;
    
    while(riding){
        System.out.println("Stop " + stopNumber + " - Total distance so far: " + totalDistance + " km");
        System.out.print("Distance to next stop: ");
        double distance = scanner.nextDouble();
        totalDistance += distance;
        
        System.out.print("Do you want to get off at this stop? (yes/no): ");
        String response = scanner.next().toLowerCase();
        
        if(response.equals("yes")){
            riding = false;
            System.out.println("Thank you for riding! Total distance traveled: " + totalDistance + " km");
        } else {
            stopNumber++;
        }
    }
    
    scanner.close();
}
}