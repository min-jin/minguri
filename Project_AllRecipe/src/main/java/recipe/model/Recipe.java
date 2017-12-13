package recipe.model;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class Recipe {
	
	private String recnum;		//레시피 넘버
	private String writer;		//작성자
	
	@NotEmpty(message = "제목 입력해야합니다")
	private String psubject;	//제목
	
	@NotEmpty(message = "소개글 남겨야 합니다")
	private String intro;		//설명
	
	private MultipartFile mainimage;	// 이미지
	
	@NotEmpty(message = "")
	private int kind;		//종류
	
	@NotEmpty(message = "")
	private int situation;		//상황
	
	@NotEmpty(message = "")
	private int method;		//방법
	
	@NotEmpty(message = "")
	private int ingredient;	//식재료
	
	private String person;		//몇인분
	private String time;		//요리시간
	private String movieurl;	//동영상 링크 주소
	private int scrap;		//스크랩수
	private MultipartFile image1;	//이미지1
	private MultipartFile image2;	//이미지2
	private MultipartFile image3;	//이미지3
	private MultipartFile image4;	//이미지4
	private Timestamp inputdate;	//작성일
	
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

	public MultipartFile getMainimage() {
		return mainimage;
	}

	public void setMainimage(MultipartFile mainimage) {
		this.mainimage = mainimage;
		
		if(this.mainimage != null) {// 이미지 업로드 실패시
			System.out.println("mainimage.getName() : " + mainimage.getName());
			System.out.println("mainimage.getOriginalFilename() : " + mainimage.getOriginalFilename());
			System.out.println("메인이미지 업로드 실패");
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

	public MultipartFile getImage1() {
		return image1;
	}

	public void setImage1(MultipartFile image1) {
		this.image1 = image1;
		if(this.image1 != null) {// 이미지1 업로드 실패시
			System.out.println("image1.getName() : " + image1.getName());
			System.out.println("image1.getOriginalFilename() : " + image1.getOriginalFilename());
			System.out.println("이미지1 업로드 실패");
		}
	}

	public MultipartFile getImage2() {
		return image2;
	}

	public void setImage2(MultipartFile image2) {
		this.image2 = image2;
		if(this.image2 != null) {// 이미지2 업로드 실패시
			System.out.println("image2.getName() : " + image2.getName());
			System.out.println("image2.getOriginalFilename() : " + image2.getOriginalFilename());
			System.out.println("이미지2 업로드 실패");
		}
	}

	public MultipartFile getImage3() {
		return image3;
	}

	public void setImage3(MultipartFile image3) {
		this.image3 = image3;
		if(this.image3 != null) {// 이미지 업로드 실패시
			System.out.println("image3.getName() : " + image3.getName());
			System.out.println("image3.getOriginalFilename() : " + image3.getOriginalFilename());
			System.out.println("이미지3 업로드 실패");
		}
	}

	public MultipartFile getImage4() {
		return image4;
	}

	public void setImage4(MultipartFile image4) {
		this.image4 = image4;
		if(this.image4 != null) {// 이미지 업로드 실패시
			System.out.println("image4.getName() : " + image4.getName());
			System.out.println("image4.getOriginalFilename() : " + image4.getOriginalFilename());
			System.out.println("이미지4 업로드 실패");
		}
	}

	public Timestamp getInputdate() {
		return inputdate;
	}

	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}

	public Recipe(String recnum, String writer, String psubject, String intro, MultipartFile mainimage, int kind,
			int situation, int method, int ingredient, String person, String time, String movieurl, int scrap,
			MultipartFile image1, MultipartFile image2, MultipartFile image3, MultipartFile image4, Timestamp inputdate) {
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
		this.time = time;
		this.movieurl = movieurl;
		this.scrap = scrap;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.inputdate = inputdate;
	}

}
/*create table recipe(
		   recnum      number primary key,   
		   writer      varchar2(30) references allmember(id) on delete set null,
		   psubject   varchar2(60) default '제목없음',
		   intro      varchar2(2000),      --소개
		   mainimage   varchar2(40),      --대문이미지
		   kind       number,            --종류   
		   situation   number,            --상황
		   method      number,            --방법
		   ingredient   number,            --재료
		   person      varchar2(20),      --인원수
		   time      varchar2(20),      --요리시간
		   movieurl   varchar2(60),      --동영상 링크주소
		   scrap      number default 0,   --스크랩수
		   image1      varchar2(40),      -- 이미지1
		   image2      varchar2(40),      -- 이미지2
		   image3      varchar2(40),      -- 이미지3
		   image4      varchar2(40),      -- 이미지4
		   inputdate   date default sysdate -- 작성일
		);
*/