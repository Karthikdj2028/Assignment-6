import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) array1[i] = scanner.nextInt();

        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) array2[i] = scanner.nextInt();

        System.out.print("Common elements: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) if (array1[i] == array2[j]) System.out.print(array1[i] + " ");
        }
        System.out.println();
    }
}