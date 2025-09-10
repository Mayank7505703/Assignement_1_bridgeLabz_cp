package assignment4;

import java.util.Scanner;

public class practiceProb2 {
  static Scanner sc = new Scanner(System.in);

    // 1. Bonus Calculation
    public static void employeeBonus() {
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            years[i] = sc.nextDouble();
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Try again.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5)
                bonus[i] = 0.05 * salary[i];
            else
                bonus[i] = 0.02 * salary[i];
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    // 2. Youngest and Tallest
    public static void youngestAndTallest() {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }

        int minAgeIdx = 0, maxHeightIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIdx]) minAgeIdx = i;
            if (height[i] > height[maxHeightIdx]) maxHeightIdx = i;
        }

        System.out.println("Youngest: " + names[minAgeIdx]);
        System.out.println("Tallest: " + names[maxHeightIdx]);
    }

    // 3. Largest and 2nd Largest Digit (Fixed size array)
    public static void largestDigitsFixed() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num > 0 && index < maxDigit) {
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    // 4. Largest and 2nd Largest Digit (Dynamic array)
    public static void largestDigitsDynamic() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) temp[i] = digits[i];
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    // 5. Reverse Number
    public static void reverseNumber() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();

        System.out.print("Reversed: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    // 6. BMI Calculation
    public static void bmiCalc() {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] height = new double[n], weight = new double[n], bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("Height  Weight  BMI   Status");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "   " + weight[i] + "   " + bmi[i] + "   " + status[i]);
        }
    }

    // 7. BMI with 2D Array
    public static void bmi2D() {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3]; // weight, height, BMI
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 24.9) status[i] = "Normal";
            else if (personData[i][2] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("Height  Weight  BMI   Status");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + "   " + personData[i][0] + "   " + personData[i][2] + "   " + status[i]);
        }
    }

    // 8. Marks, Percentage, and Grade (1D)
    public static void marksGrade() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics marks of student " + (i + 1) + ": ");
            phy[i] = sc.nextInt();
            System.out.print("Chemistry marks of student " + (i + 1) + ": ");
            chem[i] = sc.nextInt();
            System.out.print("Maths marks of student " + (i + 1) + ": ");
            math[i] = sc.nextInt();
            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("Physics  Chemistry  Maths  %  Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(phy[i] + "   " + chem[i] + "   " + math[i] + "   " + percent[i] + "   " + grade[i]);
        }
    }

    // 9. Marks with 2D Array
    public static void marksGrade2D() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics marks of student " + (i + 1) + ": ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry marks of student " + (i + 1) + ": ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths marks of student " + (i + 1) + ": ");
            marks[i][2] = sc.nextInt();
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("Physics  Chemistry  Maths  %  Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "   " + marks[i][1] + "   " + marks[i][2] + "   " + percent[i] + "   " + grade[i]);
        }
    }

    // 10. Digit Frequency
    public static void digitFrequency() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] freq = new int[10];

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println(i + " → " + freq[i]);
        }
    }
     public static void main(String[] args) {
        while (true) {
            System.out.println("\nChoose a program:");
            System.out.println("1. Employee Bonus");
            System.out.println("2. Youngest & Tallest");
            System.out.println("3. Largest Digits (Fixed)");
            System.out.println("4. Largest Digits (Dynamic)");
            System.out.println("5. Reverse Number");
            System.out.println("6. BMI Calculation");
            System.out.println("7. BMI with 2D Array");
            System.out.println("8. Marks & Grades");
            System.out.println("9. Marks & Grades (2D)");
            System.out.println("10. Digit Frequency");
            System.out.println("11. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> employeeBonus();
                case 2 -> youngestAndTallest();
                case 3 -> largestDigitsFixed();
                case 4 -> largestDigitsDynamic();
                case 5 -> reverseNumber();
                case 6 -> bmiCalc();
                case 7 -> bmi2D();
                case 8 -> marksGrade();
                case 9 -> marksGrade2D();
                case 10 -> digitFrequency();
                case 11 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

  
}
