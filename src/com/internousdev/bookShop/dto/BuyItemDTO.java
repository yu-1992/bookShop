package com.internousdev.bookShop.dto;

import java.util.List;

/**
 * 購入商品情報DTO
 * @author yuu
 *
 */

public class BuyItemDTO {

	//商品ID
	private int id;

	private List<Integer> ids;

	//商品名
	private String itemName;

	private List<String> itemNames;

	//商品価格
	private int itemPrice;

	private List<Integer> itemPrices;

	//著者
	private String itemAuthor;

	private List<String> itemAuthors;

	//商品イメージ
	private String itemImg;

	private List<String> itemImgs;

	//購入個数
	private int count;

	private List<Integer> counts;

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



	public List<Integer> getTotalPrices() {
		return totalPrices;
	}

	public void setTotalPrices(List<Integer> totalPrices) {
		this.totalPrices = totalPrices;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public List<Integer> getItemPrices() {
		return itemPrices;
	}

	public void setItemPrices(List<Integer> itemPrices) {
		this.itemPrices = itemPrices;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public List<Integer> getCounts() {
		return counts;
	}

	public void setCounts(List<Integer> counts) {
		this.counts = counts;
	}



}
