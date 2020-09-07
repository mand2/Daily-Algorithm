인자로 0 또는 양의 정수인 x 가 주어질 때, 
Fibonacci 순열의 해당 값을 구하여 반환하는 함수 solution() 을 완성하세요.

Fibonacci 순열은 아래와 같이 정의됩니다.
F0 = 0
F1 = 1
Fn = Fn - 1 + Fn - 2, n >= 2

재귀함수 작성 연습을 의도한 것이므로, 
재귀적 방법으로도 프로그래밍해 보고, 반복적 방법으로도 프로그래밍해 보시기 바랍니다.

```python
def solution(x):
    if x <2 : return x
    return solution(x-1) + solution(x-2)
```

테스트 1 〉	통과 (0.03ms, 9.55MB)
테스트 2 〉	통과 (0.19ms, 9.58MB)
테스트 3 〉	통과 (2.58ms, 9.58MB)
테스트 4 〉	통과 (24.21ms, 9.59MB)
테스트 5 〉	통과 (248.88ms, 9.66MB)