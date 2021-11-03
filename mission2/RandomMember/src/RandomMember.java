import java.util.*;
class Member {
    String members[] = {"BC", "호두마루", "DAVE", "Barney", "meatsby", "mong", "Jun", "Phil", "Dike", "Jhin"};
    int memberNumber = members.length;
    int inputNumber;

    public int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명인가요?(1 ~ " + memberNumber + "): ");
        inputNumber = scanner.nextInt();
        while (inputNumber == 0 || inputNumber > memberNumber) {
            System.out.print("멤버 숫자 이내로 입력해주세요: ");
            inputNumber = scanner.nextInt();
        }
        scanner.close();
        return inputNumber;
    }

    public int[] getRandomNumber(int inputNumber) {
        this.inputNumber = inputNumber;
        Random random = new Random();
        int array[] = new int[inputNumber];
        for(int i=0; i < inputNumber; i++) {
            array[i] = random.nextInt(memberNumber);
        }
        return array;
    }

//public String pickMember()

}


public class RandomMember {
    public static void main(String[] args) {
        Member m = new Member();
        int n = m.getInputNumber();
        int array[];
        array = m.getRandomNumber(n);
        System.out.println(array);
    }
}
