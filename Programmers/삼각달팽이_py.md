# 삼각달팽이(level 2, 월간코드챌린지9월)

###### 문제 설명

정수 n이 매개변수로 주어집니다. 다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기를 진행한 후, 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성해주세요.

![examples.png](https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/e1e53b93-dcdf-446f-b47f-e8ec1292a5e0/examples.png)

------

##### 제한사항

- n은 1 이상 1,000 이하입니다.

------

##### 입출력 예

| n    | result                                                    |
| ---- | --------------------------------------------------------- |
| 4    | `[1,2,9,3,10,8,4,5,6,7]`                                  |
| 5    | `[1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]`                   |
| 6    | `[1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]` |





### :heavy_check_mark: 문제풀이 (#1) 

```python
def solution(n):
    answer = [[0 for x in range(y)] for y in range(1, n + 1)]
    
    num = 1
    x = -1
    y = 0
    test = n % 3
    for i in range(n, 0, -1):
        for j in range(i):
            if n % 3 == test:
                x = x + 1
            elif n % 3 == (test - 1) or n % 3 == (test + 2):
                y += 1
            else:
                print('else')
                x -= 1
                y -= 1
            answer[x][y] = num
            num = num + 1

        n = n - 1

    import itertools
    print(list(itertools.chain(*answer)))
```



| 테스트 1 〉 | 통과 (0.01ms, 10.1MB)   |
| ----------- | ----------------------- |
| 테스트 2 〉 | 통과 (0.01ms, 10.2MB)   |
| 테스트 3 〉 | 통과 (0.02ms, 10.1MB)   |
| 테스트 4 〉 | 통과 (1.45ms, 10.9MB)   |
| 테스트 5 〉 | 통과 (1.54ms, 10.8MB)   |
| 테스트 6 〉 | 통과 (1.69ms, 10.8MB)   |
| 테스트 7 〉 | 통과 (121.97ms, 56.8MB) |
| 테스트 8 〉 | 통과 (130.40ms, 60MB)   |
| 테스트 9 〉 | 통과 (129.71ms, 59.9MB) |







### :heavy_check_mark: 문제풀이 (#2) 

```python
def solution(n):
    mat = [[0 for _ in range(n)] for _ in range(n)]
    length = n*(n+1)//2
    mode = 0  # 0 : go down, 1 : go right, 2 : go up
    i, x, y, rotate = 1, 0, 0, 0
    while i <= length:
        mat[x][y] = i
        if mode == 0:  # go down
            x, y = x+1, y
            if x == n - rotate or mat[x][y] != 0:
                mode, x, y = 1, x-1, y+1
        elif mode == 1: # go right
            x, y = x, y+1
            if y == n - rotate or mat[x][y] != 0:
                mode, x, y = 2, x-1, y-2
        elif mode == 2: # go up
            x, y = x-1, y-1
            if mat[x][y] != 0:
                rotate += 1
                mode, x, y = 0, x+2, y+1
        i += 1

    return [elem for row in mat for elem in row if elem!=0]
```

| 테스트 1 〉 | 통과 (0.01ms, 10.2MB)   |
| ----------- | ----------------------- |
| 테스트 2 〉 | 통과 (0.01ms, 10.2MB)   |
| 테스트 3 〉 | 통과 (0.01ms, 10.3MB)   |
| 테스트 4 〉 | 통과 (2.75ms, 10.9MB)   |
| 테스트 5 〉 | 통과 (1.84ms, 10.9MB)   |
| 테스트 6 〉 | 통과 (1.93ms, 10.8MB)   |
| 테스트 7 〉 | 통과 (195.18ms, 62.1MB) |
| 테스트 8 〉 | 통과 (179.76ms, 62.3MB) |
| 테스트 9 〉 | 통과 (194.07ms, 63.9MB) |

다른 사람의 풀이. 처음부터 mode를 나눠서 준 것도 좋은 듯. n+1 씩 증가하는 방법을 찾기가 어려워서 그냥 내 방식대로 풀었음.. 시간과 메모리용량을 조금 더 소모하게 된다.





#### 후기

은근 시간이 오래 걸렸다. 생각해낸 방향은 맞는데, 그걸 구현하기가 오래 걸린듯. 아마 챌린지 했으면 이 문제까지만 풀고 끝났을 듯하다.

문제풀이 팁 : n = 8 이라면 876 /543/ 21 식으로 각 mode 가 달라짐 (down / right / up)