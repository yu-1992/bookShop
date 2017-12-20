package com.internousdev.bookShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.bookShop.dto.BuyItemDTO;
import com.internousdev.bookShop.util.DBConnector;


public class BuyItemDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private BuyItemDTO buyItemDTO;

	private List<BuyItemDTO> buyItemDTOList;

	/**
	 * 商品情報取得メソッド
	 */
	public List<BuyItemDTO> getBuyItemInfo(){

		String sql="select id,item_name,item_price,item_author,item_img from item_info_transaction";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			buyItemDTOList=new ArrayList<BuyItemDTO>();

			while(rs.next()){

				buyItemDTO=new BuyItemDTO();

				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
				buyItemDTO.setItemAuthor(rs.getString("item_author"));
				buyItemDTO.setItemImg(rs.getString("item_img"));
				buyItemDTOList.add(buyItemDTO);



				System.out.println(buyItemDTO.getId());
				System.out.println(buyItemDTO.getItemName());
				System.out.println(buyItemDTO.getItemPrice());
				System.out.println(buyItemDTO.getItemAuthor());
				System.out.println(buyItemDTO.getItemImg());

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buyItemDTOList;
	}

	public BuyItemDTO getBuyItemDTO(){
		return buyItemDTO;
	}

	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}


}
