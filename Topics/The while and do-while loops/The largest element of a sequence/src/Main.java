import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int largest = 0;
        while(num != 0){
            if(num > largest){
                largest = num;
            }
            num = scanner.nextInt();
        }
        System.out.println(largest);
    }
}