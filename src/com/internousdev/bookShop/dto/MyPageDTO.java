package com.internousdev.bookShop.dto;

public class MyPageDTO {

	private String itemName;

	private String itemAuthor;

	private String totalPrice;

	private String totalCount;

	private String payment;

	private String userName;

	private String itemImg;

	private String id;



	public String insert_date;


	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemAuthor() {
		return itemAuthor;
	}

	public void setItemAuthor(String itemAuthor) {
		this.itemAuthor = itemAuthor;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInsert_date() {
		return insert_date;
	}



	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public String getItemImg() {
		return itemImg;
	}

	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}
}
