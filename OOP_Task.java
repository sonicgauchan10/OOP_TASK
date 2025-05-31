//.......................................CONCEPT OF OOP.................................................//

//1

// public class Circle{
//     private double radius;
//     public double getRadius() {
//         return radius;
//     }
//     public void setRadius(double radius) {
//         this.radius = radius;
//     }
//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }
//     public double calculateCircumference() {
//         return 2 * Math.PI * radius;
//     }
//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         circle.setRadius(5.0);
//         System.out.println("Area: " + circle.calculateArea());
//         System.out.println("Circumference: " + circle.calculateCircumference());
//     }
// }


// 2

// public class SimpleInterest {
//     private double principle;
//     private double time;
//     private double rate;
//     public double getPrinciple() {
//         return principle;
//     }
//     public void setPrinciple(double principle) {
//         this.principle = principle;
//     }
//     public double getTime() {
//         return time;
//     }
//     public void setTime(double time) {
//         this.time = time;
//     }
//     public double getRate() {
//         return rate;
//     }
//     public void setRate(double rate) {
//         this.rate = rate;
//     }
//     public double calculateInterest() {
//         return (principle * time * rate) / 100;
//     }
//     public static void main(String[] args) {
//         SimpleInterest si = new SimpleInterest();
//         si.setPrinciple(1000);
//         si.setTime(2);
//         si.setRate(5);
//         System.out.println("Interest: " + si.calculateInterest());
//     }
// }


//3

// public class Dog {
//     private String name;
//     private String breed;
//     public Dog(String name, String breed) {
//         this.name = name;
//         this.breed = breed;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getBreed() {
//         return breed;
//     }
//     public void setBreed(String breed) {
//         this.breed = breed;
//     }
//     public static void main(String[] args) {
//         Dog dog1 = new Dog("Buddy", "Golden Retriever");
//         Dog dog2 = new Dog("Max", "German Shepherd");
//         dog1.setName("Charlie");
//         dog2.setBreed("Labrador");
//         System.out.println("Dog1: " + dog1.getName() + ", " + dog1.getBreed());
//         System.out.println("Dog2: " + dog2.getName() + ", " + dog2.getBreed());
//     }
// }


//4

// public class Employee {
//     private String name;
//     private String jobTitle;
//     private double salary;
//     public Employee(String name, String jobTitle, double salary) {
//         this.name = name;
//         this.jobTitle = jobTitle;
//         this.salary = salary;
//     }
//     public double getSalary() {
//         return salary;
//     }
//     public void updateSalary(double percentage) {
//         salary += salary * (percentage / 100);
//     }
//     public static void main(String[] args) {
//         Employee emp = new Employee("John Doe", "Developer", 50000);
//         emp.updateSalary(10);
//         System.out.println("Updated Salary: $" + emp.getSalary());
//     }
// }

//......................................Encapsulation...................................................//


//1

// public class Product {
//     private String name;
//     private String productID;
//     private double price;
//     private int stockQuantity;
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getProductID() {
//         return productID;
//     }
//     public void setProductID(String productID) {
//         this.productID = productID;
//     }
//     public double getPrice() {
//         return price;
//     }
//     public void setPrice(double price) {
//         if (price >= 0) this.price = price;
//     }
//     public void purchase(int quantity) {
//         if (quantity <= stockQuantity) stockQuantity -= quantity;
//     }
//     public void restock(int quantity) {
//         if (quantity > 0) stockQuantity += quantity;
//     }
// }


//2

// public class BankAccount {
//     private String accountNumber;
//     private String accountHolderName;
//     private double balance;
//     public void deposit(double amount) {
//         if (amount > 0) balance += amount;
//     }
//     public void withdraw(double amount) {
//         if (amount <= balance) balance -= amount;
//     }
//     public double getBalance() {
//         return balance;
//     }
// }


//3

// public class Book {
//     private String title;
//     private String author;
//     private int publicationYear;
//     private boolean available = true;
//     public String getTitle() {
//         return title;
//     }
//     public void setTitle(String title) {
//         this.title = title;
//     }
//     public String getAuthor() {
//         return author;
//     }
//     public void setAuthor(String author) {
//         this.author = author;
//     }
//     public int getPublicationYear() {
//         return publicationYear;
//     }
//     public void setPublicationYear(int publicationYear) {
//         this.publicationYear = publicationYear;
//     }
//     public boolean isAvailable() {
//         return available;
//     }
//     public void borrow() {
//         if (available) available = false;
//     }
// }


//4

// public class Student {
//     private String name;
//     private String idNumber;
//     private final double gpa;
//     public Student(String name, String idNumber, double gpa) {
//         this.name = name;
//         this.idNumber = idNumber;
//         this.gpa = gpa;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getIdNumber() {
//         return idNumber;
//     }
//     public void setIdNumber(String idNumber) {
//         this.idNumber = idNumber;
//     }
//     public double getGpa() {
//         return gpa;
//     }
// }


//5

// public class Employee {
//     private String name;
//     private String employeeId;
//     private double salary;
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getEmployeeId() {
//         return employeeId;
//     }
//     public void setEmployeeId(String employeeId) {
//         this.employeeId = employeeId;
//     }
//     public double getSalary() {
//         return salary;
//     }
//     public void updateSalary(double amount) {
//         if (salary + amount >= 0) salary += amount;
//     }
// }


//6

// public class Car {
//     private final String make;
//     private final String model;
//     private double rentalPricePerDay;
//     private boolean available = true;
//     public Car(String make, String model, double rentalPricePerDay) {
//         this.make = make;
//         this.model = model;
//         this.rentalPricePerDay = rentalPricePerDay;
//     }
//     public String getMake() {
//         return make;
//     }
//     public String getModel() {
//         return model;
//     }
//     public double getRentalPricePerDay() {
//         return rentalPricePerDay;
//     }
//     public void setRentalPricePerDay(double price) {
//         if (price > 0) rentalPricePerDay = price;
//     }
//     public boolean isAvailable() {
//         return available;
//     }
//     public void rent() {
//         if (available) available = false;
//     }
//     public void returnCar() {
//         if (!available) available = true;
//     }
// }
