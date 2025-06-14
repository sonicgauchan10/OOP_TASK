//1

// abstract class Bird {
//     abstract void fly();
// }
// class Eagle extends Bird {
//     @Override
//     void fly() {
//         System.out.println("Eagle is soaring through the sky!");
//     }
// }
// class Penguin extends Bird {
//     @Override
//     void fly() {
//         System.out.println("Penguin cannot fly, but it's a great swimmer!");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Bird eagle = new Eagle();
//         Bird penguin = new Penguin();
//         eagle.fly();   
//         penguin.fly(); 
//     }
// }


//2

// abstract class Shape {
//     abstract double calculateArea();
// }
// class Rectangle extends Shape {
//     private double length;
//     private double width;  
//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }  
//     @Override
//     double calculateArea() {
//         return length * width;
//     }
// }
// class Circle extends Shape {
//     private double radius;
    
//     public Circle(double radius) {
//         this.radius = radius;
//     }  
//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter rectangle length: ");
//         double length = scanner.nextDouble();
//         System.out.print("Enter rectangle width: ");
//         double width = scanner.nextDouble();
//         Shape rectangle = new Rectangle(length, width);
//         System.out.println("Rectangle Area: " + rectangle.calculateArea());
//         System.out.print("Enter circle radius: ");
//         double radius = scanner.nextDouble();
//         Shape circle = new Circle(radius);
//         System.out.println("Circle Area: " + circle.calculateArea());
//         scanner.close();
//     }
// }


//3

// abstract class Vehicle {
//     abstract void startEngine();
//     abstract void stopEngine();
// }
// class Car extends Vehicle {
//     @Override
//     void startEngine() {
//         System.out.println("Car engine started with key ignition!");
//     }
//     @Override
//     void stopEngine() {
//         System.out.println("Car engine stopped safely.");
//     }
// }
// class Motorcycle extends Vehicle {
//     @Override
//     void startEngine() {
//         System.out.println("Motorcycle engine started with kick-start!");
//     }
//     @Override
//     void stopEngine() {
//         System.out.println("Motorcycle engine turned off.");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Vehicle car = new Car();
//         Vehicle motorcycle = new Motorcycle();
//         car.startEngine();      
//         car.stopEngine();       
//         motorcycle.startEngine(); 
//         motorcycle.stopEngine();  
//     }
// }


//4

// abstract class Shape {
//     abstract double calculateArea();
//     abstract double calculatePerimeter();
// }
// class Circle extends Shape {
//     private double radius;
    
//     public Circle(double radius) {
//         this.radius = radius;
//     }
//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
//     @Override
//     double calculatePerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }
// class Rectangle extends Shape {
//     private double length;
//     private double width;
//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }
//     @Override
//     double calculateArea() {
//         return length * width;
//     }
//     @Override
//     double calculatePerimeter() {
//         return 2 * (length + width);
//     }
// }
// class Triangle extends Shape {
//     private double side1;
//     private double side2;
//     private double side3;
//     public Triangle(double side1, double side2, double side3) {
//         this.side1 = side1;
//         this.side2 = side2;
//         this.side3 = side3;
//     }
//     @Override
//     double calculateArea() {
//         double s = (side1 + side2 + side3) / 2;
//         return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//     }
//     @Override
//     double calculatePerimeter() {
//         return side1 + side2 + side3;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Circle circle = new Circle(5);
//         Rectangle rectangle = new Rectangle(4, 6);
//         Triangle triangle = new Triangle(3, 4, 5);
//         System.out.println("Circle Area: " + circle.calculateArea());
//         System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
//         System.out.println("Rectangle Area: " + rectangle.calculateArea());
//         System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
//         System.out.println("Triangle Area: " + triangle.calculateArea());
//         System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
//     }
// }


//5

// abstract class Draw {
//     abstract double calculateVolume();
//     abstract double calculateArea();
//     abstract double calculatePerimeter();
// }
// class Cube extends Draw {
//     private double side;
    
