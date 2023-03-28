/*
Question : Write a java program to reverse any given number.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int module,Number;
        System.out.println("Enter the number :");
        Number = sc.nextInt();
        System.out.println("Printing the result :");
        while (Number != 0){
            module = Number % 10;
            Number = Number / 10;
            System.out.print(module);
        }
    }
}