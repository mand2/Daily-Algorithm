# 124 나라의 숫자

124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

1. 124 나라에는 자연수만 존재합니다.
2. 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.

예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

| 10진법 | 124 나라 | 10진법 | 124 나라 |
| ------ | -------- | ------ | -------- |
| 1      | 1        | 6      | 14       |
| 2      | 2        | 7      | 21       |
| 3      | 4        | 8      | 22       |
| 4      | 11       | 9      | 24       |
| 5      | 12       | 10     | 41       |

자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

<br><br>

### A1 풀이

가장 길지만 평균 회답시간이 가장 짧음, 모든 풀이의 채점결과는 정확성 70 효율성 30 이었음.

```java
class Solution {
  public String solution(int n) {
      String answer = "";
      int tmp;
          while(n>0){
              tmp = n % 3;
              n = n / 3;
              if(tmp == 0){
                  n--;
                  tmp = 4;
              }
              answer = tmp + answer;

          }
      return answer;
  }
}
```

String + int = String이라는 걸 다시금 알게된 날,,

<br>

<br>

### A2 풀이

```java
class Solution {
  public String solution(int n) {    
      String answer = "";
      String[] basket = { "4", "1", "2" };
      int tmp;
      
      while (n > 0) {
		tmp = n % 3;
        n = (n-1) / 3;
        answer = basket[tmp] + answer;  
		}
            
      return answer;
  }
}
```









<br><br>

### A3 풀이

가장 짧음 그러나 배열을 사용해서 회답시간이 가장 길다
```java
class Solution {
  public String solution(int n) {    
      String answer = "";
      String[] basket = { "4", "1", "2" };
      
      while (n > 0) {
		answer = basket[n % 3] + answer;
        n = (n-1) / 3;
      }
            
      return answer;
  }
}
```

