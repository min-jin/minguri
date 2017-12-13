package opinion.model;

import java.sql.Timestamp;

public class Opinion {
	private int opnum;
	private String category;
	private String opid;
	private String opsubject;
	private String opcontent;
	private Timestamp currdate;
	public Opinion() {
		super();
	}
	public Opinion(int opnum, String category, String opid, String opsubject, String opcontent, Timestamp currdate) {
		super();
		this.opnum = opnum;
		this.category = category;
		this.opid = opid;
		this.opsubject = opsubject;
		this.opcontent = opcontent;
		this.currdate = currdate;
	}
	public int getOpnum() {
		return opnum;
	}
	public void setOpnum(int opnum) {
		this.opnum = opnum;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOpid() {
		return opid;
	}
	public void setOpid(String opid) {
		this.opid = opid;
	}
	public String getOpsubject() {
		return opsubject;
	}
	public void setOpsubject(String opsubject) {
		this.opsubject = opsubject;
	}
	public String getOpcontent() {
		return opcontent;
	}
	public void setOpcontent(String opcontent) {
		this.opcontent = opcontent;
	}
	public Timestamp getCurrdate() {
		return currdate;
	}
	public void setCurrdate(Timestamp currdate) {
		this.currdate = currdate;
	}
	@Override
	public String toString() {
		return "Opinion [opnum=" + opnum + ", category=" + category + ", opid=" + opid + ", opsubject=" + opsubject
				+ ", opcontent=" + opcontent + ", currdate=" + currdate + "]";
	}
	
	
}
