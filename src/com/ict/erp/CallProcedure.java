package com.ict.erp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ict.erp.common.DBCon;

import oracle.jdbc.OracleTypes;

public class CallProcedure {
	public static void main(String[] args) {
		
		String sql = "{call p_get_emp_cur(?,?,?)}";
		Connection con = DBCon.getCon();
		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1, "KING");
			cs.setInt(2, 10);
			cs.registerOutParameter(3, OracleTypes.CURSOR);
			cs.executeQuery();
			ResultSet rs = (ResultSet)cs.getObject(3);
			while(rs.next()) {
				System.out.println(rs.getString("empname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
