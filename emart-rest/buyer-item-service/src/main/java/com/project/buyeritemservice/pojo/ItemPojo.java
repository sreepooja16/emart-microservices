package com.project.buyeritemservice.pojo;

public class ItemPojo {
	private int id;
	private String name;
	private SellerSignupPojo sellerId;
	private  SubCategoryPojo subCategory;
	private int price;
	private String description;
	private int stock;
	private String remarks;
	private String image;
	public ItemPojo(int id, String name, SellerSignupPojo sellerId, SubCategoryPojo subCategory, int price,
			String description, int stock, String remarks, String image) {
		super();
		this.id = id;
		this.name = name;
		this.sellerId = sellerId;
		this.subCategory = subCategory;
		this.price = price;
		this.description = description;
		this.stock = stock;
		this.remarks = remarks;
		this.image = image;
	}
	public ItemPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SellerSignupPojo getSellerId() {
		return sellerId;
	}
	public void setSellerId(SellerSignupPojo sellerId) {
		this.sellerId = sellerId;
	}
	public SubCategoryPojo getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(SubCategoryPojo subCategory) {
		this.subCategory = subCategory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
	
}


