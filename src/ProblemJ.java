import java.util.*;

public class ProblemJ {
    public static void regarde(int n) {
        System.out.print("s");
        for (int i = 0; i <=n; i++) {
            System.out.print("h");
        }
        System.out.println();
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            regarde(n);
        }
    }
}
