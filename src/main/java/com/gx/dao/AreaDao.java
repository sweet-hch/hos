package com.gx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.gx.entity.Area;

public class AreaDao {
	private DataSource ar;

	public DataSource getDatasource() {
		return ar;
	}

	public void setDatasource(DataSource datasource) {
		this.ar = ar;
	}
	
	public List<Area> queryAll() {
        java.sql.Connection conn = null;
        PreparedStatement ppst = null;
        ResultSet rs = null;
        try {
            conn = ar.getConnection();
            ppst = conn.prepareStatement("select * from area");
            rs = ppst.executeQuery();
            List<Area> list = new ArrayList<Area>();
            while (rs.next()) {
           	 System.out.println(rs.getString(1));
            }
            return list;

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

        return null;
    }

}
