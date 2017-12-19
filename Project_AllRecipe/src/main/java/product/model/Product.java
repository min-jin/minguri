package product.model;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class Product {
	private int pnum;
	
	@NotEmpty(message = "제품 이름 입력해야함")
	private String pname;
	
	private String capacity;
	
	@NotNull(message = "가격 입력해야 함")
	private int price;
	
	@NotNull(message = "물건 재고 입력해야 함")
	private int stock;
	private String company;
	
	@NotEmpty(message = "원산지 입력해야 함")
	private String origin;
	private String pimage;
	private MultipartFile uploadpimage;
	private Timestamp inputdate;
	
	public Product() {
		super();
	}
	
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public Timestamp getInputdate() {
		return inputdate;
	}
	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}
	
	public void setUploadpimage(MultipartFile uploadpimage) {
		
		this.uploadpimage = uploadpimage;
		
		if(this.uploadpimage != null) {
			this.pimage = this.uploadpimage.getOriginalFilename();
		}
	}
	
	public MultipartFile getUploadpimage() {
		
		return uploadpimage;
	}
	
	@Override
	public String toString() {
		return "Product [pnum=" + pnum + ", pname=" + pname + ", capacity=" + capacity + ", price=" + price + ", stock="
				+ stock + ", company=" + company + ", origin=" + origin + ", pimage=" + pimage + ", inputdate="
				+ inputdate + "]";
	}
	
}
