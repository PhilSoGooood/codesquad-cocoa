package project;
import java.util.Scanner;

class CoffeeTool {
	public int toolNum;
	public void selectTool() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("------------------ 추출할 도구의 번호를 입력해주세요 ------------------");
			System.out.println(" 		[1]V60 [2]컴프레소 [3]클레버 [4]추출 도구 추가 [5]종료");
			System.out.println("---------------------------------------------------------------");

			toolNum = scanner.nextInt();

			if (1 > toolNum || toolNum > 5) {
				System.out.println("1 ~ 5 사이의 번호를 입력해주세요.");
				continue;
			}
			break;
		}
		if (toolNum == 1) {
			V60Ready v60 = new V60Ready();
			v60.inputBean();
		}

		if (toolNum == 2) {
			CompressoReady compressoReady = new CompressoReady();
			compressoReady.inputBean();
		}

		if (toolNum == 3) {
			CleverReady cleverReady = new CleverReady();
			cleverReady.inputBean();
		}
	}
}
