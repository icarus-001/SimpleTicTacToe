import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(matrix[i][j] != matrix[j][i]){
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}