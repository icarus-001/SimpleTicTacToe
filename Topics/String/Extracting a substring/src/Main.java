import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String result = myString.substring(start, end+1);
        System.out.println(result);
    }
}