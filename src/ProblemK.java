import java.util.*;

public class ProblemK {

    public static int sixseven(int n) {
        if (n > 123456789) {
            return -1;
        }
        if (n < 10) {
            return n;
        }

        // Convert n to array
        int num_digits = 0;
        int num = n;
        while (num != 0) {
            num_digits++;
            num /= 10;
        }

        num = n;
        int [] n_array = new int[num_digits];
        for (int i = num_digits-1; i >= 0; i--) {
            n_array[i] = num % 10;
            num /= 10;
        }

        int index = 0;
        while (index < n_array.length - 1) {
            int cur = n_array[index];
            if (cur + 1 == n_array[index+1]) { // 6 + 1 = 7
                index++;
            }
            else if (cur >= n_array[index+1]) { // this number greater than next
                if (cur + (n_array.length - (index + 1)) > 9) {
                    // add digits to front until satisfied
                    return create_return(1, n_array.length + 1);
                }
                else {
                    return create_return(n_array[0], n_array.length);
                }
            }
            else { // this number less than next
                if (cur + (n_array.length - index) > 9){
                    return create_return(1, n_array.length + 1);
                }
                else {
                    return create_return(n_array[0]+1, n_array.length);
                }
            }
        }
        return n;
    }

    private static int create_return(int first_num, int length) {
        int num = 0;
        int index = length-1;
        while (index >= 0) {
            num += (int) (first_num * Math.pow(10, index));
            first_num++;
            index--;
        }
        return num;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(sixseven(n));
        }
    }
}