import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastScanner {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() { return Integer.parseInt(next()); }
    public long nextLong() { return Long.parseLong(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
}
