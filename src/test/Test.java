package test;

import java.sql.SQLException;

import dao.DaoArticlesMySql;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("j'en ai marre !!!!!!!!!!!!!");

		testArticleMySql();
	}

	public static void testArticleMySql() throws ClassNotFoundException, SQLException {
		DaoArticlesMySql d1 = new DaoArticlesMySql();
		System.out.println(d1.findAll());
	};

}
