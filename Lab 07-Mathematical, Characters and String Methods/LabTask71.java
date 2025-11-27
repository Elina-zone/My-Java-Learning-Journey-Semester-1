import java.util.Scanner;

public class LabTask71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //convert degrees to radian
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        final double EARTH_RADIUS = 6371.01;  //earth radius in km
        double distance = (EARTH_RADIUS * Math.acos((Math.sin(x1)) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        System.out.println("The Distance between the two point is: " + distance + "Km");
        input.close();
    }
}