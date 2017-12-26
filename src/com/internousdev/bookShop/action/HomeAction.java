package com.internousdev.bookShop.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dao.AuthorDAO;
import com.internousdev.bookShop.dao.BuyItemDAO;
import com.internousdev.bookShop.dto.AuthorItemDTO;
import com.internousdev.bookShop.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	//ログイン情報格納
	private Map<String,Object>session;

	//商品情報格納
	private List<BuyItemDTO> buyItemDTOList=new ArrayList<BuyItemDTO>();

	//著者情報格納
	private List<AuthorItemDTO> authorItemDTOList=new ArrayList<>();

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ移行
	 */
	public String execute(){
		String result="login";
		if(session.containsKey("id")){

			//アイテム情報を取得
			BuyItemDAO buyItemDAO=new BuyItemDAO();
			buyItemDTOList=buyItemDAO.getBuyItemInfo();
			session.put("buyItemDTOList",buyItemDTOList);

			//著者情報を取得
			AuthorDAO authorDAO=new AuthorDAO();
			authorItemDTOList=authorDAO.getAuthorInfo();
			session.put("authorItemDTOList", authorItemDTOList);

			result=SUCCESS;
		}
		return result;
	}


	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public List<AuthorItemDTO> getAuthorItemDTOList() {
		return authorItemDTOList;
	}


	public void setAuthorItemDTOList(List<AuthorItemDTO> authorItemDTOList) {
		this.authorItemDTOList = authorItemDTOList;
	}
}
