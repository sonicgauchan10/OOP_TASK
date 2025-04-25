
import java.util.Scanner;

public class Ques2{
    public static void main(String[] args) {
        try(Scanner a = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int num = a.nextInt();
            int i = 1;
            int temp = 1;
            while(i <= num ){
                temp = i*num;
                i++;
            }
            System.out.println(temp);
    
            }
        }
    }
