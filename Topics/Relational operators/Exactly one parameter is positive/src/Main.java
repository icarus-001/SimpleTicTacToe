import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        boolean first = arr[0] > 0;
        boolean second = arr[1] > 0;
        boolean third = arr[2] > 0;
        boolean result = first && second || first && third || second && third;
        System.out.println(!result);


    }
}