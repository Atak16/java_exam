package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.management.ObjectName;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Exam3 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "akhd0416";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = "※️ここにSQL文を書く";
			select karamu
			from tablea
			inner join tableb on tablea.id = tableb.id

			select test_members AS a inner join test_department AS b on a.dep_id = b.id
			// ONは２つのテーブルの結合部にあたるカラムを指定する
			// ２つのカラムの値が同じレコード同士が結合する

			rs.getInt("id");  a.id = test_members.id
			rs.getString("name"); a.name = test_members.name
			rs.getInt("age"); a.age = test_members.age
			rs.getInt("dep_name"); dep_name = b.name = test_department.name

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く

			// (5)結果の操作
			// ※ここに結果の操作処理を書
			

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			// (6) メモリの解放(切断)
			try {
				con.close();
			} catch (Exception ex) {
			}
			try {
				pstmt.close();
			} catch (Exception ex) {
			}
		}
	}
}
