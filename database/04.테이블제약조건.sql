/*
	테이블 제약 조건(table constraint)
	- 보관할 데이터의 유효성을 검사하기 위하여 컬럼에 설정하는 조건
	- and라는 키워드로 && 처리를 한다
	- or이라는 키워드로 || 처리를 한다
	- not이라는 키워드로 ! 처리를 한다
	- between은 ~이상 ~이하 처리를 한다(구간 설정)
	
	조건의 종류
	- check : 추가할 데이터의 형식 검사를 설정
*/

drop table score;
create table score(
grade number check(grade >= 1),
room number check(room >= 1),
name varchar2(21) check(regexp_like(name,'^[가-힣]{2,7}$')),
--korean number(3) check(korean >= 0 and korean <= 100),
korean number(3) check(korean between 0 and 100),
english number(3) check(english between 0 and 100),
math number(3) check(math between 0 and 100)
);

-- 지정된 형식을 벗어나는 값은 추가되지 않음
insert into score(grade, room, name, korean, english, math)
values(-5, 1, '테스트', 10, 20, 30);

