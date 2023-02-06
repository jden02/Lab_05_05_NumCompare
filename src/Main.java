import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int numOne = sc.nextInt();
        System.out.println("Enter your second number: ");
        int numTwo = sc.nextInt();

        if(numOne == numTwo){
            System.out.println("Your numbers are equal.");
        }else if(numOne > numTwo){
            System.out.println("Your second number is less than your first.");
        }else if(numOne < numTwo){
            System.out.println("Your first number is less than your second.");
        }else{
            System.out.println("One or more of your numbers is invalid. Please try again");
        }

    }
}