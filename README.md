# java-lotto-precourse
# [로또]

## 기능

사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력한다.

### 로또
- 로또 번호는 1~45 까지의 숫자 범위를 갖는다.
- 로또 1장의 가격은 1000원이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.

### 당첨
- 당첨은 1등부터 5등까지 있다
  - 1등 : 6개 번호 일치 / 2,000,000,000원
  - 2등 : 5개 번호 + 보너스 번호 일치 / 30,000,000원
  - 3등: 5개 번호 일치 / 1,500,000원
  - 4등: 4개 번호 일치 / 50,000원
  - 5등: 3개 번호 일치 / 5,000원
    
### 입력
1. 사용자에게 로또 구입 금액을 입력받는다.
  - 구입 금액은 1,000원 단위이다.
  - 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다.
2. 사용자에게 당첨 번호와 보너스 번호를 입력받는다
  - 중복되지 않는 6개 숫자와 보너스 번호 1개
 
### 출력
1. 발행한 로또 수량 및 번호를 출력한다.
  - 로또 번호는 오름차순으로 정렬하여 보여준다.
2. 당첨 내역을 출력한다.
  - 5등 부터 1등까지 각 당첨 조건과 상금을 출력한다.
  - 각 등수마다 당첨된 로또 갯수를 출력한다.
  - n개 일치 (0,000원) - 0개
3. 총 수익률을 출력한다.
  - 수익률은 소수점 둘째 자리에서 반올림한다.
  - 총 수익률은 00.0%입니다.
4. 예외 상황 시 에러 문구를 출력해야 한다.
  - 에러 문구는 [ERROR] 로 시작해야 한다.
  - [ERROR 로또 번호는 1부터 45 사이의 숫자여야 합니다.

### 예외
