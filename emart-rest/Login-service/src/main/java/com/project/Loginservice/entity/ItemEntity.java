package com.project.Loginservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_table")
public class ItemEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int id;
	
	@Column(name = "item_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private SellerSignupEntity sellerId;
	
	@ManyToOne
	@JoinColumn(name = "subcategory_id")
	private SubCategoryEntity subcategory;
	
	@Column(name = "item_price")
	private int price;
	
	@Column(name = "item_description")
	private String description;
	
	@Column(name = "item_stock")
	private int stock;
	
	@Column(name = "item_remarks")
	private String remarks;
	
	@Column(name = "item_image")
	private String image;

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

	public SellerSignupEntity getSellerId() {
		return sellerId;
	}

	public void setSellerId(SellerSignupEntity sellerId) {
		this.sellerId = sellerId;
	}

	public SubCategoryEntity getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(SubCategoryEntity subcategory) {
		this.subcategory = subcategory;
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

	public ItemEntity(int id, String name, SellerSignupEntity sellerId, SubCategoryEntity subcategory, int price,
			String description, int stock, String remarks, String image) {
		super();
		this.id = id;
		this.name = name;
		this.sellerId = sellerId;
		this.subcategory = subcategory;
		this.price = price;
		this.description = description;
		this.stock = stock;
		this.remarks = remarks;
		this.image = image;
	}

	public ItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	

}
