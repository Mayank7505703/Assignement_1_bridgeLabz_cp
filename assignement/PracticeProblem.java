package assignement;
import java.util.*;

public class PracticeProblem {

    // 1. Welcome to Bridgelabz
    public static void welcomeMessage() {
        System.out.println("Welcome to Bridgelabz!");
    }

    // 2. Add Two Numbers
    public static void addTwoNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum = " + (num1 + num2));
    }

    // 3. Celsius to Fahrenheit
    public static void celsiusToFahrenheit(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }

    // 4. Area of Circle
    public static void areaOfCircle(Scanner sc) {
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    // 5. Volume of Cylinder
    public static void volumeOfCylinder(Scanner sc) {
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume);
    }

    // 6. Simple Interest
    public static void simpleInterest(Scanner sc) {
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }

    // 7. Perimeter of Rectangle
    public static void perimeterOfRectangle(Scanner sc) {
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    // 8. Power Calculation
    public static void powerCalculation(Scanner sc) {
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to " + exponent + " = " + result);
    }

    // 9. Average of Three Numbers
    public static void averageOfThree(Scanner sc) {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + avg);
    }

    // 10. Kilometers to Miles
    public static void kmToMiles(Scanner sc) {
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in miles = " + miles);
    }

    // Main Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Welcome to Bridgelabz");
            System.out.println("2. Add Two Numbers");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("4. Area of Circle");
            System.out.println("5. Volume of Cylinder");
            System.out.println("6. Simple Interest");
            System.out.println("7. Perimeter of Rectangle");
            System.out.println("8. Power Calculation");
            System.out.println("9. Average of Three Numbers");
            System.out.println("10. Kilometers to Miles");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> welcomeMessage();
                case 2 -> addTwoNumbers(sc);
                case 3 -> celsiusToFahrenheit(sc);
                case 4 -> areaOfCircle(sc);
                case 5 -> volumeOfCylinder(sc);
                case 6 -> simpleInterest(sc);
                case 7 -> perimeterOfRectangle(sc);
                case 8 -> powerCalculation(sc);
                case 9 -> averageOfThree(sc);
                case 10 -> kmToMiles(sc);
                case 0 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice, try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
