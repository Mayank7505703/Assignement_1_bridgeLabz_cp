import java.util.*;


// Problem 1: Library and Books (Aggregation)
class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String toString() { return title + " by " + author; }
}
class Library {
    private String name;
    private List<Book> books = new ArrayList<>();
    Library(String name) { this.name = name; }
    void addBook(Book b) { books.add(b); }
    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) System.out.println(" - " + b);
    }
}
class Main1 {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("1984", "George Orwell");
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");
        lib1.addBook(b1); lib1.addBook(b2);
        lib2.addBook(b2);
        lib1.showBooks();
        lib2.showBooks();
    }
}

// Problem 2: Bank and Account Holders (Association)
class Customer {
    String name; double balance;
    Customer(String name) { this.name = name; this.balance = 0; }
    void viewBalance() { System.out.println(name + "'s Balance: " + balance); }
}
class Bank {
    String bankName; List<Customer> customers = new ArrayList<>();
    Bank(String bankName) { this.bankName = bankName; }
    void openAccount(Customer c, double amount) {
        c.balance += amount; customers.add(c);
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
}
class Main2 {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC Bank");
        Customer c1 = new Customer("Mayank");
        Customer c2 = new Customer("Rahul");
        bank.openAccount(c1, 5000);
        bank.openAccount(c2, 10000);
        c1.viewBalance(); c2.viewBalance();
    }
}

// Problem 3: Company and Departments (Composition)
class Employee {
    String name; Employee(String name) { this.name = name; }
}
class Department {
    String deptName; List<Employee> employees = new ArrayList<>();
    Department(String deptName) { this.deptName = deptName; }
    void addEmployee(Employee e) { employees.add(e); }
    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) System.out.println(" - " + e.name);
    }
}
class Company {
    String companyName; List<Department> departments = new ArrayList<>();
    Company(String companyName) { this.companyName = companyName; }
    void addDepartment(Department d) { departments.add(d); }
    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) d.showEmployees();
    }
}
class Main3 {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));
        d2.addEmployee(new Employee("Charlie"));
        c.addDepartment(d1); c.addDepartment(d2);
        c.showCompany();
    }
}

// ================= Self Problems =================

// Problem 1: School and Students with Courses (Association + Aggregation)
class Course {
    String courseName; List<Student> students = new ArrayList<>();
    Course(String courseName) { this.courseName = courseName; }
    void addStudent(Student s) { students.add(s); }
    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) System.out.println(" - " + s.name);
    }
}
class Student {
    String name; List<Course> courses = new ArrayList<>();
    Student(String name) { this.name = name; }
    void enroll(Course c) { courses.add(c); c.addStudent(this); }
    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) System.out.println(" - " + c.courseName);
    }
}
class School {
    String schoolName; List<Student> students = new ArrayList<>();
    School(String schoolName) { this.schoolName = schoolName; }
    void addStudent(Student s) { students.add(s); }
}
class Main4 {
    public static void main(String[] args) {
        School s = new School("DPS School");
        Student st1 = new Student("Mayank");
        Student st2 = new Student("Riya");
        Course c1 = new Course("Maths");
        Course c2 = new Course("Science");
        st1.enroll(c1); st1.enroll(c2);
        st2.enroll(c1);
        s.addStudent(st1); s.addStudent(st2);
        st1.showCourses(); c1.showStudents();
    }
}

// Problem 2: University with Faculties and Departments (Composition + Aggregation)
class Faculty {
    String name; Faculty(String name) { this.name = name; }
}
class DepartmentU {
    String name; DepartmentU(String name) { this.name = name; }
}
class University {
    String name; List<DepartmentU> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    University(String name) { this.name = name; }
    void addDepartment(DepartmentU d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }
    void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentU d : departments) System.out.println(" - " + d.name);
        System.out.println("Faculties:");
        for (Faculty f : faculties) System.out.println(" - " + f.name);
    }
}
class Main5 {
    public static void main(String[] args) {
        University u = new University("IIT Delhi");
        DepartmentU d1 = new DepartmentU("CSE");
        DepartmentU d2 = new DepartmentU("ECE");
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Verma");
        u.addDepartment(d1); u.addDepartment(d2);
        u.addFaculty(f1); u.addFaculty(f2);
        u.showDetails();
    }
}

// Problem 3: Hospital, Doctors, and Patients (Association + Communication)
class Patient {
    String name; Patient(String name) { this.name = name; }
}
class Doctor {
    String name; Doctor(String name) { this.name = name; }
    void consult(Patient p) {
        System.out.println("Doctor " + name + " consulted patient " + p.name);
    }
}
class Hospital {
    String name; List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    Hospital(String name) { this.name = name; }
    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}
class Main6 {
    public static void main(String[] args) {
        Hospital h = new Hospital("AIIMS");
        Doctor d1 = new Doctor("Dr. Gupta");
        Patient p1 = new Patient("Ravi");
        h.addDoctor(d1); h.addPatient(p1);
        d1.consult(p1);
    }
}

// Problem 4: E-commerce Platform with Orders, Customers, and Products
class Product {
    String name; double price;
    Product(String name, double price) { this.name = name; this.price = price; }
}
class Order {
    List<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
    void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) System.out.println(" - " + p.name + " : " + p.price);
    }
}
class CustomerE {
    String name; CustomerE(String name) { this.name = name; }
    void placeOrder(Order o) {
        System.out.println(name + " placed an order.");
        o.showOrder();
    }
}
class Main7 {
    public static void main(String[] args) {
        CustomerE c = new CustomerE("Mayank");
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 800);
        Order o = new Order(); o.addProduct(p1); o.addProduct(p2);
        c.placeOrder(o);
    }
}

// Problem 5: University Management System
class Professor {
    String name; Professor(String name) { this.name = name; }
}
class CourseU {
    String name; Professor professor; List<StudentU> students = new ArrayList<>();
    CourseU(String name) { this.name = name; }
    void assignProfessor(Professor p) { this.professor = p; }
    void enroll(StudentU s) { students.add(s); }
    void showCourse() {
        System.out.println("Course: " + name);
        if (professor != null) System.out.println("Professor: " + professor.name);
        System.out.println("Students:");
        for (StudentU s : students) System.out.println(" - " + s.name);
    }
}
class StudentU {
    String name; StudentU(String name) { this.name = name; }
    void enrollCourse(CourseU c) {
        c.enroll(this);
        System.out.println(name + " enrolled in " + c.name);
    }
}
class Main8 {
    public static void main(String[] args) {
        StudentU s1 = new StudentU("Riya");
        StudentU s2 = new StudentU("Aman");
        Professor p = new Professor("Dr. Mehta");
        CourseU c1 = new CourseU("Data Structures");
        c1.assignProfessor(p);
        s1.enrollCourse(c1); s2.enrollCourse(c1);
        c1.showCourse();
    }
}
