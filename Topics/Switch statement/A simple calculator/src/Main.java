import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");

        long num1 = Long.parseLong(inputs[0]);
        char operation = inputs[1].charAt(0);
        long num2 = Long.parseLong(inputs[2]);

        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;

            case '/':
                if(operation == '/' && num2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Unknown operator");

        }

    }
}