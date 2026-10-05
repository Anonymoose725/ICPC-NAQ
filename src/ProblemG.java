import java.util.*;

public class ProblemG {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int g = sc.nextInt();
            ArrayList<ArrayList<Integer>> genres = new ArrayList<>();
            for (int j = 0; j < g; j++) {

            }
            sc.next(); // skipping P
            int genre = sc.nextInt();
            int peopleWhoDanced = sc.nextInt();
            int [] peoplewhodancedtothatgenre = new int[peopleWhoDanced];
            for (int j = 0; j < peopleWhoDanced; j++) {
                peoplewhodancedtothatgenre[j] = sc.nextInt();
            }
            while (sc.next().equals("Q")) {
                // question asked

            }
        }
    }
}
