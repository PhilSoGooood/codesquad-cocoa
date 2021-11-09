import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<T+1; i++) {
            // st = new StringTokenizer(br.readLine());
            // int a = Integer.parseInt(st.nextToken());
            // int b = Integer.parseInt(st.nextToken());
            // bw.write("Case #"+ i + ": " + a + " + " + b +  " = " + (a+b) + "\n");
            bw.write(" ".repeat(T-i) + "*".repeat(i) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}