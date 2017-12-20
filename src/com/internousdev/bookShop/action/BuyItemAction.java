package com.internousdev.bookShop.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	//商品情報
	private List<BuyItemDTO> buyItemDTOList=new ArrayList<>();

	//アイテム購入個数
	private List <Integer> count;

	//支払い方法
	private String pay;

	//アイテム情報を格納
	private Map<String,Object>session;

	private List<String> itemNames;

	private List<String> itemAuthors;

	private List<String> itemImgs;

	private List<String> itemPrices;


	/**
	 * 商品情報取得メソッド
	 */
	public String execute(){
		String result=SUCCESS;
		System.out.println("カウント数："+count.size());

		session.put("count", count);
		@SuppressWarnings("unchecked")
		List<BuyItemDTO> list=(List<BuyItemDTO>) session.get("buyItemDTOList");

		//for文でcount.sizeだけ回す。
		for(int i=0; i<count.size(); i++){
			/**
			 * 購入個数がゼロでなかったなら、
			 * buyItemDTOに、jspから受け取った値をセットして、
			 * 合計金額("total_price")をセッションに保存。
			 */
			if(count.get(i) > 0) {
				System.out.println("てすとおおおおおおおおおお："+itemNames.get(i));
				//BuyItemDTOの初期化

				BuyItemDTO buyItemDTO=new BuyItemDTO();


				/**
				 * i番目のIDをリストから取得
				 */
				int buyItemId=list.get(i).getId();
				session.put("itemId",buyItemId);
				buyItemDTO.setId(list.get(i).getId());
				System.out.println(buyItemId);

				/**
				 * i番目の商品名を
				 * hiddenタグで飛ばしたリストitemNamesを取得し、
				 * セッションに保存
				 */
				//String buyItemName=list.get(i).getItemName();
				String buyItemNames=itemNames.get(i);
				session.put("itemNames",buyItemNames);
				System.out.println(buyItemNames);

				/**
				 * i番目の著者を取得し、セッションに保存
				 */
				//String buyItemAuthor=list.get(i).getItemAuthor();
				//session.put("itemAuthor",buyItemAuthor);
				String buyItemAuthors=itemAuthors.get(i);
				session.put("itemAuthors",buyItemAuthors);
				System.out.println(buyItemAuthors);

				/**
				 * i番目のイメージを取得し、セッションに保存
				 */
				String buyItemImgs=itemImgs.get(i);
				session.put("itemImgs", buyItemImgs);
				System.out.println(buyItemImgs);

				/**
				 *i番目の価格を取得し、セッションに保存
				 */
				String buyItemPrices=itemPrices.get(i);
				session.put("itemPrices",buyItemPrices);
				System.out.println(buyItemPrices);


				int intCount=count.get(i);
				int intPrice=Integer.parseInt(list.get(i).getItemPrice());

				/**
				 * 合計金額("total_price")をセッションに保存。
				 */
				//buyItemDTO.setId((int) session.get("id"));
				buyItemDTO.setItemName(itemNames.get(i));
				buyItemDTO.setItemAuthor(itemAuthors.get(i));
				buyItemDTO.setItemImg(itemImgs.get(i));
				buyItemDTO.setItemPrice(itemPrices.get(i));
				//buyItemDTO.setItemAuthor(session.get("itemAuthor").toString());
				//buyItemDTO.setItemPrice(session.get("itemPrice").toString());
				buyItemDTO.setCount(intCount);
				buyItemDTO.setTotalPrice(intCount*intPrice);

				session.put("totalPrice",intCount*intPrice);

				buyItemDTOList.add(buyItemDTO);
			}
		}

		//buyItemDTOListをセッションに保存。
		session.put("list",buyItemDTOList);

		//支払い方法を選択し、buyItemDTOListにbuyItemDTOを追加。
		String payment;
		if(pay.equals("1")){
			payment="現金払い";
			session.put("pay",payment);
		}else{
			payment="クレジットカード";
			session.put("pay",payment);
		}
		return result;
	}



public List<BuyItemDTO> getBuyItemDTOList() {
	return buyItemDTOList;
}


public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
	this.buyItemDTOList = buyItemDTOList;
}




public String getPay() {
	return pay;
}


public void setPay(String pay) {
	this.pay = pay;
}


public Map<String, Object> getSession() {
	return session;
}


public void setSession(Map<String, Object> session) {
	this.session = session;
}


public List<String> getItemNames() {
	return itemNames;
}


public void setItemNames(List<String> itemNames) {
	this.itemNames = itemNames;
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



public List<Integer> getCount() {
	return count;
}



public void setCount(List<Integer> count) {
	this.count = count;
}




}
