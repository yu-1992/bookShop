package com.internousdev.bookShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bookShop.dto.MyPageDTO;
import com.internousdev.bookShop.util.DBConnector;

public class MyPageDAO {
	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	/**
	 * 商品履歴取得
	 *
	 */
	public ArrayList<MyPageDTO> getMyPageUserInfo(String user_master_id)throws SQLException{
	ArrayList<MyPageDTO> myPageDTOList=new ArrayList<MyPageDTO>();

	String sql="select ubit.id,iit.item_name,ubit.total_price,ubit.total_count,ubit.pay,ubit.item_author,ubit.item_img,ubit.insert_date from user_buy_item_transaction ubit left join item_info_transaction iit on ubit.item_transaction_id=iit.id where user_master_id=? order by insert_date desc";

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, user_master_id);

		ResultSet rs=ps.executeQuery();

		while(rs.next()){
			MyPageDTO dto=new MyPageDTO();
			dto.setId(rs.getString("id"));
			dto.setItemName(rs.getString("item_name"));
			dto.setTotalPrice(rs.getString("total_price"));
			dto.setTotalCount(rs.getString("total_count"));
			dto.setPayment(rs.getString("pay"));
			dto.setItemAuthor(rs.getString("item_author"));
			dto.setItemImg(rs.getString("item_img"));
			dto.setInsert_date(rs.getString("insert_date"));
			myPageDTOList.add(dto);
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return myPageDTOList;
	}

	/**
	 * 商品履歴削除
	 */
	public int buyItemHistoryDelete(String user_master_id) throws SQLException{

		String sql="delete from user_buy_item_transaction where user_master_id=?";
		int result=0;
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, user_master_id);

			//削除された数が返る
			result=ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

}
