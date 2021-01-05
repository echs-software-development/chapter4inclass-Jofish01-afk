import java.util.Scanner;

public class Prob2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("This program will find the difference between two numbers.");
    
    System.out.println("Enter two numbers: ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    //math.abs
    int num3 = Math.abs(num1 - num2);
    System.out.println(num3);

  }
}