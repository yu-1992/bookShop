package com.internousdev.bookShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.internousdev.bookShop.dto.BuyItemDTO;
import com.internousdev.bookShop.util.DBConnector;
import com.internousdev.bookShop.util.DateUtil;

public class BuyItemCompleteDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private DateUtil dateUtil=new DateUtil();

	private List<BuyItemDTO> buyItemDTOList;

	private String sql="insert into user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date";


	/**
	 * 商品購入情報登録メソッド
	 */
	public void buyItemInfo(String item_transaction_id,String total_price,String total_count,String user_master_id,String pay)throws SQLException{

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			for(int i=0; i<buyItemDTOList.size(); i++){
				ps.setString(1, item_transaction_id);
				ps.setString(2, total_price);
				ps.setString(3, total_count);
				ps.setString(4, user_master_id);
				ps.setString(5, pay);
				ps.setString(6, dateUtil.getDate());

				ps.executeUpdate();
			}

			}catch(Exception e){
				e.printStackTrace();;
			}finally{
				con.close();
			}

		}
	}

