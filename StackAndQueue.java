//1

// public class Stack {
//     private int[] arr;
//     private int top;
//     private int capacity;
//     public Stack(int size) {
//         capacity = size;
//         arr = new int[capacity];
//         top = -1;
//     }
//     public void push(int element) {
//         if (top == capacity - 1) {
//             throw new IllegalStateException("Stack overflow");
//         }
//         arr[++top] = element;
//     }
//     public int pop() {
//         if (isEmpty()) {
//             throw new IllegalStateException("Stack underflow");
//         }
//         return arr[top--];
//     }
//     public int peek() {
//         if (isEmpty()) {
//             throw new IllegalStateException("Stack is empty");
//         }
//         return arr[top];
//     }
//     public boolean isEmpty() {
//         return top == -1;
//     }
//     public int size() {
//         return top + 1;
//     }
// }


//2

// public class CustomStack {
//     private int[] data;
//     private int top;
//     private int maxSize;
//     public CustomStack(int size) {
//         maxSize = size;
//         data = new int[maxSize];
//         top = -1;
//     }
//     public void push(int val) {
//         if (isFull()) {
//             throw new IllegalStateException("Stack is full");
//         }
//         data[++top] = val;
//     }
//     public int pop() {
//         if (isEmpty()) {
//             throw new IllegalStateException("Stack is empty");
//         }
//         return data[top--];
//     }
//     public int peek() {
//         if (isEmpty()) {
//             throw new IllegalStateException("Stack is empty");
//         }
//         return data[top];
//     }
//     public boolean isEmpty() {
//         return top == -1;
//     }
//     public boolean isFull() {
//         return top == maxSize - 1;
//     }
// }


//3

// import java.util.Scanner;
// public class SupermarketQueue {
//     private static class ArrayQueue {
//         private String[] queue;
//         private int front;
//         private int rear;
//         private int count;
//         private int capacity;
//         public ArrayQueue(int size) {
//             capacity = size;
//             queue = new String[capacity];
//             front = 0;
//             rear = -1;
//             count = 0;
//         }
//         public void enqueue(String customer) {
//             if (isFull()) {
//                 System.out.println("Queue is full. Cannot add customer.");
//                 return;
//             }
//             rear = (rear + 1) % capacity;
//             queue[rear] = customer;
//             count++;
//         }
//         public String dequeue() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty. No customer to serve.");
//                 return null;
//             }
//             String customer = queue[front];
//             front = (front + 1) % capacity;
//             count--;
//             return customer;
//         }
//         public boolean isEmpty() {
//             return count == 0;
//         }
//         public boolean isFull() {
//             return count == capacity;
//         }
//         public int size() {
//             return count;
//         }
//         public String[] getQueueSnapshot() {
//             String[] snapshot = new String[count];
//             int current = front;
//             for (int i = 0; i < count; i++) {
//                 snapshot[i] = queue[current];
//                 current = (current + 1) % capacity;
//             }
//             return snapshot;
//         }
//     }
//     public static void main(String[] args) {
//         ArrayQueue queue = new ArrayQueue(5);
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             System.out.println("\nSupermarket Queue Management System");
//             System.out.println("a. Add customer");
//             System.out.println("b. Serve customer");
//             System.out.println("c. View queue");
//             System.out.println("d. Queue size");
//             System.out.println("e. Exit");
//             System.out.print("Select option: ");
//             String choice = scanner.nextLine();
//             switch (choice) {
//                 case "a":
//                     System.out.print("Enter customer name: ");
//                     String name = scanner.nextLine();
//                     queue.enqueue(name);
//                     break;
//                 case "b":
//                     String served = queue.dequeue();
//                     if (served != null) {
//                         System.out.println("Serving customer: " + served);
//                     }
//                     break;
//                 case "c":
//                     if (queue.isEmpty()) {
//                         System.out.println("Queue is empty");
//                     } else {
//                         System.out.println("Current queue:");
//                         int position = 1;
//                         for (String customer : queue.getQueueSnapshot()) {
//                             System.out.println(position++ + ". " + customer);
//                         }
//                     }
//                     break;
//                 case "d":
//                     System.out.println("Customers in queue: " + queue.size());
//                     break;
//                 case "e":
//                     System.out.println("Exiting program");
//                     scanner.close();
//                     return;
//                 default:
//                     System.out.println("Invalid option");
//             }
//         }
//     }
// }


//4

// import java.util.Scanner;

// public class CallCenterQueue {
//     private static class CallQueue {
//         private String[] calls;
//         private int head;
//         private int tail;
//         private int size;
//         private int maxSize;
//         public CallQueue(int capacity) {
//             maxSize = capacity;
//             calls = new String[maxSize];
//             head = 0;
//             tail = -1;
//             size = 0;
//         }
//         public void addCall(String callId) {
//             if (isFull()) {
//                 System.out.println("Queue full. Call placed on hold.");
//                 return;
//             }
//             tail = (tail + 1) % maxSize;
//             calls[tail] = callId;
//             size++;
//         }
//         public String handleCall() {
//             if (isEmpty()) {
//                 System.out.println("No calls in queue");
//                 return null;
//             }
//             String call = calls[head];
//             head = (head + 1) % maxSize;
//             size--;
//             return call;
//         }

//         public boolean isEmpty() {
//             return size == 0;
//         }

//         public boolean isFull() {
//             return size == maxSize;
//         }

//         public int pendingCalls() {
//             return size;
//         }

//         public String[] getQueueState() {
//             String[] current = new String[size];
//             int index = head;
//             for (int i = 0; i < size; i++) {
//                 current[i] = calls[index];
//                 index = (index + 1) % maxSize;
//             }
//             return current;
//         }
//     }
//     public static void main(String[] args) {
//         CallQueue callQueue = new CallQueue(5);
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             System.out.println("\nCall Center Queue System");
//             System.out.println("a. Add incoming call");
//             System.out.println("b. Handle next call");
//             System.out.println("c. View call queue");
//             System.out.println("d. Pending calls");
//             System.out.println("e. Exit");
//             System.out.print("Select option: ");
//             String choice = scanner.nextLine();
//             switch (choice) {
//                 case "a":
//                     System.out.print("Enter call ID: ");
//                     String callId = scanner.nextLine();
//                     callQueue.addCall(callId);
//                     break;
//                 case "b":
//                     String handledCall = callQueue.handleCall();
//                     if (handledCall != null) {
//                         System.out.println("Handling call: " + handledCall);
//                     }
//                     break;
//                 case "c":
//                     if (callQueue.isEmpty()) {
//                         System.out.println("No calls in queue");
//                     } else {
//                         System.out.println("Current call queue:");
//                         int num = 1;
//                         for (String call : callQueue.getQueueState()) {
//                             System.out.println(num++ + ". " + call);
//                         }
//                     }
//                     break;
//                 case "d":
//                     System.out.println("Pending calls: " + callQueue.pendingCalls());
//                     break;
//                 case "e":
//                     System.out.println("Exiting system");
//                     scanner.close();
//                     return;
//                 default:
//                     System.out.println("Invalid option");
//             }
//         }
//     }
// }







