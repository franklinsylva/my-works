import java.util.Scanner;

public class CircleArea {
    // Define a constant static variable for PI
    public static final double PI = 3.14159;

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = calculateArea(radius);

        // Output the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
