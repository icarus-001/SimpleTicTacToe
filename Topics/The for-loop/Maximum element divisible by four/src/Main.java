import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = 0;
        while(scanner.hasNext()){
            int number = scanner.nextInt();
            if(number > num && number%4 == 0){
                num = number;
            }
        }
        System.out.println(num);
    }
}