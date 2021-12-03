import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String[] line = br.readLine().split(" ");
		int max = Integer.parseInt(line[0]);
		int min = Integer.parseInt(line[0]);
		int num;

		for(int i=1; i<line.length; i++){
			num = Integer.parseInt(line[i]);
			if(num > max){
				max = num;
			} else if(num <min){
				min = num;
			}
		}
		System.out.println(min + " " + max);
	}
}
