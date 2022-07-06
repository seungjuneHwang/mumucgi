package dao;

import java.util.List;

import dto.Menu;

public interface MenuDao {
	// 각각의 메소드
	// insert
	public void insert(Menu menu);
	// select
	public List<Menu> selectAll();
	// selectBest
	public Menu selectBest();
	// update
	public void update(Menu menu);
	// delete
	public void delete(int id);
}
