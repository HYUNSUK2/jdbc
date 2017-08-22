package com.bigdata2017.jdbc.bookshop.dao.test;

import java.util.List;

import com.bigdata2017.jdbc.bookshop.dao.AuthorDao;
import com.bigdata2017.jdbc.bookshop.vo.AuthorVo;

public class AuthorDaoTest {

	public static void main(String[] args) {
		//testInsert();
		testGetList();
	}
	
	public static void testGetList() {
		AuthorDao dao = new AuthorDao();
		List<AuthorVo> list = dao.getList();
		for( AuthorVo vo : list ) {
			System.out.println( vo );
		}
	}
	
	public static void testInsert() {
		AuthorVo vo = new AuthorVo();
		vo.setName( "맹자" );
		vo.setProfile( "...." );
		
		new AuthorDao().insert(vo);
	}

}
