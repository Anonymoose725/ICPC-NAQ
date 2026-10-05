import java.util.*;

public class ProblemB {

    public static int calculateAirtime(int [] a, int n) {
        int i = 0;
        int airtime = 0;
        while (i <= a.length - 3) { // dont check final duo of points
            int h1 = a[i];
            int h2 = a[i+1];
            int h3 = a[i+2];
            if (h2 - h1 > h3 - h2) {
                airtime++;
            }
            i++;
        }
        return airtime;
    }


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(calculateAirtime(a, n));
    }
}
