import java.util.*;

public class ProblemE {

    public static void macchiatos(int n) {
        // print nxn array with dots and C on diagonal
        int diag = n-1; //--
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == diag) {
                    System.out.print('C');
                    diag--;
                }
                else System.out.print('.');
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            macchiatos(n);
        }
    }

}
