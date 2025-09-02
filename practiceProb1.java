package assignment3;

import java.util.*;

public class practiceProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {   // Java uses true, not True
            System.out.println("\n===== Level 1 Practice Programs =====");
            System.out.println("1. Check divisible by 5");
            System.out.println("2. Check if first number is smallest of 3");
            System.out.println("3. Check which number is largest of 3");
            System.out.println("4. Sum of n Natural Numbers (formula check)");
            System.out.println("5. Voting Eligibility");
            System.out.println("6. Positive / Negative / Zero");
            System.out.println("7. Spring Season Check");
            System.out.println("8. Countdown (while loop)");
            System.out.println("9. Countdown (for loop)");
            System.out.println("10. Sum until 0");
            System.out.println("11. Sum until 0 or negative");
            System.out.println("12. Sum of n Natural Numbers (while + formula)");
            System.out.println("13. Sum of n Natural Numbers (for + formula)");
            System.out.println("14. Factorial (while loop)");
            System.out.println("15. Factorial (for loop)");
            System.out.println("16. Odd & Even Numbers up to n");
            System.out.println("17. Employee Bonus");
            System.out.println("18. Multiplication Table (6 to 9)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number: ");
                    int number = sc.nextInt();
                    System.out.println("Is " + number + " divisible by 5? " + (number % 5 == 0));
                }
                case 2 -> {
                    System.out.print("Enter 3 numbers: ");
                    int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
                    System.out.println("Is first number the smallest? " + (n1 < n2 && n1 < n3));
                }
                case 3 -> {
                    System.out.print("Enter 3 numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                    System.out.println("Is first largest? " + (a > b && a > c));
                    System.out.println("Is second largest? " + (b > a && b > c));
                    System.out.println("Is third largest? " + (c > a && c > b));
                }
                case 4 -> {
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    if (n > 0) {
                        int sum = n * (n + 1) / 2;
                        System.out.println("Sum of " + n + " natural numbers = " + sum);
                    } else {
                        System.out.println("Not a natural number");
                    }
                }
                case 5 -> {
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    if (age >= 18)
                        System.out.println("Age " + age + " can vote");
                    else
                        System.out.println("Age " + age + " cannot vote");
                }
                case 6 -> {
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    if (num > 0) System.out.println("Positive");
                    else if (num < 0) System.out.println("Negative");
                    else System.out.println("Zero");
                }
                case 7 -> {
                    System.out.print("Enter month and day: ");
                    int month = sc.nextInt(), day = sc.nextInt();
                    boolean spring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
                    System.out.println(spring ? "Its a Spring Season" : "Not a Spring Season");
                }
                case 8 -> {
                    System.out.print("Enter countdown start: ");
                    int counter = sc.nextInt();
                    while (counter >= 1) {
                        System.out.println(counter);
                        counter--;
                    }
                    System.out.println("Liftoff!");
                }
                case 9 -> {
                    System.out.print("Enter countdown start: ");
                    int counter = sc.nextInt();
                    for (int i = counter; i >= 1; i--) {
                        System.out.println(i);
                    }
                    System.out.println("Liftoff!");
                }
                case 10 -> {
                    double total = 0;
                    System.out.println("Enter numbers (0 to stop): ");
                    while (true) {
                        double num = sc.nextDouble();
                        if (num == 0) break;
                        total += num;
                    }
                    System.out.println("Total sum = " + total);
                }
                case 11 -> {
                    double total = 0;
                    System.out.println("Enter numbers (0 or negative to stop): ");
                    while (true) {
                        double num = sc.nextDouble();
                        if (num <= 0) break;
                        total += num;
                    }
                    System.out.println("Total sum = " + total);
                }
                case 12 -> {
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    if (n > 0) {
                        int sumFormula = n * (n + 1) / 2;
                        int sumLoop = 0, i = 1;
                        while (i <= n) sumLoop += i++;
                        System.out.println("Formula sum = " + sumFormula + ", While sum = " + sumLoop);
                    } else System.out.println("Not a natural number");
                }
                case 13 -> {
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    if (n > 0) {
                        int sumFormula = n * (n + 1) / 2;
                        int sumLoop = 0;
                        for (int i = 1; i <= n; i++) sumLoop += i;
                        System.out.println("Formula sum = " + sumFormula + ", For sum = " + sumLoop);
                    } else System.out.println("Not a natural number");
                }
                case 14 -> {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    if (n >= 0) {
                        long fact = 1;
                        int i = 1;
                        while (i <= n) fact *= i++;
                        System.out.println("Factorial = " + fact);
                    } else System.out.println("Not positive");
                }
                case 15 -> {
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    if (n >= 0) {
                        long fact = 1;
                        for (int i = 1; i <= n; i++) fact *= i;
                        System.out.println("Factorial = " + fact);
                    } else System.out.println("Not positive");
                }
                case 16 -> {
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    if (n > 0) {
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 == 0) System.out.println(i + " Even");
                            else System.out.println(i + " Odd");
                        }
                    }
                }
                case 17 -> {
                    System.out.print("Enter salary and years of service: ");
                    double salary = sc.nextDouble();
                    int years = sc.nextInt();
                    if (years > 5) {
                        double bonus = salary * 0.05;
                        System.out.println("Bonus = " + bonus);
                    } else System.out.println("No bonus");
                }
                case 18 -> {
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    for (int i = 6; i <= 9; i++) {
                        System.out.println(num + " * " + i + " = " + (num * i));
                    }
                }
                case 0 -> {
                    System.out.println("Exiting... Bye!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
