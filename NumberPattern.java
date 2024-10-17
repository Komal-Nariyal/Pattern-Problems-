import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int size = 2 * N - 1;
        int[][] pattern = new int[size][size];
        for (int i = 0; i < N; i++) {
            for (int j = i; j < size - i; j++) {
                pattern[i][j] = N - i;
                pattern[j][i] = N - i;
                pattern[size - 1 - i][j] = N - i;
                pattern[j][size - 1 - i] = N - i;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
