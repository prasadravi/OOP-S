import java.util.Scanner;

public class window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;

        // Check window condition (i, i+1, i+2)
        for (int i = 0; i < n - 2; i++) {
            if (arr[i] + arr[i + 2] == arr[i + 1]) {
                ans++;
            }
        }

        System.out.println("Window number: " + ans);
    }
    
}
