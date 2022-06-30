package com.java.cms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MenuDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Menu searchByMenuId(int menuId) {
		String cmd ="select * from Menu where MEN_ID=?";
		List<Menu> menuList = jdbcTemplate.query(cmd, new Object[] {menuId}, new RowMapper<Menu>() {

			@Override
			public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
				Menu menu = new Menu();
				menu.setMenuId(rs.getInt("Men_ID"));
				menu.setMenuItem(rs.getString("MEN_ITEM"));
				menu.setMenuPrice(rs.getDouble("MEN_PRICE"));
				menu.setMenuCalories(rs.getInt("MEN_CALORIES"));
				menu.setMenuSpeciality(rs.getString("MEN_SPECIALITY"));
				return menu;
			}
		});
		if (menuList.size()==1) {
			return menuList.get(0);
		}
		return null;
	}
	
	public List<Menu> showMenu() {
		String cmd ="select * from Menu";
		List<Menu> menuList = jdbcTemplate.query(cmd, new RowMapper<Menu>() {

			@Override
			public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
				Menu menu = new Menu();
				menu.setMenuId(rs.getInt("Men_ID"));
				menu.setMenuItem(rs.getString("MEN_ITEM"));
				menu.setMenuPrice(rs.getDouble("MEN_PRICE"));
				menu.setMenuCalories(rs.getInt("MEN_CALORIES"));
				menu.setMenuSpeciality(rs.getString("MEN_SPECIALITY"));
				return menu;
			}
		});
		return menuList;
	}
}
