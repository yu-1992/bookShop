package com.internousdev.bookShop.dto;

/**
 * 著者情報一覧
 * @author yu
 *
 */

public class AuthorItemDTO {

	//商品id
	private int id;

	//著者
	private String authorName;

	//出生
	private String authorYear;

	//略歴
	private String authorBiography;

	//商品名
	private String itemName;

	//商品価格
	private String itemPrice;

	//商品イメージ
	private String itemImg;


	//購入個数
	private int count;

	//支払い方法
	private String pay;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorYear() {
		return authorYear;
	}

	public void setAuthorYear(String authorYear) {
		this.authorYear = authorYear;
	}

	public String getAuthorBiography() {
		return authorBiography;
	}

	public void setAuthorBiography(String authorBiography) {
		this.authorBiography = authorBiography;
	}



	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemImg() {
		return itemImg;
	}

	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



}
