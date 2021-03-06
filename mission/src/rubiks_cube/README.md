### 루빅스 큐빅 구현
1단계: 단어 밀어내기

- 입력: 사용자로부터 단어하나, 정수 숫자 하나(-100 <= N < 100), L또는 R을 입력받는다. L또는 R은 대소문자 모두 입력 가능하다.
- 주어진 단어를 L이면 주어진 숫자 갯수만큼 왼쪽으로, R이면 오른쪽으로 밀어낸다.
- 밀려나간 단어는 반대쩍으로 채워진다.

입력 및 출력 예시
홀수 줄은 입력, 짝수 줄은 출력이다.

> apple 3 L   
leapp

> banana 6 R   
banana

> carrot -1 r   
arrotc

> cat -4 R   
atc

#### 1단계 코딩 요구사항
컴파일 및 실행되지 않을 경우 불합격   
자기만의 기준으로 최대한 간결하게 코드를 작성한다.
____
2.단계: 평면 큐브 구현하기

- 3 X 3의 2차원 배열이 아래처럼 있다.
>  R R W   
G C W   
G B B
- 사용자가 입력을 받아서 아래의 동작을 하는 프로그램을 구현하시오
> U 가장 윗줄을 왼쪽으로 한 칸 밀기 RRW -> RWR   
> U' 가장 윗줄을 오른쪽으로 한 칸 밀기 RRW -> WRR   
> R 가장 오른쪽 줄을 위로 한 칸 밀기 WWB -> WBW   
> R' 가장 오른쪽 줄을 아래로 한 칸 밀기 WWB -> BWW   
> L 가장 왼쪽 줄을 아래로 한 칸 밀기 RGG -> GRG (L의 경우 R과 방향이 반대임을 주의한다.)   
> L' 가장 왼쪽 줄을 위로 한 칸 밀기 RGG -> GGR   
> B 가장 아랫줄을 오른쪽으로 한 칸 밀기 GBB -> BGB (B의 경우도 U와 방향이 반대임을 주의한다.)   
> B' 가장 아랫줄을 왼쪽으로 한 칸 밀기 GBB -> BBG   
> Q Bye~를 출력하고 프로그램을 종료한다.
- 요구사항   
  처음 시작하면 초기 상태를 출력한다.   
  간단한 프롬프트 (CLI에서 키보드 입력받기 전에 표시해주는 간단한 글자들 - 예: CUBE> )를 표시해 준다.
  한 번에 여러 문자를 입력받은 경우 순서대로 처리해서 매 과정을 화면에 출력한다.
- 동작 예시
```  
R R W
G C W
G B B

CUBE> UUR

U
R W R
G C W
G B B

U
W R R
G C W
G B B

R
W R W
G C B
G B R

CUBE> Q
Bye~ 
```
#### 2단계 코딩 요구사항
너무 크지 않은 함수 단위로 구현하려고 노력할 것   
전역변수의 사용을 자제할 것   
객체와 배열을 적절히 활용할 것
____
