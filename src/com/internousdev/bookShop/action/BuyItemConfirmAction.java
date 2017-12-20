package com.internousdev.bookShop.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dao.BuyItemCompleteDAO;
import com.internousdev.bookShop.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{


	// 購入情報を格納
	private Map<String,Object> session;

	private List<BuyItemDTO> buyItemDTOList=new ArrayList<>();

	private BuyItemCompleteDAO buyItemCompleteDAO=new BuyItemCompleteDAO();

	private List<String>itemNames;

	private List<String>itemImgs;

	private List<String>itemAuthors;

	private List<Integer>count;

	private List<Integer>totalPrices;

	/**
	 * 商品購入情報登録メソッド
	 *
	 */

	@SuppressWarnings("unchecked")
	public String execute() throws SQLException{

		buyItemDTOList=(ArrayList<BuyItemDTO>) session.get("list");
		System.out.println(buyItemDTOList.size());


		for(int i=0; i<buyItemDTOList.size(); i++){


		/**
		 * i番目のID名をbuyItemDTOListから取得
		 * String型に変換
		 */
		int id=buyItemDTOList.get(i).getId();
		String intId=Integer.toString(id);

		/**
		 * i番目の商品名
		 * hiddenで飛ばした値を受け取る
		 */
		String itemName=itemNames.get(i);

		/**
		 * i番目のトータルプライスを
		 * buyItemConfirm.jspからhiddenで飛ばした値
		 * を受け取りString型に
		 */
		String totalPrice=String.valueOf(totalPrices.get(i));

		//i番目の個数をbuyItemDTOListから取得
		//String型に変換
		int count=buyItemDTOList.get(i).getCount();
		String intCount=Integer.toString(count);

		//i番目の著者
		String itemAuthor=itemAuthors.get(i);

		//ログインIDをセッションから受け取る
		String userId=session.get("login_id").toString();

		//支払い方法をセッションから受け取る
		String pay=session.get("pay").toString();
		//String pay=buyItemDTOList.get(i).getPay();

		//i番目の表紙画像をbuyItemConfirm.jspから受け取る
		String itemImg=itemImgs.get(i);


		System.out.println("BuyItemComfirmActionのテスト！！");
		System.out.println(intId);
		System.out.println(itemName);
		System.out.println(totalPrice);
		System.out.println(intCount);
		System.out.println(itemAuthor);
		System.out.println(userId);
		System.out.println(pay);
		System.out.println(itemImg);

		BuyItemCompleteDAO buyItemCompleteDAO=new BuyItemCompleteDAO();

		buyItemCompleteDAO.buyItemInfo(intId, totalPrice, intCount, itemAuthor,itemImg, userId, pay);

		}

		String result=SUCCESS;
		return result;


		}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public BuyItemCompleteDAO getBuyItemCompleteDAO() {
		return buyItemCompleteDAO;
	}

	public void setBuyItemCompleteDAO(BuyItemCompleteDAO buyItemCompleteDAO) {
		this.buyItemCompleteDAO = buyItemCompleteDAO;
	}







	public List<String> getItemNames() {
		return itemNames;
	}


	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}


	public List<String> getItemImgs() {
		return itemImgs;
	}


	public void setItemImgs(List<String> itemImgs) {
		this.itemImgs = itemImgs;
	}


	public List<String> getItemAuthors() {
		return itemAuthors;
	}


	public void setItemAuthors(List<String> itemAuthors) {
		this.itemAuthors = itemAuthors;
	}


	public List<Integer> getCount() {
		return count;
	}


	public void setCount(List<Integer> count) {
		this.count = count;
	}


	public List<Integer> getTotalPrices() {
		return totalPrices;
	}


	public void setTotalPrices(List<Integer> totalPrices) {
		this.totalPrices = totalPrices;
	}


	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}


	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}





}

