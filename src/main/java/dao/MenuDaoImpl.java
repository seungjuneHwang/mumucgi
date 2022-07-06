package dao;

import java.sql.*;
import java.util.List;

import dto.Menu;

public class MenuDaoImpl implements MenuDao {
    final String driver = "org.mariadb.jdbc.Driver";
    final String DB_IP = "localhost";
    final String DB_PORT = "3306";
    final String DB_NAME = "mydb";
    final String DB_USER = "root";
    final String DB_PASS = "1234";
    final String DB_URL =
            "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;
    
    private Connection conn;
    
	public MenuDaoImpl() {
		System.out.println("MenuDaoImpl 생성 되자 마자 디비 연결");
		try {
            Class.forName(driver);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            if (conn != null) {
                System.out.println("DB 접속 성공");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 접속 실패");
            e.printStackTrace();
        }
	}

	

	@Override
	public void insert(Menu menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Menu> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu selectBest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Menu menu) {
		 //쿼리문 준비
        String sql = "UPDATE `tb_menu` SET `menu`=?, `price`=? WHERE `id`= ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, menu.getMenu());
            pstmt.setInt(2, menu.getPrice());
            pstmt.setInt(3, menu.getId());

            int result = pstmt.executeUpdate();
            if (result == 1) {
                System.out.println("데이터 수정 성공!");
            }

        } catch (Exception e) {
            System.out.println("데이터 수정 실패!");
        } finally {
            try {
                if (pstmt != null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
