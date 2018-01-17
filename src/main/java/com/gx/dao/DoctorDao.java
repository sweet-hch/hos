package com.gx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DoctorDao {
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	public void getDoctor(){
		 java.sql.Connection conn = null;  //通道打通   Connection连接
         PreparedStatement ppst = null;    //派一个人去做事
         ResultSet rs = null;    //做事的结果什么样
         try {
             conn = ds.getConnection();  //获得ds（DataSource属性）的连接
             ppst = conn.prepareStatement("select * from doctor");  //ppst去做这件事情
             rs = ppst.executeQuery();  //ppts做的这件事情的结果返回给rs管理
             while (rs.next()) {   //循环遍历rs做的事情的结果      while（）表示如果括号里面为真则一直循环，while（rs.next）表示如果能读取rs的结果，则一直执行下去
            	 System.out.println(rs.getString(2));
             }
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             try {
                 rs.close();
                 ppst.close();
                 conn.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }

     }

		
	}
	
	

