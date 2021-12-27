import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<int[]> students = new ArrayList<>();
		int[] answer = new int[N];
		for(int i=0; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] student = new int [2];
			student[0] = Integer.parseInt(st.nextToken());
			student[1] = Integer.parseInt(st.nextToken());
			students.add(student);
		}
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if((students.get(i)[0] < students.get(j)[0]) && (students.get(i)[1] < students.get(j)[1])) answer[i]++;
			}
		}
		for(int i=0; i<N; i++){
			System.out.print(answer[i]+1+" ");
		}
		br.close();
	}
}
