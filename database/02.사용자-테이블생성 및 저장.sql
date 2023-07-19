-- 문제1 : 메달리스트 정보
DROP TABLE medalist;
create table medalist(
name varchar2(21),
event varchar2(12),
type varchar2(30),
gold number,
silver number,
bronze number
);

-- 문제2 : 통신사 요금제 정보
-- 통신사가 무조건 2자리라면 고정문자열 처리
-- (장점) 빠른 처리 속도
-- (단점) 글자 수가 다를 수 없음
DROP TABLE plan;
CREATE TABLE plan(
telecom char(2),
name varchar2(60),
month_price number,
DATA number,
CALL number,
sms number
);

-- 메뉴 정보 테이블
-- (참고) 테이블 자료형에는 논리가 없다
-- Y/N으로 처리하거나 1/0으로 처리
DROP TABLE menu;
CREATE TABLE menu(
name varchar2(60),
TYPE varchar2(9),
price number,
event char(1)
);

-- 데이터 저장
-- 테이블에 데이터를 저장하는 구문을 작성
-- (주의) 문자열이 외따옴표를 사용 (쌍따옴표는 별칭을 붙일 때 사용)

-- INSERT INTO 테이블이름(항목) VALUES(값);

INSERT INTO POCKETMON(NO,name,type) 
VALUES(1, '이상해씨', '풀');
INSERT INTO POCKETMON(NO,name,type) 
VALUES(4, '파이리', '불꽃');
INSERT INTO POCKETMON(NO,name,type) 
VALUES(7, '꼬부기', '물');
INSERT INTO POCKETMON(NO,name,type) 
VALUES(25, '피카츄', '전기');
INSERT INTO POCKETMON(NO,name,type) 
VALUES(26, '라이츄', '전기');

-- 조회 명령
SELECT * FROM pocketmon;

