package com.internousdev.bookShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.bookShop.dto.AuthorItemDTO;
import com.internousdev.bookShop.util.DBConnector;

public class AuthorDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private List<AuthorItemDTO> authorItemDTOList;


	private AuthorItemDTO authorItemDTO=new AuthorItemDTO();



	/**
	 * 著者情報取得メソッド
	 * @return
	 */
	public List<AuthorItemDTO> getAuthorInfo() {
		String sql="select id,author_name,author_year,author_biography from author_info_transaction";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();


			authorItemDTOList=new ArrayList<AuthorItemDTO>();

			while(rs.next()){

				authorItemDTO=new AuthorItemDTO();

				authorItemDTO.setId(rs.getInt("id"));
				authorItemDTO.setAuthorName(rs.getString("author_name"));
				authorItemDTO.setAuthorYear(rs.getString("author_year"));
				authorItemDTO.setAuthorBiography(rs.getString("author_biography"));
				authorItemDTOList.add(authorItemDTO);
			}
			}catch(Exception e){
				e.printStackTrace();
			}
			return authorItemDTOList;

		}

	/**
	 * 著者詳細情報取得メソッド
	 * @return
	 */
	public List<AuthorItemDTO> getAuthorInfoDetail(String authorName){

	//
		String sql="select i.id,a.author_name,a.author_year,a.author_biography,i.item_name,i.item_price,i.item_img from author_info_transaction a left join item_info_transaction i on a.author_name=i.item_author where author_name=?";
		//String sql="select * from author_info_transaction where author_name=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,authorName);

		ResultSet rs=ps.executeQuery();

		authorItemDTOList=new ArrayList<AuthorItemDTO>();

		while(rs.next()){
			AuthorItemDTO dto=new AuthorItemDTO();
			dto.setId(rs.getInt("id"));
			dto.setAuthorName(rs.getString("author_name"));
			dto.setAuthorYear(rs.getString("author_year"));
			dto.setAuthorBiography(rs.getString("author_biography"));
			dto.setItemName(rs.getString("item_name"));
			dto.setItemPrice(rs.getString("item_price"));
			dto.setItemImg(rs.getString("item_img"));
			System.out.println(dto.getId());
			System.out.println(dto.getAuthorName());
			System.out.println(dto.getAuthorYear());
			System.out.println(dto.getItemPrice());
			authorItemDTOList.add(dto);
	}
	}catch(Exception e){
		e.printStackTrace();;
	}
	return authorItemDTOList;
}



}
