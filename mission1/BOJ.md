# BOJ 자바 연습

### 1. 조건문 연습

##### 1) 두 수 비교하기

```java
// 백준에서 자바를 사용하기 위해서는 항상 클래스 이름을 Main으로 해야하고 그렇지 않으면 컴파일 에러 발생!
// 괄호와 ; 주의하기
public class Main{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          if(a>b) {
              System.out.println(">");
          }
          if(a<b) {
              System.out.println("<");
          }
          if(a == b) {
              System.out.println("==");
          } 
     }
}
```

##### 2) 시험 성적

```java
// 객체지향 생활체조 원칙에 따라 else 예약어를 지양하고자 하였다. 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score >= 90)
            System.out.println("A");
        if((score >= 80 && score < 90))
            System.out.println("B");
        if((score >= 70 && score < 80))
            System.out.println("C");
        if((score >= 60 && score < 70))
            System.out.println("D");
        if(score < 60)
            System.out.println("F");
            
    }
}
```

##### 3) 윤년

```java
// else를 지양하고자 경우의 수를 쪼갰으나 출력이 2개씩 되어 결국 else로 처리하였다.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0) && (((year % 100 != 0) || (year % 400 == 0))))
            System.out.println(1);
        else 
            System.out.println(0);
    }
}
```

##### 4) 사분면 고르기

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0)
            System.out.println(1);
        if(x < 0 && y > 0)
            System.out.println(2);
        if(x < 0 && y < 0)
            System.out.println(3);
        if(x > 0 && y < 0)
            System.out.println(4);
    }
}
```

##### 5) 알람 시계

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(M >= 45)
            System.out.print(H + " " + (M-45));
        if(M < 45 && H == 0)
            System.out.print(23 + " " + (M+15));
        if(M < 45 && H > 0)
            System.out.println(H-1 + " " + (M+15));
    }
}
```

### 2. 반복문 연습

##### 1) 별 찍기 - 1

```java
// 해결하지 못하여 구글링을 참고하였고 println과 print의 차이를 알게되었다. 그전까지는 단순히 자바에서의 print가 println인줄 알았다...
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

##### 2) 숫자의 합

```java
// a.charAt(i)는 파이썬의 a[i]. 다만 이때 반환된 값을 int로 변환하는 과정에서 아스키코드 값을 반환. 즉 ord(a[i])라고 보면될것 같다
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();
        sc.close(); 
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += a.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

