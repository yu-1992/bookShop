package com.internousdev.bookShop.dto;

import java.util.List;

public class BuyItemDTO {

	//商品ID
	private int id;

	//商品名
	private String itemName;

	private List<String> itemNames;

	//商品価格
	private String itemPrice;

	private List<String> itemPrices;

	//著者
	private String itemAuthor;

	private List<String> itemAuthors;

	//商品イメージ
	private String itemImg;

	private List<String> itemImgs;

	//購入個数
	private int count;


	//支払い方法
	private String pay;

	//合計金額
	private int totalPrice;

	private List<Integer> totalPrices;




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemAuthor() {
		return itemAuthor;
	}

	public void setItemAuthor(String itemAuthor) {
		this.itemAuthor = itemAuthor;
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<String> getItemAuthors() {
		return itemAuthors;
	}

	public void setItemAuthors(List<String> itemAuthors) {
		this.itemAuthors = itemAuthors;
	}

	public List<String> getItemImgs() {
		return itemImgs;
	}

	public void setItemImgs(List<String> itemImgs) {
		this.itemImgs = itemImgs;
	}

	public List<String> getItemPrices() {
		return itemPrices;
	}

	public void setItemPrices(List<String> itemPrices) {
		this.itemPrices = itemPrices;
	}

	public List<Integer> getTotalPrices() {
		return totalPrices;
	}

	public void setTotalPrices(List<Integer> totalPrices) {
		this.totalPrices = totalPrices;
	}




}
