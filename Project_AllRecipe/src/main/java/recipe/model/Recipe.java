package recipe.model;

import java.sql.Timestamp;

public class Recipe {
	private int recnum;
	private String writer;
	private String psubject;
	private String intro;
	private String mainimage;
	private int kind;
	private int situation;
	private int method;
	private int ingredient;
	private String person;
	private String tume;
	private String movieurl;
	private int scrap;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private Timestamp inputdate;
	public Recipe() {
		super();
	}
	public Recipe(int recnum, String writer, String psubject, String intro, String mainimage, int kind, int situation,
			int method, int ingredient, String person, String tume, String movieurl, int scrap, String image1,
			String image2, String image3, String image4, Timestamp inputdate) {
		super();
		this.recnum = recnum;
		this.writer = writer;
		this.psubject = psubject;
		this.intro = intro;
		this.mainimage = mainimage;
		this.kind = kind;
		this.situation = situation;
		this.method = method;
		this.ingredient = ingredient;
		this.person = person;
		this.tume = tume;
		this.movieurl = movieurl;
		this.scrap = scrap;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.inputdate = inputdate;
	}
	public int getRecnum() {
		return recnum;
	}
	public void setRecnum(int recnum) {
		this.recnum = recnum;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPsubject() {
		return psubject;
	}
	public void setPsubject(String psubject) {
		this.psubject = psubject;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getMainimage() {
		return mainimage;
	}
	public void setMainimage(String mainimage) {
		this.mainimage = mainimage;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public int getSituation() {
		return situation;
	}
	public void setSituation(int situation) {
		this.situation = situation;
	}
	public int getMethod() {
		return method;
	}
	public void setMethod(int method) {
		this.method = method;
	}
	public int getIngredient() {
		return ingredient;
	}
	public void setIngredient(int ingredient) {
		this.ingredient = ingredient;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getTume() {
		return tume;
	}
	public void setTume(String tume) {
		this.tume = tume;
	}
	public String getMovieurl() {
		return movieurl;
	}
	public void setMovieurl(String movieurl) {
		this.movieurl = movieurl;
	}
	public int getScrap() {
		return scrap;
	}
	public void setScrap(int scrap) {
		this.scrap = scrap;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public Timestamp getInputdate() {
		return inputdate;
	}
	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}
	@Override
	public String toString() {
		return "Recipe [recnum=" + recnum + ", writer=" + writer + ", psubject=" + psubject + ", intro=" + intro
				+ ", mainimage=" + mainimage + ", kind=" + kind + ", situation=" + situation + ", method=" + method
				+ ", ingredient=" + ingredient + ", person=" + person + ", tume=" + tume + ", movieurl=" + movieurl
				+ ", scrap=" + scrap + ", image1=" + image1 + ", image2=" + image2 + ", image3=" + image3 + ", image4="
				+ image4 + ", inputdate=" + inputdate + "]";
	}
	
	
	
}
