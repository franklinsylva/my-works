//write a java program to create a class constant  with a static variable 
    //pi create a method to calculate the area of a circle given its a radius
    // inputed by a user


    // write a java program and create a class called bank account with variable balance and interest rate
    //provide static methods to get and set the static variables create several bank account object and print their details along with static variables


    import java.util.Scanner;


public class Constant{
    static final double pi = 3.142;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius");
        int radius = scan.nextInt();
        Constant.area(radius);
    }
    public static void area (int radius){
        double areaOfCircle = pi * radius*radius;
        System.out.printf("the area of the circle is %.2f",areaOfCircle);
    }
}