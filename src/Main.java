import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t WELCOME TO MY FIRST OOP CALCULATOR\t\t\t");
        System.out.println("[1]ADDITION\n[2]SUBTRACTION\n[3]MULTIPLICATION\n[4]MODULER\n[5]DIVISION");


        var operate = new Operation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number ");
        double firstNum = scanner.nextInt();

        System.out.print("Enter operator ");
        String operator = scanner.next();

        System.out.print("Enter second number ");
        double secondNum = scanner.nextInt();

        double result = operate.calc(firstNum, operator, secondNum);

        System.out.println("The result of your calculation is " + result);


    }
}