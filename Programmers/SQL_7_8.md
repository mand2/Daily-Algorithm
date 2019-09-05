# SQL 공통 지문

`ANIMAL_INS` 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. `ANIMAL_INS` 테이블 구조는 다음과 같으며, `ANIMAL_ID`, `ANIMAL_TYPE`, `DATETIME`, `INTAKE_CONDITION`, `NAME`, `SEX_UPON_INTAKE`는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

| NAME             | TYPE       | NULLABLE |
| ---------------- | ---------- | -------- |
| ANIMAL_ID        | VARCHAR(N) | FALSE    |
| ANIMAL_TYPE      | VARCHAR(N) | FALSE    |
| DATETIME         | DATETIME   | FALSE    |
| INTAKE_CONDITION | VARCHAR(N) | FALSE    |
| NAME             | VARCHAR(N) | TRUE     |
| SEX_UPON_INTAKE  | VARCHAR(N) | FALSE    |



### Q7 고양이와 개는 몇 마리 있을까

동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회하는 SQL문을 작성해주세요. 이때 고양이가 개보다 먼저 조회해주세요.

```mysql
SELECT ANIMAL_TYPE, COUNT(*) AS 'count' 
FROM ANIMAL_INS 
WHERE ANIMAL_TYPE IN ('Cat','Dog') 
group by animal_type
```

고양이의 이름이 C 로 시작해서 D 보다 앞쪽에 위치하므로 order by 생략.

<br>

<br>

### Q8 동명 동물 수 찾기

동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문을 작성해주세요. 이때 결과는 이름이 없는 동물은 집계에서 제외하며, 결과는 이름 순으로 조회해주세요.

```mysql
SELECT name, count(name) as 'COUNT' from animal_ins
group by name
having COUNT >= 2
order by name
```

문제 오류: count(*)으로 하면 정답이 아니라고 함 + 사람들의 질문도 count 함수 관련 질문.



------

오늘의 깨달음: 조건절이지만 count 같은 그룹함수를 쓸 때에는 `having` 을 쓴다.