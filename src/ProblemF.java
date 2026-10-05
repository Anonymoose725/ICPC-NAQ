import java.util.*;

public class ProblemF {

    public static int fairytale(int n, int [] notes) {
        boolean [] seenString = new boolean[4]; // 0, 1, 2, 3
        int strings = 0;
        for (int i = 0; i < n; i++) {
            int string = notes[i] / 11; // 0, 1, 2, 3
            if (!seenString[string]) {
                strings++;
                seenString[string] = true;
            }
        }
        return strings;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int [] notes = new int[n];
            for (int j = 0; j < n; j++) {
                notes[j] = sc.nextInt();
            }
            System.out.println(fairytale(n, notes));
        }
    }
}
