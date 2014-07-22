package com.sdu.home.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sdu.home.dbtools.DatabaseConn;

public class ProjectManager {
	public static void main(String argsp[]){
		DatabaseConn dbconn = new DatabaseConn();
		Connection conn = dbconn.getConnection();
		ResultSet rs = null;
		PreparedStatement psmt = null;
		try{
			String nSci = "",yxyzSci = "",aYxyzSci = "",nAuthor = "",yxyzAuthor = "",nOnline = "",yxyzOnline = "",lwlx = "";
			String sqlStr = "SELECT LW_SCI_N,LW_SCI_LJYXYZ,LW_DPZGYZ,LW_BLDY_N,LW_BLDY_YXYZ,LW_ONLINE_N," +
					"LW_ONLINE_YXYZ,LW_LX,GC_RCYJ_KEY FROM GC_DBLWFB WHERE GC_RCYJ_KEY=?";
			psmt = conn.prepareStatement(sqlStr);
			psmt.setString(1, "850D4BBE103BA9D269C04F58A39D9076");
			rs = psmt.executeQuery();
			while(rs.next()){
				nSci = rs.getString(1);
				yxyzSci = rs.getString(2);
				aYxyzSci = rs.getString(3);
				nAuthor = rs.getString(4);
				yxyzAuthor = rs.getString(5);
				nOnline = rs.getString(6);
				yxyzOnline = rs.getString(7);
				lwlx = rs.getString(8);
			}
			System.out.println("½á¹û"+nSci);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}
}
