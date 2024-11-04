import java.util.Scanner;  // Import the Scanner class


public class TestTriangle {
    public static void main(String[] args) {

        // Create an object containing the side info
        Triangle defaultSideValues = new Triangle();


        // Test to see if the program reads from the Triangle class and calculates the values
        System.out.println("The triangle area is: " + defaultSideValues.getArea());

        // Have user enter side 1 double number
        System.out.print("Enter side 1: ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        double triangleSide1 = myObj.nextDouble();  // Get user input for side 1
        System.out.println(triangleSide1);

        // Have user enter side 2 double number
        System.out.print("Enter side 2: ");
        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        double triangleSide2 = myObj2.nextDouble();  // Get user input for side 2
        System.out.println(triangleSide2);

        // Have user enter side 3 double number
        System.out.print("Enter side 3: ");
        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        double triangleSide3 = myObj3.nextDouble();  // Get user input for side 3
        System.out.println(triangleSide3);

        Triangle myTriangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);

        System.out.println(myTriangle.toString());
        System.out.println("The perimeter is: " + myTriangle.getPerimeter());

        System.out.println("The area is: " + myTriangle.getArea());

        // Have user enter color
        System.out.print("Enter the color: ");
        Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
        String colorInfo = myObj4.nextLine();
        myTriangle.setColor(colorInfo);
        System.out.println("The color is: " + myTriangle.getColor());


        // Have user enter if the triangle is filled or not
        System.out.print("Is the triangle filled? Enter True Or False: ");
        Scanner myObj5 = new Scanner(System.in);  // Create a Scanner object
        Boolean filledStatus = myObj5.nextBoolean();
        myTriangle.setFilled(filledStatus);
        System.out.println("The filled status is: " + myTriangle.isFilled());








    }
}