package com.kh.springhome.vo;

import lombok.Data;

//VO(Value Object) 
//- 내 입맛대로 데이터를 모아서 저장하는 클래스(DB무관)
//- 등록하지 않고 필요할 때마다 만들어서 사용 
@Data
public class PaginationVO {
		private String type, keyword;//검색 분류 및 키워드 
		private int page = 1; // 현재 페이지 번호(기본:1)(기본값 지정 가능=default)
		private int size = 10; //보여줄 게시판의 글 수 (기본:10)		
		private int count;//전체 글 수 (DB에서 글 수를 가져와야함)
		private int navigatorSize=10;//하단 네비게이터 표시 개수(기본:10)
		
		public boolean isSearch() {
			return type != null && keyword != null;
		}		
		//------------페이지에서 필요한 가상 메소드들 ----------
		//(페이징-네비게이터) 이전/다음 버튼 생성
		public int getBegin() {//시작
			return (page-1)/navigatorSize*navigatorSize+1;//(page-1)/10*10-1;//10이라는 보장이없음
		}
		public int getEnd() {//끝
			int end = getBegin() + navigatorSize-1;
			return Math.min(getPageCount(), end);//count랑 end중에 작은걸로 바꿔줘라
		}
		public boolean isFirst() {//처음이냐
			return getBegin() == 1;//시작번호가 1과 같으면
		}
		public String getPrevQueryString() {//이전 버튼 생성시 링크
			if(isSearch()) {//검색
				return "page="+(getBegin()-1)+"&size="+size+"&type="+type+"&keyword="+keyword;
			}
			else {//목록
				return "page="+(getBegin()-1)+"&size="+size;
			}
		}
		public String getNextQueryString() {//다음 버튼 생성시 링크
			if(isSearch()) {//검색
				return "page="+(getEnd()+1)+"&size="+size+"&type="+type+"&keyword="+keyword;
			}
			else {//목록
				return "page="+(getEnd()+1)+"&size="+size;
			}
		}		
		public int getPageCount() {//페이지 갯수 구하는 
			return (count-1) / size + 1;
		}
		public boolean isLast() {//계산된 끝번호 >= 페이지갯수
			return getEnd() >= getPageCount();
		}	
		public String getQueryString(int page) {//전달된 번호로 링크페이지로
			if(isSearch()) {//검색
				return "page="+page+"&size="+size+"&type="+type+"&keyword="+keyword;
			}
			else {//목록
				return "page="+page+"&size="+size;
			}
		}
		public int getStartRow() {
			return getFinishRow() - (size-1);
		}
		public int getFinishRow() {
			return page * size;
		}
		
}


















