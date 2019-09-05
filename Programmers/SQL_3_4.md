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



### Q3 아픈 동물 찾기

동물 보호소에 들어온 동물 중 아픈 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.

1 `INTAKE_CONDITION`이 Sick 인 경우를 뜻함 



```mysql
SELECT animal_id, name from animal_ins 
where intake_condition = 'Sick'
```

<br>

<br>

### Q4 어린 동물 찾기

동물 보호소에 들어온 동물 중 젊은 동물2의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.

2 `INTAKE_CONDITION`이 Aged가 아닌 경우를 뜻함



```mysql
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS 
where INTAKE_CONDITION != 'Aged'
```



------

오늘의 깨달음: 수식 `!=` 의 존재!!

<br>

<br>

