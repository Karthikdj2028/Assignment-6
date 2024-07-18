import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();

        System.out.print("Non-duplicate items: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) if (array[i] == array[j]) isDuplicate = true;
            if (!isDuplicate) System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}