package com.internousdev.bookShop.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	//購入商品情報
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

	private List<Integer> itemPrices;

	private List<Integer> ids;

	private List<Integer> counts;


	/**
	 * 商品情報取得メソッド
	 */
	public String execute(){
		String result=SUCCESS;

		//ログイン状態になければERRORを返してerror.jspを表示
		if(!session.containsKey("login_id")){
				return ERROR;
			}

		//商品一覧情報をセッションから呼び出す
	//	@SuppressWarnings("unchecked")
		//List<BuyItemDTO> list=(List<BuyItemDTO>) session.get("buyItemDTOList");

		//for文でcount.size()分だけ回す。
		for(int i=0; i<counts.size(); i++){

			System.out.println(counts.size());
			/**
			 * 購入個数がゼロでなかったなら、
			 * buyItemDTOに、jspから受け取った値をセットして、
			 * 合計金額("total_price")をセッションに保存。
			 */
			if(counts.get(i) > 0) {

				//BuyItemDTOの初期化
				BuyItemDTO buyItemDTO=new BuyItemDTO();

				//i番目のIDをリストから取得
				//int Id=ids.get(i);
				//session.put("itemId",buyItemId);

				//i番目の購入個数、金額を取得し、int型に変換
				//int intCount=count.get(i);
				//int intPrice=Integer.parseInt(list.get(i).getItemPrice());

				//i番目の商品情報をDTOにセット
				buyItemDTO.setId(ids.get(i));
				buyItemDTO.setItemName(itemNames.get(i));
				buyItemDTO.setItemAuthor(itemAuthors.get(i));
				buyItemDTO.setItemImg(itemImgs.get(i));
				buyItemDTO.setItemPrice(itemPrices.get(i));
				buyItemDTO.setCount(counts.get(i));
				buyItemDTO.setTotalPrice(counts.get(i)*itemPrices.get(i));
				System.out.println(buyItemDTO.getId());
				System.out.println(buyItemDTO.getItemName());
				System.out.println(buyItemDTO.getItemAuthor());
				System.out.println(buyItemDTO.getItemImg());
				System.out.println(buyItemDTO.getItemPrice());
				System.out.println(buyItemDTO.getCount());
				System.out.println(buyItemDTO.getTotalPrice());
				//DTOにセットしたi番目の商品情報をbuyItemDTOListに追加
				buyItemDTOList.add(buyItemDTO);
			}

		//buyItemDTOListをセッションに保存。
		session.put("list",buyItemDTOList);

		//支払い方法を選択し、セッションに保存
		String payment;
		if(pay.equals("1")){
			payment="現金払い";
			session.put("pay",payment);
		}else{
			payment="クレジットカード";
			session.put("pay",payment);
		}
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



public List<Integer> getCount() {
	return count;
}



public void setCount(List<Integer> count) {
	this.count = count;
}



public List<Integer> getIds() {
	return ids;
}



public void setIds(List<Integer> ids) {
	this.ids = ids;
}



public List<Integer> getCounts() {
	return counts;
}



public void setCounts(List<Integer> counts) {
	this.counts = counts;
}



public List<Integer> getItemPrices() {
	return itemPrices;
}



public void setItemPrices(List<Integer> itemPrices) {
	this.itemPrices = itemPrices;
}






}
