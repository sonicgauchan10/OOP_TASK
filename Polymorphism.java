//1

// abstract class Shape {
//     abstract double calculateArea();
// }
// class Circle extends Shape {
//     private double radius;
//     public Circle(double radius) { this.radius = radius; }
//     @Override
//     double calculateArea() { return Math.PI * radius * radius; }
// }
// class Rectangle extends Shape {
//     private double length, width;
//     public Rectangle(double l, double w) { length = l; width = w; }
//     @Override
//     double calculateArea() { return length * width; }
// }

// cass Triangle extends Shape {
//     private double base, height;
//     public Triangle(double b, double h) { base = b; height = h; }
//     @Override
//     double calculateArea() { return 0.5 * base * height; }
// }
// public class Main {
//     public static void main(String[] args) {
//         Shape circle = new Circle(5.0);
//         Shape rectangle = new Rectangle(4.0, 6.0);
//         Shape triangle = new Triangle(3.0, 4.0);
        
//         System.out.println("Circle Area: " + circle.calculateArea());
//         System.out.println("Rectangle Area: " + rectangle.calculateArea());
//         System.out.println("Triangle Area: " + triangle.calculateArea());
//     }
// }



//2

// interface PaymentMethod {
//     void validate();
//     void processTransaction(double amount);
// }
// class CreditCard implements PaymentMethod {
//     public void validate() { System.out.println("Validating credit card..."); }
//     public void processTransaction(double amount) {
//         System.out.println("Processing credit card payment: $" + amount);
//     }
// }
// class PayPal implements PaymentMethod {
//     public void validate() { System.out.println("Validating PayPal account..."); }
//     public void processTransaction(double amount) {
//         System.out.println("Processing PayPal payment: $" + amount);
//     }
// }
// class BankTransfer implements PaymentMethod {
//     public void validate() { System.out.println("Validating bank details..."); }
//     public void processTransaction(double amount) {
//         System.out.println("Processing bank transfer: $" + amount);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         PaymentMethod[] payments = {
//             new CreditCard(),
//             new PayPal(),
//             new BankTransfer()
//         };
//         double amount = 100.0;
//         for (PaymentMethod method : payments) {
//             method.validate();
//             method.processTransaction(amount);
//         }
//     }
// }



//3

// abstract class Vehicle {
//     abstract double calculateRentalCost(int days);
// }
// class Car extends Vehicle {
//     private static final double DAILY_RATE = 50.0;
//     @Override
//     double calculateRentalCost(int days) { return days * DAILY_RATE; }
// }
// class Motorcycle extends Vehicle {
//     private static final double DAILY_RATE = 30.0;
//     @Override
//     double calculateRentalCost(int days) { return days * DAILY_RATE; }
// }
// class Bicycle extends Vehicle {
//     private static final double DAILY_RATE = 15.0;
//     @Override
//     double calculateRentalCost(int days) { return days * DAILY_RATE; }
// }
// public class Main {
//     public static void main(String[] args) {
//         Vehicle[] vehicles = {
//             new Car(),
//             new Motorcycle(),
//             new Bicycle()
//         };
//         int rentalDays = 5;
//         for (Vehicle vehicle : vehicles) {
//             System.out.println("Rental cost: $" + 
//                 vehicle.calculateRentalCost(rentalDays));
//         }
//     }
// }



//4

// abstract class MenuItem {
//     abstract void prepare();
//     abstract void serve();
// }
// class Appetizer extends MenuItem {
//     public void prepare() { System.out.println("Preparing appetizer..."); }
//     public void serve() { System.out.println("Serving appetizer chilled"); }
// }
// class MainCourse extends MenuItem {
//     public void prepare() { System.out.println("Cooking main course..."); }
//     public void serve() { System.out.println("Serving main course hot"); }
// }
// class Beverage extends MenuItem {
//     public void prepare() { System.out.println("Mixing beverage..."); }
//     public void serve() { System.out.println("Serving beverage with ice"); }
// }
// public class Main {
//     public static void main(String[] args) {
//         MenuItem[] order = {
//             new Appetizer(),
//             new MainCourse(),
//             new Beverage()
//         };
//         for (MenuItem item : order) {
//             item.prepare();
//             item.serve();
//         }
//     }
// }



//5

