package com.internousdev.bookShop.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.bookShop.dao.BuyItemCompleteDAO;

public class BuyItemConfirmAction {


	// 購入情報を格納
	private Map<String,Object> session;

	private BuyItemCompleteDAO buyItemCompleteDAO=new BuyItemCompleteDAO();

	/**
	 * 商品購入情報登録メソッド
	 *
	 */
	public String exucute() throws SQLException{

		buyItemCompleteDAO.buyItemInfo()


	}



}
