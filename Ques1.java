
import java.util.Scanner;

public class Ques1{
    public static void main(String[] args) {
      try(Scanner a = new Scanner(System.in)){
        System.out.println("Enter a number:");
        int num = a.nextInt();
        while(num != 0){
            if (num % 1 == 0 & num % 2 == 0){
                System.out.println("Composite");
            }
            else{
                System.out.println("Prime");
            }
            break;

        }
      }
    }

}