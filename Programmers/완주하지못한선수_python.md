# Python: 완주하지 못한 선수(Hash, Level1)

java로 풀었던 알고리즘을 파이썬으로. 매우 간단해졌다.



### :heavy_check_mark: 문제풀이 (#1) Arrays.sort

```python
def solution(participant, completion):
    participant.sort()
    completion.sort()
    for p, c in zip(participant, completion):
        if p != c:
            return p
    return participant[-1]
```



### 문제풀이 소감 :memo:

index가 같은 list를 (for문으로) 돌릴 때 : **zip (`list` , `list` )** 로 사용한다.

진짜 파이썬으로 알고리즘 공부가 쉽다더니 ㅎ... 심지어 list[-1] : 리스트의 마지막 인덱스로 돌아감!!! ~~유레카~~! 퇴근할 때 폰으로 샤샥 썼는데 쓰는데도 얼마 안걸리고 편안함.



<br><br>



--------

### 다른 사람의 문제 풀이:eyes:

<br><br>

### :heavy_check_mark: 문제풀이 2: collections

```python
import collections

def solution(participant, completion):
    answer = collections.Counter(participant) - collections.Counter(completion)
    return list(answer.keys())[0]
```

내가 푼 코드를 좀 더 쉽게 설명한 것.

- `collections.Counter()` 는 iterable한 sorted list로 만들어버린다. 심지어 `-` 연산자를 통해서 포함하고 있지 않은 값을 뱉어냄....ㅋ 파이썬 라이브러리 대단.. 이걸 찾아서 or 알고 쓴 사람도 대단...

- answer는 `key-value` 값으로 이루어진 dict 형이기 때문에, `가나다` 라는 사람이 남았다면 

  ```python
  answer = {'가나다'=1}
  ```

  의 형식으로 나옴. 따라서 `이름`을 알고자 하니 `key` 값을 반환하는 메서드를 씀. 

- `dict.keys()` 를 통해 몇개가 나올지 모르고, 해당 값들은 iterable 하기 때문에 list()형식으로 변환 -> 그 값 중 첫번째 값을 `return` 한다고 명시.



<br><br>

### :heavy_check_mark: 문제풀이 3: hash의 특징을 이용

```python
def solution(participant, completion):
    answer = ''
    temp = 0
    dic = {}
    for part in participant:
        dic[hash(part)] = part
        temp += int(hash(part))
    for com in completion:
        temp -= hash(com)
    answer = dic[temp]

    return answer
```

- `participant - completion == temp에 남은 값`이라는 점을 이용
- 이 부분이 **중요**!! 
  파트를 해시 value로, 각 participant (즉 `part`)를 해시 키값으로.
  - 일단 temp에 들어갔다 나갔다 하는 값들이 다 hash로 된 값이라, temp 자체가 hash 키값을 가리킴.



- 소감 : 딕셔너리를 사용한다는 점이 매우 신박했다. 대충 알고 쓰지말자 ㅠ_ㅠ 오늘도 다짐...





