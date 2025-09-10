package assignment2;

import java.util.Scanner;

public class practiceProblem2 {
  public static void main(String[] args) {
     String name = "Sam";
     
        // Create a int variable rollNumber and assign value 1
        int rollNumber = 1;
     
        // Create a double variable percentMarks and assign value 99.99
        double percentMarks = 99.99;
     
        // Create a char variable result and assign value 'P' for pass
        char result = 'P';
        
        // Display the result
        System.out.println("Displaying Result:\n" +name+ " with Roll Number " +
rollNumber+ " has Scored " +percentMarks+ 
"% Marks and Result is " +result);


//

  
      String travellerName = "Eric";
      
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
      String fromCity = "Chennai", viaCity = "Velore", toCity = "Bangalore";

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
      double distanceFromToVia = 156.6;

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
      int timeFromToVia = 4 * 60 + 4;

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
      double distanceViaToFinalCity = 211.8;

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
      int timeViaToFinalCity = 4 * 60 + 25;

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Print the travel details
      System.out.println("The Total Distance travelled by " + travellerName + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");

      

      ageOfHarry();
        averagePCM();
        kmToMilesFixed();
        profitAndLoss();
        pensDistribution();
        universityDiscountFixed();
        volumeOfEarth();
        kmToMilesInput();
        universityDiscountInput();
        heightConversion();
        basicCalculator();
        areaOfTriangle();
        squareSideFromPerimeter();
        distanceConversionFeet();
        purchasePrice();
        maxHandshakes();
    }

    // 1. Age of Harry
    static void ageOfHarry() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }

    // 2. Average PCM
    static void averagePCM() {
        int maths = 94, physics = 95, chemistry = 96;
        double avg = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + avg);
    }

    // 3. Convert 10.8 km to miles
    static void kmToMilesFixed() {
        double km = 10.8;
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }

    // 4. Profit and Loss
    static void profitAndLoss() {
        int cp = 129, sp = 191;
        int profit = sp - cp;
        double profitPercent = (profit * 100.0) / cp;
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }

    // 5. Pens distribution
    static void pensDistribution() {
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
    }

    // 6. University Discount (Fixed)
    static void universityDiscountFixed() {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    // 7. Volume of Earth
    static void volumeOfEarth() {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }

    // 8. KM to Miles (Input)
    static void kmToMilesInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }

    // 9. University Discount (Input)
    static void universityDiscountInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter Discount Percent: ");
        double discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    // 10. Height Conversion
    static void heightConversion() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double cm = input.nextDouble();
        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
    }

    // 11. Basic Calculator
    static void basicCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }

    // 12. Area of Triangle
    static void areaOfTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of triangle is " + area + " square units");
    }

    // 13. Side of Square
    static void squareSideFromPerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }

    // 14. Distance Conversion from Feet
    static void distanceConversionFeet() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance " + feet + " feet is " + yards + " yards and " + miles + " miles");
    }

    // 15. Purchase Price
    static void purchasePrice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }

    // 16. Maximum Handshakes
    static void maxHandshakes() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);

  }
}
