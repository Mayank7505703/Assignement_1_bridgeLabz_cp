package assignment3;

import java.util.*;

public class practiceProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uncomment one by one to test programs

        // oddEven(sc);
        // bonus(sc);
        // multiplicationTable(sc);
        // fizzBuzzFor(sc);
        // fizzBuzzWhile(sc);
        // youngestTallest(sc);
        // factorsFor(sc);
        // factorsWhile(sc);
        // greatestFactorFor(sc);
        // greatestFactorWhile(sc);
        // multiplesFor(sc);
        // multiplesWhile(sc);
        // powerFor(sc);
        // powerWhile(sc);

        sc.close();
    }

    // 1. Odd and Even numbers
    static void oddEven(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        } else {
            System.out.println("Enter a positive integer.");
        }
    }

    // 2. Bonus Calculation
    static void bonus(Scanner sc) {
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }

    // 3. Multiplication Table (6 to 9)
    static void multiplicationTable(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // 4. FizzBuzz using for loop
    static void fizzBuzzFor(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        }
    }

    // 5. FizzBuzz using while loop
    static void fizzBuzzWhile(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }

    // 6. Youngest & Tallest among friends
    static void youngestTallest(Scanner sc) {
        System.out.print("Enter Amar's age: ");
        int aAge = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        int aHeight = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int bAge = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int bHeight = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int cAge = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int cHeight = sc.nextInt();

        // youngest
        if (aAge < bAge && aAge < cAge)
            System.out.println("Amar is the youngest");
        else if (bAge < aAge && bAge < cAge)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        // tallest
        if (aHeight > bHeight && aHeight > cHeight)
            System.out.println("Amar is the tallest");
        else if (bHeight > aHeight && bHeight > cHeight)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }

    // 7. Factors using for loop
    static void factorsFor(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    System.out.println(i);
            }
        }
    }

    // 8. Factors using while loop
    static void factorsWhile(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i < n) {
            if (n % i == 0)
                System.out.println(i);
            i++;
        }
    }

    // 9. Greatest factor (for loop)
    static void greatestFactorFor(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int greatestFactor = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor: " + greatestFactor);
    }

    // 10. Greatest factor (while loop)
    static void greatestFactorWhile(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int greatestFactor = 1;
        int counter = n - 1;
        while (counter >= 1) {
            if (n % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor: " + greatestFactor);
    }

    // 11. Multiples below 100 using for loop
    static void multiplesFor(Scanner sc) {
        System.out.print("Enter a number (<100): ");
        int n = sc.nextInt();
        if (n > 0 && n < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % n == 0)
                    System.out.println(i);
            }
        }
    }

    // 12. Multiples below 100 using while loop
    static void multiplesWhile(Scanner sc) {
        System.out.print("Enter a number (<100): ");
        int n = sc.nextInt();
        if (n > 0 && n < 100) {
            int counter = 100;
            while (counter >= 1) {
                if (counter % n == 0)
                    System.out.println(counter);
                counter--;
            }
        }
    }

    // 13. Power using for loop
    static void powerFor(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int pow = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= num;
        }
        System.out.println("Result: " + result);
    }

    // 14. Power using while loop
    static void powerWhile(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int pow = sc.nextInt();
        int result = 1, counter = 0;
        while (counter < pow) {
            result *= num;
            counter++;
        }
        System.out.println("Result: " + result);
}
}
