import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		String answer = solution(A, B);
		bw.write(answer);
		bw.close();
		br.close();
	}

	static int[] halfAdder(int intA, int intB){
		int carry = (intA+intB > 9)?1:0;
		String tmp = Integer.toString(intA+intB);
		int sum =tmp.charAt(tmp.length()-1) - '0';
		int[] result = {carry, sum};
		return result;
	}

	static int[] fullAdder(int intA, int intB, int carry) {
		int carryOut = (intA+intB+carry>9)?1:0;
		String tmp = Integer.toString(intA+intB+carry);
		int sum =tmp.charAt(tmp.length()-1) - '0';
		// result = [자리올림, 합]
		int[] result = {carryOut, sum};
		return result;
	}

	public static String solution(String A, String B){
		StringBuilder result = new StringBuilder();
		StringBuffer sb = new StringBuffer(A);
		A = sb.reverse().toString();
		sb = new StringBuffer(B);
		B = sb.reverse().toString();

		int carry = 0;
		for(int i = 0; i< Math.min(A.length(), B.length()); i++){
			int[] addedResult = fullAdder(A.charAt(i)-'0',B.charAt(i)-'0', carry);
			carry = addedResult[0];
			result.append(Integer.toString(addedResult[1]));
		}
		for(int i = Math.min(A.length(), B.length()); i<Math.max(A.length(), B.length()); i++){
			String longNumber;
			if(A.length() > B.length()) longNumber = A;
			else{ longNumber = B;}
			int[] addedResult = halfAdder(longNumber.charAt(i)-'0', carry);
			carry = addedResult[0];
			result.append(Integer.toString(addedResult[1]));

		}
		if(carry != 0){
			result.append(Integer.toString(carry));
		}

		return result.reverse().toString();
	}
}