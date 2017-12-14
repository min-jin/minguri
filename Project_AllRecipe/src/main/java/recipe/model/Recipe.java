package recipe.model;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class Recipe {
	
	private String recnum;		//�젅�떆�뵾 �꽆踰�
	private String writer;		//�옉�꽦�옄
	
	@NotEmpty(message = "�젣紐� �엯�젰�빐�빞�빀�땲�떎")
	private String psubject;	//�젣紐�
	
	@NotEmpty(message = "�냼媛쒓� �궓寃⑥빞 �빀�땲�떎")
	private String intro;		//�꽕紐�
	
	private String mainimage;	// �씠誘몄�
	private MultipartFile mainupload;	// �씠誘몄�
	
	@NotEmpty(message = "")
	private int kind;		//醫낅쪟
	
	@NotEmpty(message = "")
	private int situation;		//�긽�솴
	
	@NotEmpty(message = "")
	private int method;		//諛⑸쾿
	
	@NotEmpty(message = "")
	private int ingredient;	//�떇�옱猷�
	
	private String person;		//紐뉗씤遺�
	private String time;		//�슂由ъ떆媛�
	private String movieurl;	//�룞�쁺�긽 留곹겕 二쇱냼
	private int scrap;		//�뒪�겕�옪�닔
	private String image1;	//�씠誘몄�1
	private String image2;	//�씠誘몄�2
	private String image3;	//�씠誘몄�3
	private String image4;	//�씠誘몄�4
	
	private MultipartFile upload1;	//�씠誘몄�1
	private MultipartFile upload2;	//�씠誘몄�2
	private MultipartFile upload3;	//�씠誘몄�3
	private MultipartFile upload4;	//�씠誘몄�4
	private Timestamp inputdate;	//�옉�꽦�씪
	
	public Recipe() {
		
	}

	public String getRecnum() {
		return recnum;
	}

	public void setRecnum(String recnum) {
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

	public MultipartFile getMainupload() {
		return mainupload;
	}

	public void setMainupload(MultipartFile mainupload) {
		this.mainupload = mainupload;
		
		if(this.mainupload != null) {// �씠誘몄� �뾽濡쒕뱶 �떎�뙣�떆
			this.mainimage=mainupload.getOriginalFilename();
		}
		
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

	public MultipartFile getUpload1() {
		return mainupload;
	}

	public void setUpload1(MultipartFile upload1) {
		this.upload1 = upload1;
		
		if(this.upload1 != null) {// �씠誘몄� �뾽濡쒕뱶 �떎�뙣�떆
			this.image1=upload1.getOriginalFilename();
		}
		
	}

	public MultipartFile getUpload2() {
		return mainupload;
	}

	public void setUpload2(MultipartFile upload2) {
		this.upload2 = upload2;
		
		if(this.upload2 != null) {// �씠誘몄� �뾽濡쒕뱶 �떎�뙣�떆
			this.image2=upload2.getOriginalFilename();
		}
		
	}

	public MultipartFile getUpload3() {
		return mainupload;
	}

	public void setUpload3(MultipartFile upload3) {
		this.upload3 = upload3;
		
		if(this.upload3 != null) {// �씠誘몄� �뾽濡쒕뱶 �떎�뙣�떆
			this.image3=upload3.getOriginalFilename();
		}
		
	}

	public MultipartFile getUpload4() {
		return mainupload;
	}

	public void setUpload4(MultipartFile upload4) {
		this.upload4 = upload4;
		
		if(this.upload4 != null) {// �씠誘몄� �뾽濡쒕뱶 �떎�뙣�떆
			this.image4=upload4.getOriginalFilename();
		}
		
	}

	public Timestamp getInputdate() {
		return inputdate;
	}

	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}

	public String getMainimage() {
		return mainimage;
	}

	public void setMainimage(String mainimage) {
		this.mainimage = mainimage;
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

	
}
/*create table recipe(
		   recnum      number primary key,   
		   writer      varchar2(30) references allmember(id) on delete set null,
		   psubject   varchar2(60) default '�젣紐⑹뾾�쓬',
		   intro      varchar2(2000),      --�냼媛�
		   mainimage   varchar2(40),      --��臾몄씠誘몄�
		   kind       number,            --醫낅쪟   
		   situation   number,            --�긽�솴
		   method      number,            --諛⑸쾿
		   ingredient   number,            --�옱猷�
		   person      varchar2(20),      --�씤�썝�닔
		   time      varchar2(20),      --�슂由ъ떆媛�
		   movieurl   varchar2(60),      --�룞�쁺�긽 留곹겕二쇱냼
		   scrap      number default 0,   --�뒪�겕�옪�닔
		   image1      varchar2(40),      -- �씠誘몄�1
		   image2      varchar2(40),      -- �씠誘몄�2
		   image3      varchar2(40),      -- �씠誘몄�3
		   image4      varchar2(40),      -- �씠誘몄�4
		   inputdate   date default sysdate -- �옉�꽦�씪
		);
*/