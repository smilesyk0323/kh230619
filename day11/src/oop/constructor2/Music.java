package oop.constructor2;

public class Music {
	//멤버 필드 - 데이터 
	String name;
	String artist;
	String album;
	long play;
	int like;
	
	//멤버 메소드 - 코드 	
	void setName(String name) {
		this.name = name;
	}
	void setSinger(String artist) {
		this.artist = artist;
	}
	void setAlbum(String album) {	
		this.album = album;
	}
	void setPlay(long play) {
		if( play < 0L ) return;//L은 안써도 되지만 의식적으로 표시하기	
		this.play = play;
	}
	void setLike(int like) {
		if(like < 0 ) return;
		this.like = like;
	}


	String getName() {
		return this.name;
	}
	String getArtist() {
		return this.artist;
	}
	String getAlbum() {
		return this.album;
	}
	long getPlay() {
		return this.play;
	}
	int getLike() {
		return this.like;
	}
	
	
	String getBest() {
		if( play > 100000L) {
			return"(베스트)";	
		}
		else {
			return"";
		}
	}
	String getLove() {
		if(like > 100000) { 
			return"(인기곡)";
		}
		else {
			return"";
		}
	}
	
		long getRank() {
		return (this.play * 2) + (this.like /2);
	}
		
	
	
	//생성자 - 초기화 
		Music(String name, String artist, String album){
			this(name, artist, album, 0L, 0);
		}
		Music(String name, String artist, String album, long play, int like){
			this.setName(name);		
			this.setSinger(artist);		
			this.setAlbum (album);	
			this.setPlay (play);		
			this.setLike (like);
		}
		
	
	
	void show() {
		System.out.println("<음원정보>");
		System.out.println("제목: "+ this.name+this.getBest()+this.getLove());
		System.out.println("가수: "+ this.artist);
		System.out.println("앨범:"+this.album);
		System.out.println("재생수: "+this.play);
		System.out.println("좋아요: "+this.like);
		System.out.println("랭킹점수: "+this.getRank()+"점");
	}
	
	
	
}
