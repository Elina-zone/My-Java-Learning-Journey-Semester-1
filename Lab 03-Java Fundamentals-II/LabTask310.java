import java.util.Scanner;
    public class LabTask310 {
	public static void main(String[] args) {
	// Display the header of the table using System.out.printf()
	int degrees = 30;
	double radians = Math.toRadians(degrees);
	double sin = Math.sin(radians);
	double cos = Math.cos(radians);
	double tan = Math.tan(radians);
	System.out.printf("Degrees\t Radians\t Sine\t Cosine\t Tangent\n ");
	System.out.printf("%d\t %f\t %f\t %f\t %f\t\n",degrees,radians,sin,cos,tan);
	// Display the Data of the table using System.out.printf()
	degrees = 60;
	radians = Math.toRadians(degrees);
	sin = Math.sin(radians);
	cos = Math.cos(radians);
	tan = Math.tan(radians);
	System.out.printf(" %d\t %f\t %f\t %f\t %f\t",degrees,radians,sin,cos,tan);
	}
    }