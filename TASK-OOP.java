//1

// class Vehicle {
//     void drive() {
//         System.out.println("Vehicle is driving");
//     }
// }
// class Car extends Vehicle {
//     private String model;
//     private int year;

//     Car(String model, int year) {
//         this.model = model;
//         this.year = year;
//     }
//     void display() {
//         System.out.println("Car Model: " + model);
//         System.out.println("Year: " + year);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Car myCar = new Car("Toyota Camry", 2023);
//         myCar.drive();
//         myCar.display();
//     }
// }


//2

// class Employee {
//     private double salary;

//     Employee(double salary) {
//         this.salary = salary;
//     }

//     void work() {
//         System.out.println("Employee is working");
//     }

//     double getSalary() {
//         return salary;
//     }
// }
// class HRManager extends Employee {
//     HRManager(double salary) {
//         super(salary);
//     }
//     @Override
//     void work() {
//         System.out.println("HR Manager is hiring employees");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Employee emp = new Employee(50000);
//         HRManager hr = new HRManager(70000);
        
//         emp.work();
//         System.out.println("Employee Salary: $" + emp.getSalary());
        
//         hr.work();
//         System.out.println("HR Manager Salary: $" + hr.getSalary());
//     }
// }


//3

// class Shape {
//     double calculateArea() {
//         return 0;
//     }
// }
// class Rectangle extends Shape {
//     private double length;
//     private double width;

//     Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }
//     @Override
//     double calculateArea() {
//         return length * width;
//     }
// }
// class Square extends Rectangle {
//     Square(double side) {
//         super(side, side);
//     }
// }
// class Circle extends Shape {
//     private double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }
//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Rectangle rect = new Rectangle(5, 4);
//         Square square = new Square(5);
//         Circle circle = new Circle(3);
//         System.out.println("Rectangle Area: " + rect.calculateArea());
//         System.out.println("Square Area: " + square.calculateArea());
//         System.out.println("Circle Area: " + circle.calculateArea());
//     }
// }


//4

// class Vehicle {
//     void startEngine() {
//         System.out.println("Engine started");
//     }
//     void stopEngine() {
//         System.out.println("Engine stopped");
//     }
// }
// class Car extends Vehicle {
//     void drive() {
//         System.out.println("Car is driving");
//     }
// }
// class Motorcycle extends Vehicle {
//     void ride() {
//         System.out.println("Motorcycle is riding");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Car car = new Car();
//         Motorcycle bike = new Motorcycle();
//         car.startEngine();
//         car.drive();
//         car.stopEngine();
//         System.out.println();
//         bike.startEngine();
//         bike.ride();
//         bike.stopEngine();
//     }
// }


//5

// class Shape {
//     double calculateArea() {
//         return 0;
//     }
// }
// class Rectangle extends Shape {
//     private double length;
//     private double width;

//     Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }
//     @Override
//     double calculateArea() {
//         return length * width;
//     }
//     double calculatePerimeter() {
//         return 2 * (length + width);
//     }
// }
// class Circle extends Shape {
//     private double radius;
//     Circle(double radius) {
//         this.radius = radius;
//     }
//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
//     double calculateCircumference() {
//         return 2 * Math.PI * radius;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Rectangle rect = new Rectangle(6, 4);
//         Circle circle = new Circle(5);
//         System.out.println("Rectangle Area: " + rect.calculateArea());
//         System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());       
//         System.out.println();       
//         System.out.println("Circle Area: " + circle.calculateArea());
//         System.out.println("Circle Circumference: " + circle.calculateCircumference());
//     }
// }


//6

// class Book {
//     private String title;
//     private String author;
//     Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }
//     void displayDetails() {
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//     }
// }
// class FictionBook extends Book {
//     FictionBook(String title, String author) {
//         super(title, author);
//     }
// }
// class NonFictionBook extends Book {
//     NonFictionBook(String title, String author) {
//         super(title, author);
//     }
// }
// class TechnicalBook extends Book {
//     TechnicalBook(String title, String author) {
//         super(title, author);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         FictionBook novel = new FictionBook("The Hobbit", "J.R.R. Tolkien");
//         TechnicalBook textbook = new TechnicalBook("Clean Code", "Robert C. Martin");
//         novel.displayDetails();
//         System.out.println();
//         textbook.displayDetails();
//     }
// }