//     public Cube(double side) {
//         this.side = side;
//     }
//     @Override
//     double calculateVolume() {
//         return Math.pow(side, 3);
//     }
//     @Override
//     double calculateArea() {
//         return 6 * Math.pow(side, 2);
//     }
//     @Override
//     double calculatePerimeter() {
//         return 12 * side;  
//     }
// }
// class Cuboid extends Draw {
//     private double length;
//     private double width;
//     private double height;
//     public Cuboid(double length, double width, double height) {
//         this.length = length;
//         this.width = width;
//         this.height = height;
//     }
//     @Override
//     double calculateVolume() {
//         return length * width * height;
//     }
//     @Override
//     double calculateArea() {
//         return 2 * (length*width + length*height + width*height);
//     }
//     @Override
//     double calculatePerimeter() {
//         return 4 * (length + width + height);  
//     }
// }
// class Cylinder extends Draw {
//     private double radius;
//     private double height;

//     public Cylinder(double radius, double height) {
//         this.radius = radius;
//         this.height = height;
//     }
//     @Override
//     double calculateVolume() {
//         return Math.PI * radius * radius * height;
//     }
//     @Override
//     double calculateArea() {
//         return 2 * Math.PI * radius * (radius + height);
//     }
//     @Override
//     double calculatePerimeter() {
//         return 2 * (2 * Math.PI * radius);  
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Cube cube = new Cube(3);
//         Cuboid cuboid = new Cuboid(4, 5, 6);
//         Cylinder cylinder = new Cylinder(3, 5);
//         System.out.println("Cube Volume: " + cube.calculateVolume());
//         System.out.println("Cube Surface Area: " + cube.calculateArea());
//         System.out.println("Cube Perimeter: " + cube.calculatePerimeter());
//         System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
//         System.out.println("Cuboid Surface Area: " + cuboid.calculateArea());
//         System.out.println("Cuboid Perimeter: " + cuboid.calculatePerimeter());
//         System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
//         System.out.println("Cylinder Surface Area: " + cylinder.calculateArea());
//         System.out.println("Cylinder Perimeter: " + cylinder.calculatePerimeter());
//     }
// }


//6

// class MediaPlayer {
//     public void play() {
//         System.out.println("Playing media...");
//     }

//     public void pause() {
//         System.out.println("Media paused.");
//     }
//     public void stop() {
//         System.out.println("Media stopped.");
//     }
// }
// interface Playlist {
//     void addSong(String song);
//     void removeSong(String song);
// }
// class VideoPlayer extends MediaPlayer implements Playlist {
//     @Override
//     public void play() {
//         System.out.println("Playing video...");
//     }
//     public void rewind() {
//         System.out.println("Rewinding video...");
//     }
//     public void fastForward() {
//         System.out.println("Fast-forwarding video...");
//     }
//     @Override
//     public void addSong(String song) {
//         System.out.println("Added song: " + song);
//     }
//     @Override
//     public void removeSong(String song) {
//         System.out.println("Removed song: " + song);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         VideoPlayer player = new VideoPlayer();
//         player.play();           
//         player.rewind();         
//         player.addSong("Song1"); 
//         player.removeSong("Song1");
//     }
// }


//7

// interface Employee {
//     void work();
//     double getSalary();
// }
// class Chef implements Employee {
//     private double salary = 50000;
//     @Override
//     public void work() {
//         System.out.println("Chef is cooking gourmet meals");
//     }
//     @Override
//     public double getSalary() {
//         return salary;
//     }
// }
// class Waiter implements Employee {
//     private double salary = 30000;
//     @Override
//     public void work() {
//         System.out.println("Waiter is serving customers");
//     }
//     @Override
//     public double getSalary() {
//         return salary;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Employee chef = new Chef();
//         Employee waiter = new Waiter();
//         chef.work();    
//         waiter.work();  
//     }
// }


//8

// interface LibraryItem {
//     String getTitle();
//     String getAuthor();
//     int getYear();
//     boolean isAvailable();
// }
// class Book implements LibraryItem {
//     private String title;
//     private String author;
//     private int year;
//     private boolean available = true;
//     public Book(String title, String author, int year) {
//         this.title = title;
//         this.author = author;
//         this.year = year;
//     }
//     @Override
//     public String getTitle() {
//         return title;
//     }
//     @Override
//     public String getAuthor() {
//         return author;
//     }
//     @Override
//     public int getYear() {
//         return year;
//     }
//     @Override
//     public boolean isAvailable() {
//         return available;
//     }
//     public void borrowItem() {
//         available = false;
//     }
//     public void returnItem() {
//         available = true;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         LibraryItem book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
//         System.out.println("Title: " + book.getTitle());
//         System.out.println("Available: " + book.isAvailable());
//     }
// }