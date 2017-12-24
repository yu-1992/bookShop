package com.internousdev.bookShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.bookShop.util.DBConnector;
import com.internousdev.bookShop.util.DateUtil;

public class BuyItemCompleteDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private DateUtil dateUtil=new DateUtil();

	private String sql="insert into user_buy_item_transaction(item_transaction_id,total_price,total_count,item_author,item_img,user_master_id,pay,insert_date) values(?,?,?,?,?,?,?,?)";


	/**
	 * 商品購入情報登録メソッド
	 */
	public void buyItemInfo(String item_transaction_id,String total_price,String total_count,String item_author,String item_img,String user_master_id,String pay)throws SQLException{

		try{
			PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, item_transaction_id);
				ps.setString(2, total_price);
				ps.setString(3, total_count);
				ps.setString(4, item_author);
				ps.setString(5,item_img);
				ps.setString(6, user_master_id);
				ps.setString(7, pay);
				ps.setString(8, dateUtil.getDate());

				ps.executeUpdate();

			}catch(Exception e){
				e.printStackTrace();;
			}finally{
				con.close();
			}

		}
	}

