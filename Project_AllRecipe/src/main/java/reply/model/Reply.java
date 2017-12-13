package reply.model;

import java.sql.Timestamp;

public class Reply {
	private int renum;
	private String cate;
	private int canum;
	private String rewriter;
	private String content;
	private int ref;
	private int restep;
	private int relevel;
	private Timestamp inputdate;
	public Reply() {
		super();
	}
	public Reply(int renum, String cate, int canum, String rewriter, String content, int ref, int restep, int relevel,
			Timestamp inputdate) {
		super();
		this.renum = renum;
		this.cate = cate;
		this.canum = canum;
		this.rewriter = rewriter;
		this.content = content;
		this.ref = ref;
		this.restep = restep;
		this.relevel = relevel;
		this.inputdate = inputdate;
	}
	public int getRenum() {
		return renum;
	}
	public void setRenum(int renum) {
		this.renum = renum;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public int getCanum() {
		return canum;
	}
	public void setCanum(int canum) {
		this.canum = canum;
	}
	public String getRewriter() {
		return rewriter;
	}
	public void setRewriter(String rewriter) {
		this.rewriter = rewriter;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getRestep() {
		return restep;
	}
	public void setRestep(int restep) {
		this.restep = restep;
	}
	public int getRelevel() {
		return relevel;
	}
	public void setRelevel(int relevel) {
		this.relevel = relevel;
	}
	public Timestamp getInputdate() {
		return inputdate;
	}
	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}
	@Override
	public String toString() {
		return "Reply [renum=" + renum + ", cate=" + cate + ", canum=" + canum + ", rewriter=" + rewriter + ", content="
				+ content + ", ref=" + ref + ", restep=" + restep + ", relevel=" + relevel + ", inputdate=" + inputdate
				+ "]";
	}
	
	
}
