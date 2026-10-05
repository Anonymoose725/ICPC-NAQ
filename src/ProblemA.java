import java.util.*;

public class ProblemA {
    public static long christmas(long n) {
        int B = 998244353;
        if (n<Math.pow(10, 5)){
            return ((((n+1))%B)*(((n+2))%B)*((n)%B)/6) % B;
        }
        return ((((n+1)/3)%B)*(((n+2)/2)%B)*((n)%B)) % B;
    }

    public static void main(String [] args) {
        FastScanner sc = new FastScanner();
        long n = sc.nextLong();
        System.out.println(christmas(n));
        System.out.println(test(n));
    }

    public static long test (long n){
        long s = 0;
        for (long i = 1; i <= n; i++){
            for (long j = 1; j <= i; j++){
                s += j;
                s = s%998244353;
            }
        }
        return s;
    }
}
