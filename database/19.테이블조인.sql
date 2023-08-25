-------------------------------------------------
--테이블 조인(Table Join):서로 다른 테이블을 합쳐서 조회
------------------------------------------------
select * from member;
select * from board;

--[1] cross join : 두 테이블을 곱하여 출력 
select member_id, board_no, board_writer from member, board;

--[2] inner join : 둘 다 있는 경우 연결하여 출력(커플만 출력)
select member_id, member_nickname, board_no, board_writer
from member inner join board 
	on member.member_id = board.board_writer;

--[3] outer join : 한 쪽을 기준으로 연결하여 출력 (솔로+커플 모두 출력)
select member_id, member_nickname, board_no, board_writer
from member right outer join board 
	on member.member_id = board.board_writer;

select member_id, member_nickname, board_no, board_writer
from board left outer join member 
	on member.member_id = board.board_writer;

--완성된 구문
select member_nickname, board.*
from board left outer join member 
	on member.member_id = board.board_writer;

--완성된 구문을 View에 저장하는 코드 
drop view board_list;
create or replace view board_list as 
select 
member_nickname, board.board_no,
board.board_writer, board.board_title,
board.board_readcount, board.board_likecount,
board.board_ctime, board.board_utime
from board left outer join member 
	on member.member_id = board.board_writer;

select * from board_list;
