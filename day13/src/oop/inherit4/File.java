package oop.inherit4;

public class File {
	private String filename;
	private long filesize;//실제 파일크기는 long
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public long getFilesize() {
		return filesize;
	}
	public void setFilesize(long filesize) {
		if(filesize <0L) return;//앞에서 배운건 다 쓰도록!!! 
		this.filesize = filesize;
	}
	
	public void execute() {
		System.out.println("실행");
	}

}
