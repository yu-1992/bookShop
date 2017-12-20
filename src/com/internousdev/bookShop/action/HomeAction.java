package com.internousdev.bookShop.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dao.BuyItemDAO;
import com.internousdev.bookShop.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;

	private List<BuyItemDTO> buyItemDTOList=new ArrayList<BuyItemDTO>();

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ移行
	 */
	public String execute(){
		String result="login";
		if(session.containsKey("login_id")){
			//アイテム情報を取得


			BuyItemDAO buyItemDAO=new BuyItemDAO();
			buyItemDTOList=buyItemDAO.getBuyItemInfo();
			/*
			 * session.put("id", buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_author",buyItemDTO.getItemAuthor());
			session.put("buyItem_price",buyItemDTO.getItemPrice());
			*/
//			session.put("buyItemDTOList",buyItemDTO);

			//System.out.println();

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


}
