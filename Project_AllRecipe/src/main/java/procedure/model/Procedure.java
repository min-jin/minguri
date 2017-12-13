package procedure.model;

public class Procedure {
	private int pronum;
	private int recnum;
	private String procontent;
	private String proimage;
	private int prostep;
	public Procedure() {
		super();
	}
	public Procedure(int pronum, int recnum, String procontent, String proimage, int prostep) {
		super();
		this.pronum = pronum;
		this.recnum = recnum;
		this.procontent = procontent;
		this.proimage = proimage;
		this.prostep = prostep;
	}
	public int getPronum() {
		return pronum;
	}
	public void setPronum(int pronum) {
		this.pronum = pronum;
	}
	public int getRecnum() {
		return recnum;
	}
	public void setRecnum(int recnum) {
		this.recnum = recnum;
	}
	public String getProcontent() {
		return procontent;
	}
	public void setProcontent(String procontent) {
		this.procontent = procontent;
	}
	public String getProimage() {
		return proimage;
	}
	public void setProimage(String proimage) {
		this.proimage = proimage;
	}
	public int getProstep() {
		return prostep;
	}
	public void setProstep(int prostep) {
		this.prostep = prostep;
	}
	@Override
	public String toString() {
		return "Procedure [pronum=" + pronum + ", recnum=" + recnum + ", procontent=" + procontent + ", proimage="
				+ proimage + ", prostep=" + prostep + "]";
	}
	
	
}
