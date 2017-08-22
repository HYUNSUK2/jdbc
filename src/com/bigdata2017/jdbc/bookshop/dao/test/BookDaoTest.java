package com.bigdata2017.jdbc.bookshop.dao.test;

import com.bigdata2017.jdbc.bookshop.dao.BookDao;
import com.bigdata2017.jdbc.bookshop.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static void insertTest() {
		BookDao dao = new BookDao();
		
		BookVo vo = new BookVo();
		vo.setTitle( "트와일라잇" );
		vo.setAuthorNo( 1L );
		vo.setState( "대여가능" );
		dao.insert(vo);
	}
}
