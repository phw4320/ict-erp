/*package test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.MenuDAO;
import com.ict.erp.dao.impl.MenuDAOImpl;
import com.ict.erp.vo.MenuInfo;

class MenuCRUD {
	static private MenuDAO mdao;
	@BeforeAll
	public static void init() {
		System.out.println("�뀒�뒪�듃 �떆�옉");
		mdao = new MenuDAOImpl();
		mdao.setConnection(DBCon.getCon());
	}
	@Test
	public void insertMenu() throws SQLException {
		System.out.println("�뀒�뒪�듃 �닔�뻾");
		MenuInfo mi = new MenuInfo(null,"六ъ뎽",20000l,"寃곷궡 �뼹�겙�븿.");
		assertEquals(1, mdao.insertMenu(mi));
	}
	@Test
	public void deleteMenu() throws SQLException {
		System.out.println("�뀒�뒪�듃 �닔�뻾");
		MenuInfo mi = new MenuInfo(null,"六ъ뎽",20000l,"寃곷궡 �뼹�겙�븿.");
		assertEquals(1, mdao.deleteMenu(mi));
	}
	@AfterAll
	public static void finish() {
		DBCon.commit();
		DBCon.close();
		System.out.println("�뀒�뒪�듃 醫낅즺");
	}

}
*/