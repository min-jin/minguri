package product.model;

import java.sql.Timestamp;

public class Product {
	private int pnum;
	private String pname;
	private String capacity;
	private int price;
	private int stock;
	private String company;
	private String origin;
	private String pimage;
	private Timestamp inputdate;
	public Product() {
		super();
	}
	public Product(int pnum, String pname, String capacity, int price, int stock, String company, String origin,
			String pimage, Timestamp inputdate) {
		super();
		this.pnum = pnum;
		this.pname = pname;
		this.capacity = capacity;
		this.price = price;
		this.stock = stock;
		this.company = company;
		this.origin = origin;
		this.pimage = pimage;
		this.inputdate = inputdate;
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
	@Override
	public String toString() {
		return "Product [pnum=" + pnum + ", pname=" + pname + ", capacity=" + capacity + ", price=" + price + ", stock="
				+ stock + ", company=" + company + ", origin=" + origin + ", pimage=" + pimage + ", inputdate="
				+ inputdate + "]";
	}
	
}
