import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static String getAnswer(String color1, String color2, String color3){
		HashMap<String, String> number = new HashMap<>();
		number.put("black", "0");
		number.put("brown", "1");
		number.put("red", "2");
		number.put("orange", "3");
		number.put("yellow", "4");
		number.put("green", "5");
		number.put("blue", "6");
		number.put("violet", "7");
		number.put("grey", "8");
		number.put("white", "9");

		String answer = "";
		if(color1.equals("black") && color2.equals("black")){
			return "0";
		} else if(color1.equals("black")){
			answer += number.get(color2);
		} else {
			answer += number.get(color1) + number.get(color2);
		}
		// 색의 값만큼 0을 더해줌.
		for(int i=0; i<Integer.parseInt(number.get(color3));i++){
			answer += "0";
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String color1 = br.readLine();
		String color2 = br.readLine();
		String color3 = br.readLine();
		bw.write(getAnswer(color1, color2, color3));
		bw.flush();
		bw.close();
		br.close();
	}
}