// abstract class Shape {
//     abstract void resize(double factor);
//     abstract void rotate(double degrees);
// }
// class Circle extends Shape {
//     public void resize(double factor) {
//         System.out.println("Resizing circle by factor: " + factor);
//     }
//     public void rotate(double degrees) {
//         System.out.println("Rotating circle by " + degrees + " degrees");
//     }
// }
// class Square extends Shape {
//     public void resize(double factor) {
//         System.out.println("Resizing square by factor: " + factor);
//     }
//     public void rotate(double degrees) {
//         System.out.println("Rotating square by " + degrees + " degrees");
//     }
// }
// class Triangle extends Shape {
//     public void resize(double factor) {
//         System.out.println("Resizing triangle by factor: " + factor);
//     }
//     public void rotate(double degrees) {
//         System.out.println("Rotating triangle by " + degrees + " degrees");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Shape[] shapes = {
//             new Circle(),
//             new Square(),
//             new Triangle()
//         };
//         for (Shape shape : shapes) {
//             shape.resize(1.5);
//             shape.rotate(45);
//         }
//     }
// }



//6

// class Calculator {
//     public int add(int a, int b) { return a + b; }
//     public double add(double a, double b) { return a + b; }
//     public int add(int a, int b, int c) { return a + b + c; }
// }
// public class Main {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.add(2, 3));          
//         System.out.println(calc.add(2.5, 3.7));      
//         System.out.println(calc.add(1, 2, 3));       
//     }
// }



//7

// class Geometry {
//     public double calculateArea(double radius) {
//         return Math.PI * radius * radius;
//     }
//     public double calculateArea(double length, double width) {
//         return length * width;
//     }
//     public double calculateArea(double base, double height, boolean isTriangle) {
//         return 0.5 * base * height;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Geometry geo = new Geometry();
//         System.out.println("Circle Area: " + geo.calculateArea(5.0));
//         System.out.println("Rectangle Area: " + geo.calculateArea(4.0, 6.0));
//         System.out.println("Triangle Area: " + geo.calculateArea(3.0, 4.0, true));
//     }
// }



//8

// class Employee {
//     private double baseSalary = 5000;
//     public double calculateSalary() {
//         return baseSalary;
//     }
// }
// class Manager extends Employee {
//     private double bonus;
//     public Manager(double bonus) { this.bonus = bonus; }
//     @Override
//     public double calculateSalary() {
//         return super.calculateSalary() + bonus;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Employee emp = new Employee();
//         Manager mgr = new Manager(2000);        
//         System.out.println("Employee Salary: $" + emp.calculateSalary());
//         System.out.println("Manager Salary: $" + mgr.calculateSalary());
//     }
// }



//9

// class Account {
//     protected double balance;
//     public Account(double balance) { this.balance = balance; }
//     public double calculateInterest() { return 0; } // Default implementation
// }
// class SavingsAccount extends Account {
//     private static final double RATE = 0.04;
//     public SavingsAccount(double balance) { super(balance); }
//     @Override
//     public double calculateInterest() { return balance * RATE; }
// }
// class FixedDepositAccount extends Account {
//     private static final double RATE = 0.08;
//     public FixedDepositAccount(double balance) { super(balance); }
//     @Override
//     public double calculateInterest() { return balance * RATE; }
// }
// public class Main {
//     public static void main(String[] args) {
//         Account savings = new SavingsAccount(10000);
//         Account fixedDeposit = new FixedDepositAccount(50000);
//         System.out.println("Savings Interest: $" + savings.calculateInterest());
//         System.out.println("FD Interest: $" + fixedDeposit.calculateInterest());
//     }
// }



//10

// class Character {
//     public void attack() {
//         System.out.println("Performing basic attack!");
//     }
// }
// class Warrior extends Character {
//     @Override
//     public void attack() {
//         System.out.println("Warrior swings a mighty sword!");
//     }
// }
// class Mage extends Character {
//     @Override
//     public void attack() {
//         System.out.println("Mage casts a fireball spell!");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Character warrior = new Warrior();
//         Character mage = new Mage();
        
//         warrior.attack();
//         mage.attack();
//     }
// }



//11

// interface Instrument {
//     void playSound();
// }
// class Piano implements Instrument {
//     public void playSound() {
//         System.out.println("Piano sound: ♫ ♪ ♬");
//     }
// }
// class Guitar implements Instrument {
//     public void playSound() {
//         System.out.println("Guitar sound: ~ ♫ strum ~");
//     }
// }
// class Violin implements Instrument {
//     public void playSound() {
//         System.out.println("Violin sound: ✥ ♪ ✥");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Instrument[] orchestra = {
//             new Piano(),
//             new Guitar(),
//             new Violin()
//         };      
//         for (Instrument instrument : orchestra) {
//             instrument.playSound();
//         }
//     }
// }


