package talk.model;

import java.sql.Timestamp;

public class Talk {
	private int tnum;
	private String tid;
	private String tcontent;
	private String timage;
	private Timestamp inputdate;
	public Talk() {
		super();
	}
	public Talk(int tnum, String tid, String tcontent, String timage, Timestamp inputdate) {
		super();
		this.tnum = tnum;
		this.tid = tid;
		this.tcontent = tcontent;
		this.timage = timage;
		this.inputdate = inputdate;
	}
	public int getTnum() {
		return tnum;
	}
	public void setTnum(int tnum) {
		this.tnum = tnum;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTcontent() {
		return tcontent;
	}
	public void setTcontent(String tcontent) {
		this.tcontent = tcontent;
	}
	public String getTimage() {
		return timage;
	}
	public void setTimage(String timage) {
		this.timage = timage;
	}
	public Timestamp getInputdate() {
		return inputdate;
	}
	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}
	@Override
	public String toString() {
		return "Talk [tnum=" + tnum + ", tid=" + tid + ", tcontent=" + tcontent + ", timage=" + timage + ", inputdate="
				+ inputdate + "]";
	}
	
}
