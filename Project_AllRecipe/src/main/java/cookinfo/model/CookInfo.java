package cookinfo.model;

import java.sql.Timestamp;

public class CookInfo {
	private int infonum;
	private String infosubject;
	private String infointro;
	private String infoimage;
	private String infomovie;
	private Timestamp indate;
	public CookInfo() {
		super();
	}
	public CookInfo(int infonum, String infosubject, String infointro, String infoimage, String infomovie,
			Timestamp indate) {
		super();
		this.infonum = infonum;
		this.infosubject = infosubject;
		this.infointro = infointro;
		this.infoimage = infoimage;
		this.infomovie = infomovie;
		this.indate = indate;
	}
	public int getInfonum() {
		return infonum;
	}
	public void setInfonum(int infonum) {
		this.infonum = infonum;
	}
	public String getInfosubject() {
		return infosubject;
	}
	public void setInfosubject(String infosubject) {
		this.infosubject = infosubject;
	}
	public String getInfointro() {
		return infointro;
	}
	public void setInfointro(String infointro) {
		this.infointro = infointro;
	}
	public String getInfoimage() {
		return infoimage;
	}
	public void setInfoimage(String infoimage) {
		this.infoimage = infoimage;
	}
	public String getInfomovie() {
		return infomovie;
	}
	public void setInfomovie(String infomovie) {
		this.infomovie = infomovie;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "CookInfo [infonum=" + infonum + ", infosubject=" + infosubject + ", infointro=" + infointro
				+ ", infoimage=" + infoimage + ", infomovie=" + infomovie + ", indate=" + indate + "]";
	}
	
}
