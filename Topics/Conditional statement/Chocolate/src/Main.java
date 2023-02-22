import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        boolean result = false;
        if(K <= N*M && ((K%M)==0 || (K%N) == 0)){
            result = true;
        }

        if(result){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}