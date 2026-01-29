package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;
import exam.InsertMain;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	private static final String TABLE_NAME = "test_members";
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "select id, name, age, dep_id from " + TABLE_NAME;
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに全件検索処理を書く
			ResultSet rs = pstmt.executeQuery(); // SQLの実行
			while (rs.next()) {
            	Member member = new Member();
            	member.setId(rs.getInt("id"));
            	member.setName(rs.getString("name"));
            	member.setAge(rs.getInt("age"));
            	member.setDepId(rs.getInt("dep_id"));
				System.out.println(member);
			}
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member load(int id){
		// List<InsertMain> = ArrayList();
		Connection con = DBManager.createConnection();
		String sql = "select id, name, age, dep_id from " + TABLE_NAME + " where id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Member member = new Member();
            	member.setId(rs.getInt("id"));
            	member.setName(rs.getString("name"));
            	member.setAge(rs.getInt("age"));
            	member.setDepId(rs.getInt("dep_id"));
				System.out.println(member);
			}
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "insert into members(id, name, age, dep_id) values(?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く
			pstmt.setInt(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setInt(3, member.getAge());
			pstmt.setInt(4, member.getDepId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

}
