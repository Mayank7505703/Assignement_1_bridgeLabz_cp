package assignment4;

import java.util.Scanner;

public class practiceProb {
  public static void votingEligibility() {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
    }

    // 2. Positive/Negative/Zero & compare first and last
    public static void checkNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        for (int n : nums) {
            if (n > 0) {
                if (n % 2 == 0) System.out.println(n + " is positive and even");
                else System.out.println(n + " is positive and odd");
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println(n + " is zero");
            }
        }
        if (nums[0] == nums[4]) System.out.println("First and last elements are equal");
        else if (nums[0] > nums[4]) System.out.println("First element is greater than last");
        else System.out.println("First element is less than last");
    }

    // 3. Multiplication table of a number
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }
    }

    // 4. Store up to 10 numbers, stop on 0/negative
    public static void storeNumbers() {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            arr[index++] = num;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }
        System.out.println("\nSum = " + total);
    }

    // 5. Multiplication table of a number (6 to 9)
    public static void multiplication6to9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // 6. Mean height of football players
    public static void meanHeight() {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Mean height = " + mean);
    }

    // 7. Odd & even arrays
    public static void oddEvenArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Not a natural number");
            return;
        }
        int[] evens = new int[number / 2 + 1];
        int[] odds = new int[number / 2 + 1];
        int eIndex = 0, oIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) evens[eIndex++] = i;
            else odds[oIndex++] = i;
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oIndex; i++) System.out.print(odds[i] + " ");
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < eIndex; i++) System.out.print(evens[i] + " ");
        System.out.println();
    }

    // 8. Factors of a number
    public static void factors() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == factors.length) {
                    // resize
                    int[] temp = new int[factors.length * 2];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");
        System.out.println();
    }

    // 9. Copy 2D array to 1D
    public static void copy2DTo1D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int index = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                array[index++] = val;
            }
        }

        System.out.print("1D Array: ");
        for (int val : array) System.out.print(val + " ");
        System.out.println();
    }

    // 10. FizzBuzz
    public static void fizzBuzz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Enter a positive integer");
            return;
        }
        String[] results = new String[num + 1];
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) results[i] = "FizzBuzz";
            else if (i % 3 == 0) results[i] = "Fizz";
            else if (i % 5 == 0) results[i] = "Buzz";
            else results[i] = String.valueOf(i);
        }
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }

  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Level 1 Practice Programs ===");
            System.out.println("1. Voting Eligibility");
            System.out.println("2. Check Numbers (Positive/Negative/Zero)");
            System.out.println("3. Multiplication Table");
            System.out.println("4. Store Numbers & Sum");
            System.out.println("5. Multiplication Table (6 to 9)");
            System.out.println("6. Mean Height of Football Players");
            System.out.println("7. Odd and Even Arrays");
            System.out.println("8. Factors of a Number");
            System.out.println("9. Copy 2D Array to 1D");
            System.out.println("10. FizzBuzz");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> votingEligibility();
                case 2 -> checkNumbers();
                case 3 -> multiplicationTable();
                case 4 -> storeNumbers();
                case 5 -> multiplication6to9();
                case 6 -> meanHeight();
                case 7 -> oddEvenArrays();
                case 8 -> factors();
                case 9 -> copy2DTo1D();
                case 10 -> fizzBuzz();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
  }
}
